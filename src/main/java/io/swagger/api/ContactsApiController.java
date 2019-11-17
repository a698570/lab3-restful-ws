package io.swagger.api;

import io.swagger.model.AddressBook;
import io.swagger.model.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-17T14:24:11.401Z[GMT]")
@Controller
public class ContactsApiController implements ContactsApi {

    // TODO: this needs a Spring bean or something to be sent to the Spring server
    @Inject
    io.swagger.model.AddressBook addressBook;

    private static final Logger log = LoggerFactory.getLogger(ContactsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ContactsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Person> addPerson(@ApiParam(value = "Person object that needs to be added" ,required=true )  @Valid @RequestBody Person person) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            addressBook.getPersonList().add(person);
            person.setId(addressBook.nextId());
            person.setHref("none");
            return new ResponseEntity<Person>(person, HttpStatus.CREATED);
        }

        return new ResponseEntity<Person>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletePerson(@ApiParam(value = "Person id to delete",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        for (int i = 0; i < addressBook.getPersonList().size(); i++) {
            if (addressBook.getPersonList().get(i).getId() == id) {
                addressBook.getPersonList().remove(i);
                return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
            }
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<AddressBook> getAddressBook() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AddressBook>(addressBook, HttpStatus.OK);
        }

        return new ResponseEntity<AddressBook>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Person> getPerson(@ApiParam(value = "ID of person to return",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            for (Person p : addressBook.getPersonList()) {
                if (p.getId() == id) {
                    return new ResponseEntity<Person>(p, HttpStatus.OK);
                }
            }
            return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Person>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Person> updatePerson(@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody Person person,@ApiParam(value = "id of person that needs to be updated",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            for (int i = 0; i < addressBook.getPersonList().size(); i++) {
                if (addressBook.getPersonList().get(i).getId() == id) {
                    person.setId(id);
                    person.setHref("none");
                    addressBook.getPersonList().set(i, person);
                    return new ResponseEntity<Person>(person, HttpStatus.OK);
                }
            }
            return new ResponseEntity<Person>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<Person>(HttpStatus.NOT_IMPLEMENTED);
    }

}

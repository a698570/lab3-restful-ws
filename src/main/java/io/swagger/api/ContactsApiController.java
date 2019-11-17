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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-17T14:24:11.401Z[GMT]")
@Controller
public class ContactsApiController implements ContactsApi {

    private static final Logger log = LoggerFactory.getLogger(ContactsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ContactsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Person> addPerson(@ApiParam(value = "Person object that needs to be added" ,required=true )  @Valid @RequestBody Person body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Person>(objectMapper.readValue("{\n  \"name\" : \"name\",\n  \"phoneList\" : [ {\n    \"number\" : \"number\",\n    \"type\" : \"MOBILE\"\n  }, {\n    \"number\" : \"number\",\n    \"type\" : \"MOBILE\"\n  } ],\n  \"id\" : 6,\n  \"href\" : \"http://example.com/aeiou\",\n  \"email\" : \"\"\n}", Person.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Person>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Person>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletePerson(@ApiParam(value = "Person id to delete",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AddressBook> getAddressBook() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AddressBook>(objectMapper.readValue("{\n  \"nextId\" : 0,\n  \"personList\" : [ {\n    \"name\" : \"name\",\n    \"phoneList\" : [ {\n      \"number\" : \"number\",\n      \"type\" : \"MOBILE\"\n    }, {\n      \"number\" : \"number\",\n      \"type\" : \"MOBILE\"\n    } ],\n    \"id\" : 6,\n    \"href\" : \"http://example.com/aeiou\",\n    \"email\" : \"\"\n  }, {\n    \"name\" : \"name\",\n    \"phoneList\" : [ {\n      \"number\" : \"number\",\n      \"type\" : \"MOBILE\"\n    }, {\n      \"number\" : \"number\",\n      \"type\" : \"MOBILE\"\n    } ],\n    \"id\" : 6,\n    \"href\" : \"http://example.com/aeiou\",\n    \"email\" : \"\"\n  } ]\n}", AddressBook.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AddressBook>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AddressBook>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Person> getPerson(@ApiParam(value = "ID of person to return",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Person>(objectMapper.readValue("{\n  \"name\" : \"name\",\n  \"phoneList\" : [ {\n    \"number\" : \"number\",\n    \"type\" : \"MOBILE\"\n  }, {\n    \"number\" : \"number\",\n    \"type\" : \"MOBILE\"\n  } ],\n  \"id\" : 6,\n  \"href\" : \"http://example.com/aeiou\",\n  \"email\" : \"\"\n}", Person.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Person>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Person>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Person> updatePerson(@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody Person body,@ApiParam(value = "id of person that needs to be updated",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Person>(objectMapper.readValue("{\n  \"name\" : \"name\",\n  \"phoneList\" : [ {\n    \"number\" : \"number\",\n    \"type\" : \"MOBILE\"\n  }, {\n    \"number\" : \"number\",\n    \"type\" : \"MOBILE\"\n  } ],\n  \"id\" : 6,\n  \"href\" : \"http://example.com/aeiou\",\n  \"email\" : \"\"\n}", Person.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Person>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Person>(HttpStatus.NOT_IMPLEMENTED);
    }

}

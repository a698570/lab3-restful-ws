package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AddressBook
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-17T14:24:11.401Z[GMT]")
public class AddressBook   {
  @JsonProperty("nextId")
  private Long nextId = null;

  @JsonProperty("personList")
  @Valid
  private List<Person> personList = null;

  public AddressBook nextId(Long nextId) {
    this.nextId = nextId;
    return this;
  }

  public Long nextId() {
    Long oldValue = nextId;
    nextId++;
    return oldValue;
  }

  /**
   * Get nextId
   * @return nextId
  **/
  @ApiModelProperty(value = "")
  
    public Long getNextId() {
    return nextId;
  }

  public void setNextId(Long nextId) {
    this.nextId = nextId;
  }

  public AddressBook personList(List<Person> personList) {
    this.personList = personList;
    return this;
  }

  public AddressBook addPersonListItem(Person personListItem) {
    if (this.personList == null) {
      this.personList = new ArrayList<Person>();
    }
    this.personList.add(personListItem);
    return this;
  }

  /**
   * Get personList
   * @return personList
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Person> getPersonList() {
    return personList;
  }

  public void setPersonList(List<Person> personList) {
    this.personList = personList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressBook addressBook = (AddressBook) o;
    return Objects.equals(this.nextId, addressBook.nextId) &&
        Objects.equals(this.personList, addressBook.personList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextId, personList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressBook {\n");
    
    sb.append("    nextId: ").append(toIndentedString(nextId)).append("\n");
    sb.append("    personList: ").append(toIndentedString(personList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

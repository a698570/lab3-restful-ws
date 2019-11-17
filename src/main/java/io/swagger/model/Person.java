package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PhoneNumber;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Person
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-17T14:24:11.401Z[GMT]")
public class Person   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("phoneList")
  @Valid
  private List<PhoneNumber> phoneList = null;

  public Person name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Person email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Person href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Person phoneList(List<PhoneNumber> phoneList) {
    this.phoneList = phoneList;
    return this;
  }

  public Person addPhoneListItem(PhoneNumber phoneListItem) {
    if (this.phoneList == null) {
      this.phoneList = new ArrayList<PhoneNumber>();
    }
    this.phoneList.add(phoneListItem);
    return this;
  }

  /**
   * Get phoneList
   * @return phoneList
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<PhoneNumber> getPhoneList() {
    return phoneList;
  }

  public void setPhoneList(List<PhoneNumber> phoneList) {
    this.phoneList = phoneList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.name, person.name) &&
        Objects.equals(this.id, person.id) &&
        Objects.equals(this.email, person.email) &&
        Objects.equals(this.href, person.href) &&
        Objects.equals(this.phoneList, person.phoneList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, email, href, phoneList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    phoneList: ").append(toIndentedString(phoneList)).append("\n");
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

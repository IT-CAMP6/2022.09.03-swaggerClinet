package pl.camp.it.rest.model;

import java.util.ArrayList;
import java.util.List;
import pl.camp.it.rest.model.UserDTO;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UsersResponse  {
  
  @ApiModelProperty(value = "")
  private List<UserDTO> users = null;
 /**
   * Get users
   * @return users
  **/
  @JsonProperty("users")
  public List<UserDTO> getUsers() {
    return users;
  }

  public void setUsers(List<UserDTO> users) {
    this.users = users;
  }

  public UsersResponse users(List<UserDTO> users) {
    this.users = users;
    return this;
  }

  public UsersResponse addUsersItem(UserDTO usersItem) {
    this.users.add(usersItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersResponse {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


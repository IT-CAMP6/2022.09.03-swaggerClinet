package pl.camp.it.rest.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pl.camp.it.rest.model.OrderPosition;
import pl.camp.it.rest.model.User;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Order  {
  
  @ApiModelProperty(value = "")
  private Date date = null;

  @ApiModelProperty(value = "")
  private Integer id = null;

  @ApiModelProperty(value = "")
  private List<OrderPosition> orderPositions = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("NEW") NEW(String.valueOf("NEW")), @XmlEnumValue("PAID") PAID(String.valueOf("PAID")), @XmlEnumValue("CONFIRMED") CONFIRMED(String.valueOf("CONFIRMED")), @XmlEnumValue("SENT") SENT(String.valueOf("SENT")), @XmlEnumValue("DONE") DONE(String.valueOf("DONE"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private StatusEnum status = null;

  @ApiModelProperty(value = "")
  private User user = null;
 /**
   * Get date
   * @return date
  **/
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Order date(Date date) {
    this.date = date;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Order id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get orderPositions
   * @return orderPositions
  **/
  @JsonProperty("orderPositions")
  public List<OrderPosition> getOrderPositions() {
    return orderPositions;
  }

  public void setOrderPositions(List<OrderPosition> orderPositions) {
    this.orderPositions = orderPositions;
  }

  public Order orderPositions(List<OrderPosition> orderPositions) {
    this.orderPositions = orderPositions;
    return this;
  }

  public Order addOrderPositionsItem(OrderPosition orderPositionsItem) {
    this.orderPositions.add(orderPositionsItem);
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get user
   * @return user
  **/
  @JsonProperty("user")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Order user(User user) {
    this.user = user;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderPositions: ").append(toIndentedString(orderPositions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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


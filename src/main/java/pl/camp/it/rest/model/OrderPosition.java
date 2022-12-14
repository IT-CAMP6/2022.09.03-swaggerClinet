package pl.camp.it.rest.model;

import pl.camp.it.rest.model.Book;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderPosition  {
  
  @ApiModelProperty(value = "")
  private Book book = null;

  @ApiModelProperty(value = "")
  private Integer id = null;

  @ApiModelProperty(value = "")
  private Integer quantity = null;
 /**
   * Get book
   * @return book
  **/
  @JsonProperty("book")
  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public OrderPosition book(Book book) {
    this.book = book;
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

  public OrderPosition id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get quantity
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderPosition quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPosition {\n");
    
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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


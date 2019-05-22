package org.wso2.carbon.apimgt.rest.api.publisher.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.EndpointDTO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class APIEndpointDTO   {
  
    private String key = null;
    private EndpointDTO inline = null;
    private String type = null;

  /**
   **/
  public APIEndpointDTO key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   **/
  public APIEndpointDTO inline(EndpointDTO inline) {
    this.inline = inline;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("inline")
  public EndpointDTO getInline() {
    return inline;
  }
  public void setInline(EndpointDTO inline) {
    this.inline = inline;
  }

  /**
   **/
  public APIEndpointDTO type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "Production", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIEndpointDTO apIEndpoint = (APIEndpointDTO) o;
    return Objects.equals(key, apIEndpoint.key) &&
        Objects.equals(inline, apIEndpoint.inline) &&
        Objects.equals(type, apIEndpoint.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, inline, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEndpointDTO {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    inline: ").append(toIndentedString(inline)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


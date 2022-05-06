package cn.peanut996.springdatajdbcdemo.dto;

import lombok.Data;

@Data
public class CreateOrderProductDTO {
  private long productId;
  private double productPrice;
}

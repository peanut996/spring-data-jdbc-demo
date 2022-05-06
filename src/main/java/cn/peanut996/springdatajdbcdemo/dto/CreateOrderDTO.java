package cn.peanut996.springdatajdbcdemo.dto;

import java.util.List;

import lombok.Data;

@Data
public class CreateOrderDTO {
  private long customerId;
  private double price;

  private CreateOrderCustomerDTO customer;
  private List<CreateOrderProductDTO> products;

}

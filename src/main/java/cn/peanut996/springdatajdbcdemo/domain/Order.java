package cn.peanut996.springdatajdbcdemo.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Table("order")
public class Order {

  @Id
  private long id;
  private String orderNo;
  private long customerId;
  private double price;

  private OrderCustomer customer;
  private List<OrderProduct> product;
}

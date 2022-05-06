package cn.peanut996.springdatajdbcdemo.domain;

import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
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

  @MappedCollection(idColumn = "order_no")
  private OrderCustomer customer;

  @MappedCollection(idColumn = "order_no")
  private Set<OrderProduct> product;
}

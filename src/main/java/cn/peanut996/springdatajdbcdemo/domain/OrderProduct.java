package cn.peanut996.springdatajdbcdemo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table("order_product")
public class OrderProduct {

  @Id
  private long id;
  private String orderNo;
  private long productId;
  private double productPrice;

}
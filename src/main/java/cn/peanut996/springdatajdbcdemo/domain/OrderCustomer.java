package cn.peanut996.springdatajdbcdemo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table("order_customer")
public class OrderCustomer {

  @Id
  private long id;
  private String orderNo;
  private String customerName;
  private String customerAge;

}

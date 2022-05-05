package cn.peanut996.springdatajdbcdemo.repository;

import org.springframework.data.repository.CrudRepository;

import cn.peanut996.springdatajdbcdemo.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
  

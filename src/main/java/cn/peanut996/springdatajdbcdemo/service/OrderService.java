package cn.peanut996.springdatajdbcdemo.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.peanut996.springdatajdbcdemo.domain.Order;
import cn.peanut996.springdatajdbcdemo.repository.OrderRepository;

@Service
public class OrderService {

  private final OrderRepository orderRepository;

  @Autowired
  public OrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  public Order create(Order order) {
    order.setOrderNo(UUID.randomUUID().toString());
    return orderRepository.save(order);
  }

}

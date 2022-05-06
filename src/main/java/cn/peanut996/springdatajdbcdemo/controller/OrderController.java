package cn.peanut996.springdatajdbcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.peanut996.springdatajdbcdemo.dto.CreateOrderDTO;
import cn.peanut996.springdatajdbcdemo.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

  private final OrderService orderService;

  @Autowired
  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @PostMapping
  public void create(@RequestBody CreateOrderDTO createOrderDTO) {
    orderService.create(createOrderDTO);
  }

}

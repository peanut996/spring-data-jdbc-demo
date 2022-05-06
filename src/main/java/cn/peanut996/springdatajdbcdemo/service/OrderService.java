package cn.peanut996.springdatajdbcdemo.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.peanut996.springdatajdbcdemo.domain.Order;
import cn.peanut996.springdatajdbcdemo.domain.OrderCustomer;
import cn.peanut996.springdatajdbcdemo.domain.OrderProduct;
import cn.peanut996.springdatajdbcdemo.dto.CreateOrderDTO;
import cn.peanut996.springdatajdbcdemo.repository.OrderRepository;

@Service
public class OrderService {

  private final OrderRepository orderRepository;

  @Autowired
  public OrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  public Order create(CreateOrderDTO createOrderDTO) {
    Order order = Order.builder()
        .customerId(createOrderDTO.getCustomerId())
        .price(createOrderDTO.getPrice())
        .build();

    OrderCustomer orderCustomer = OrderCustomer.builder()
        .customerAge(createOrderDTO.getCustomer().getCustomerAge())
        .customerName(createOrderDTO.getCustomer().getCustomerName())
        .build();

    List<OrderProduct> orderProducts = createOrderDTO.getProducts()
        .stream()
        .map(product -> {
          return OrderProduct.builder()
              .productId(product.getProductId())
              .productPrice(product.getProductPrice())
              .build();
        }).collect(Collectors.toList());

    order.setCustomer(orderCustomer);
    order.setProduct(orderProducts);

    return orderRepository.save(order);
  }

}

package service;

import entity.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.OrderRepository;

@Service
@AllArgsConstructor
public class OrderService {
    OrderRepository orderRepository;
    public Order getById(Long id) {
        return orderRepository.findById(id).get();
    }
    public Long saveOrder(Order order){
        return orderRepository.save(order).getId();
    }
    public void deleteOrderById(Long id){
        orderRepository.deleteById(id);
    }
    public Order updateOrder(Order order){
        return orderRepository.save(order);
    }
}

package controller;

import entity.Order;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.OrderService;

@RestController
@AllArgsConstructor
public class OrderController {
    OrderService orderService;
    @GetMapping("/order/{id}")
    Order getById(@PathVariable Long id){
        return orderService.getById(id);
    }
    @PostMapping("/order/save")
        Long saveNewOrder(@RequestBody Order order){
            return orderService.saveOrder(order);
    }
    @DeleteMapping("/order/delete")
    void deleteOrder(@PathVariable Long id){
        orderService.deleteOrderById(id);
    }
    @PostMapping("/order/update")
    Order updateById (@RequestBody Order order){
        return orderService.updateOrder(order);
    }




}

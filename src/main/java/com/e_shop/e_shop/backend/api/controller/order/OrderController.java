package com.e_shop.e_shop.backend.api.controller.order;

import com.e_shop.e_shop.backend.model.TeliaOrder;
import com.e_shop.e_shop.backend.model.TeliaUser;
import com.e_shop.e_shop.backend.service.OrderService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<TeliaOrder> getOrders(@AuthenticationPrincipal TeliaUser user) {
        return orderService.getOrders(user);
    }


}

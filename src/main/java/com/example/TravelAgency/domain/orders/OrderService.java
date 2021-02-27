package com.example.TravelAgency.domain.orders;

import com.example.TravelAgency.domain.basket.BasketService;
import com.example.TravelAgency.domain.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    private UserRepository userRepository;

    private BasketService basketService;


}

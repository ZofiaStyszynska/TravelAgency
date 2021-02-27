package com.example.TravelAgency.domain.basket;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class BasketService {

    public BigDecimal calculateTotalPrice (Basket basket) {
        BigDecimal tripPrice = basket.getOrderLines()
                .stream()
                .map(e -> e.getTripPrice()
                        .multiply(BigDecimal.valueOf(e.getQuantity()))).reduce((a,b) -> a.add(b) )
                .orElse(BigDecimal.ZERO);
        return tripPrice;
    }
}

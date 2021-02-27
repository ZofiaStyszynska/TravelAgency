package com.example.TravelAgency.domain.basket;

import com.example.TravelAgency.domain.base.BaseEntity;
import com.example.TravelAgency.domain.orders.OrderLine;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Basket extends BaseEntity {

  private List<OrderLine> orderLines = new ArrayList<>();
}

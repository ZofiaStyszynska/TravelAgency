package com.example.TravelAgency.domain.orders;

import com.example.TravelAgency.domain.base.BaseEntity;
import com.example.TravelAgency.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Order extends BaseEntity implements Serializable {

    private String customerName;

    private BigDecimal totalCost;

    @OneToMany (cascade = CascadeType.ALL)
    private List<OrderLine> orderLine;

    private User customer;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

}

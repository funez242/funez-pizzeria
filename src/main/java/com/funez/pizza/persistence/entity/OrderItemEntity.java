package com.funez.pizza.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@IdClass(OrderItemId.class)
@Entity
@Table(name = "order_item")
public class OrderItemEntity  {
    @Id
    @Column(name = "id_item", nullable = false)
    private Integer idItem;

    @Id
    @Column(name = "id_order", nullable = false)
    private Integer idOrder;

    @Column(name = "id_pizza", nullable = false)
    private Integer idPizza;

    @Column(nullable = false, columnDefinition = "Decimal(2,1)")
    private Double quantity;

    @Column(nullable = false, columnDefinition = "Decimal(5,2)")
    private Double price;

    @ManyToOne//An order can have many items
    @JoinColumn(name = "id_order", referencedColumnName = "id_order", insertable = false, updatable = false)
    private OrderEntity order;

    @OneToOne
    @JoinColumn(name = "id_pizza",referencedColumnName = "id_pizza", insertable = false, updatable = false)//Single responsability principle: we´ll not insert or update on parent table
    private PizzaEntity pizza;


}

package com.funez.pizza.persistence.repository;

import com.funez.pizza.persistence.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity,Integer> {

}

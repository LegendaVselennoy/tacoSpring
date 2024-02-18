package com.example.repository;

import com.example.model.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository extends CrudRepository<Ingredient,String> {
}

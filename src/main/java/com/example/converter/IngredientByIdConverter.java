package com.example.converter;

import com.example.model.Ingredient;
import com.example.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


/**
 * Конвертер – это любой класс, который реализует интерфейс Converter
 * с методом convert(), получающим значение одного типа и преобразующим его в значение другого типа.
 * Чтобы преобразовать String в Ingredient
 */
@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }
}

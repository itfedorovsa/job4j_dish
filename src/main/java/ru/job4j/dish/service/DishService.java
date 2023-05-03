package ru.job4j.dish.service;

import ru.job4j.dish.model.Dish;

import java.util.List;
import java.util.Optional;

/**
 * Dish service interface
 *
 * @author itfedorovsa (itfedorovsa@gmail.com)
 * @version 1.0
 * @since 02.05.23
 */
public interface DishService {

    Dish saveDish(Dish dish);

    void updateDish(Dish dish);

    List<Dish> findAllDishes();

    Optional<Dish> findDishById(int dishId);

    void deleteDish(Dish dish);

}

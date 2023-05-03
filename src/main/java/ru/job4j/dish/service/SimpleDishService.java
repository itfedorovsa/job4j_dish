package ru.job4j.dish.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.dish.model.Dish;
import ru.job4j.dish.repository.DishRepository;

import java.util.List;
import java.util.Optional;

/**
 * Dish service layer
 *
 * @author itfedorovsa (itfedorovsa@gmail.com)
 * @version 1.0
 * @since 02.05.23
 */
@Service
@AllArgsConstructor
public class SimpleDishService implements DishService {

    private final DishRepository store;

    @Override
    public Dish saveDish(Dish dish) {
        store.save(dish);
        return dish;
    }

    @Override
    public void updateDish(Dish dish) {
        store.save(dish);
    }

    @Override
    public List<Dish> findAllDishes() {
        return store.findAll();
    }

    @Override
    public Optional<Dish> findDishById(int dishId) {
        return store.findById(dishId);
    }

    @Override
    public void deleteDish(Dish dish) {
        store.delete(dish);
    }

}

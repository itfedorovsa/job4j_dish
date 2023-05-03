package ru.job4j.dish.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.dish.model.Dish;

import java.util.List;

/**
 * Dish Spring Data repository interface
 *
 * @author itfedorovsa (itfedorovsa@gmail.com)
 * @version 1.0
 * @since 02.05.23
 */
public interface DishRepository extends CrudRepository<Dish, Integer> {

    List<Dish> findAll();

}

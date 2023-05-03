package ru.job4j.dish.model;

import lombok.*;
import lombok.EqualsAndHashCode.Include;

import javax.persistence.*;

/**
 * Dish model
 *
 * @author itfedorovsa (itfedorovsa@gmail.com)
 * @version 1.0
 * @since 02.05.23
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "dishes")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Include
    private int id;

    private String name;

    private String description;

}

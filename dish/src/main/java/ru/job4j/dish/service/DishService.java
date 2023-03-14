package ru.job4j.dish.service;

import ru.job4j.domain.model.Dish;

import java.util.List;
import java.util.Optional;

/**
 * Сервис для приготовляемых блюд
 */
public interface DishService {
    /**
     * Добавляет в меню блюдо
     * @param dish блюдо тип {@link ru.job4j.domain.model.Dish}
     */
    void addDish(Dish dish);

    /**
     * Список всех блюд меню
     * @return тип {@link java.util.List<ru.job4j.domain.model.Dish>}
     */
    List<Dish> findAll();

    /**
     * Удаление блюда из меню по идентификатору
     * @param id идентификатор блюда из меню
     * @return тип boolean
     * true  - удалено
     * false - не удалено
     */
    boolean deleteById(int id);

    /**
     * Поиск блюда по идентификатору
     * @param id идентификатор блюда
     * @return тип {@link java.util.Optional<ru.job4j.domain.model.Dish>}
     */
    Optional<Dish> findById(int id);

    /**
     * Обновить блюдо в меню. Идентификатор блюда больше 0.
     * @param dish тип {@link ru.job4j.domain.model.Dish}
     * @return результат тип boolean,
     * true  - успешно обновлено,
     * false - не обновлено
     */
    boolean update(Dish dish);
}
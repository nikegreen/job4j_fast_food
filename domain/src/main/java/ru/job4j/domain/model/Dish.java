package ru.job4j.domain.model;

import lombok.Data;

/**
 * Модель продаваемых блюд
 */
@Data
public class Dish {
    /**
     * Идентификатор блюда
     */
    private int id;

    /**
     * Имя блюда
     */
    private String name;

    /**
     * Цена блюда
     */
    private int price;

    /**
     * Время приготовления (минут)
     */
    private int prepareTime;
}

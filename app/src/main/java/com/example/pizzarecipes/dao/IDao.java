package com.example.pizzarecipes.dao;

import java.util.List;

public interface IDao<T> {
    T create(T essElement);
    T update(T essElement);
    boolean delete(long essId);
    T findById(long essId);
    List<T> findAll();
}
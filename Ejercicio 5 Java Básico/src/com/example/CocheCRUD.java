package com.example;
import com.example.CocheCRUDImpl;

import java.util.List;

public interface CocheCRUD {

    void save(Coche coche);

    List<Coche> findAll();

    void delete(Coche coche);
}

package com.example.fruitshop.repositories;

import com.example.fruitshop.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category,Long> {

    Category findByName(String name);
}

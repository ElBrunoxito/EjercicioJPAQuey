package com.yobrunox.ejercicio_pc.repository;

import com.yobrunox.ejercicio_pc.models.App;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends JpaRepository<App,Integer> {
    //Querys
}

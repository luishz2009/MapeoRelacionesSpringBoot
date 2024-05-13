package com.application.rest.persistence;

import com.application.rest.entity.Maker;

import java.util.List;
import java.util.Optional;

//DAO: Data Access Object: Para acceder a nuestra capa de persistencia
public interface IMakerDAO {

    List<Maker> findAll();

    Optional<Maker> findById(Long id);

    void save(Maker maker);

    void deleteById(Long id);
}

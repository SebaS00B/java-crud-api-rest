package com.sebas.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebas.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long>{

}

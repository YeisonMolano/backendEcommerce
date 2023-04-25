package com.bitech.ecommerce.repository;

import com.bitech.ecommerce.modells.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    @Modifying
    @Query("UPDATE Producto p SET p.stock = p.stock - :valor WHERE p.idProducto = :id")
    void restarCantidad(@Param("id") Long id, @Param("valor") Integer valor);
}

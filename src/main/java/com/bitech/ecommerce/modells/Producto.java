package com.bitech.ecommerce.modells;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PRODUCTO")
@Data
public class Producto {
    @Id
    private Long idProducto;
    @Column
    private String nombreProducto;
    @Column
    private String referencia;
    @Column
    private String categoria;
    @Column
    private int cantidad;
    @Column
    private String foto;
}

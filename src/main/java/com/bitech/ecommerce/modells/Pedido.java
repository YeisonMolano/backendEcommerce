package com.bitech.ecommerce.modells;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Entity
@Table(name = "PEDIDO")
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long idPedido;
    @Column
    private ArrayList<Producto> productos;
    @Column
    private Persona comprador;
}

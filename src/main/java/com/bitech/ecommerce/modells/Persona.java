package com.bitech.ecommerce.modells;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PERSONA")
@Data
public class Persona {
    @Id
    private Long numIdentificacion;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private String numTelefono;
}
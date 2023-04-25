package com.bitech.ecommerce.modells;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PERSONA")
@Data
public class Persona {
    @Id
    private Long numIdentificacion;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String direccion;
    @Column
    private String numTelefono;
}
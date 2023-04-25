package com.bitech.ecommerce.service;

import com.bitech.ecommerce.modells.Persona;

import java.util.Optional;

public interface PersonaService {
    Persona newPersona(Persona newPersona);
    Optional<Persona> ifExist(Long idPersona);
    void deletePersonaById(Long idPersona);
    Persona updatePersona(Persona persona);
    Iterable<Persona> getAll();
}

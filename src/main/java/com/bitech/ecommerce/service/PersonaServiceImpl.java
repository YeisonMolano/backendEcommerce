package com.bitech.ecommerce.service;

import com.bitech.ecommerce.modells.Persona;
import com.bitech.ecommerce.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PersonaServiceImpl implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona newPersona(Persona newPersona) {
        return this.personaRepository.save(newPersona);
    }

    @Override
    public Optional<Persona> ifExist(Long idPersona) {
        Optional<Persona> persona = this.personaRepository.findById(idPersona);
        return persona;
    }

    @Override
    public void deletePersonaById(Long idPersona) {
        this.personaRepository.deleteById(idPersona);
    }

    @Override
    public Persona updatePersona(Persona personaNew) {
        Optional<Persona> persona = this.ifExist(personaNew.getNumIdentificacion());
        if(persona != null){
            persona.get().setNombre(personaNew.getNombre());
            persona.get().setApellido(personaNew.getApellido());
            persona.get().setDireccion(personaNew.getDireccion());
            persona.get().setNumTelefono(personaNew.getNumTelefono());
            return this.newPersona(persona.get());
        }else{
            return null;
        }
    }

    @Override
    public Iterable<Persona> getAll() {
        return this.personaRepository.findAll();
    }
}

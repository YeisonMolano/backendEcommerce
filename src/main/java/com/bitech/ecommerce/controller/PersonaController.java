package com.bitech.ecommerce.controller;

import com.bitech.ecommerce.modells.Persona;
import com.bitech.ecommerce.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200/" , "http://localhost:8080/"})
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/get-all")
    public Iterable<Persona> personas(){
        return this.personaService.getAll();
    }

    @PostMapping("/new-persona")
    public Persona newPersona(@RequestBody Persona newPersona){
        return this.personaService.newPersona(newPersona);
    }

    @PutMapping("/{idPersona}")
    public Persona updatePersona(@RequestBody Persona persona){
        return this.personaService.updatePersona(persona);
    }

    @DeleteMapping("/{idPersona}")
    public void deletePersona(@PathVariable("idPersona") Long idPersona){
        this.personaService.deletePersonaById(idPersona);
    }
}

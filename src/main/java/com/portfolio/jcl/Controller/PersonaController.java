
package com.portfolio.jcl.Controller;

import com.portfolio.jcl.Entidad.Persona;
import com.portfolio.jcl.Interface.PersonaInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired PersonaInterface personaInterface;
    
    @GetMapping("personas/traer")
    public List <Persona> getPersona(){
        return personaInterface.getPersona();
    }
    
     @GetMapping("personas/{id}")
    public Persona getPersonaById(@PathVariable Long id){
        Persona persona = personaInterface.findPersona(id);
        return persona;
    }
    
    @PostMapping("personas/crear")
    public Persona createPersona(@RequestBody Persona persona){
        Persona _persona = personaInterface.savePersona(persona);
        return _persona;
    }
    
    @DeleteMapping("personas/{id}")
    public void deletePersona (@PathVariable Long id){
        personaInterface.deletePersona(id);
    }
    
    @PutMapping("personas/{id}")
    public Persona editPersona(@PathVariable Long id, @RequestBody Persona persona){
        Persona _persona = personaInterface.findPersona(id);
        _persona.setNombre(persona.getNombre());
        _persona.setApellido(persona.getApellido());
        _persona.setDomicilio(persona.getDomicilio());
        _persona.setEmail(persona.getEmail());
        _persona.setTitulo(persona.getTitulo());
        _persona.setAboutMe(persona.getAboutMe());
        _persona.setFotoPerfil(persona.getFotoPerfil());
        
        
        personaInterface.savePersona(persona);
        return _persona;
    }
}

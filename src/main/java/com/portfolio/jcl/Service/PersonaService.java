
package com.portfolio.jcl.Service;

import com.portfolio.jcl.Entidad.Persona;
import com.portfolio.jcl.Interface.PersonaInterface;
import com.portfolio.jcl.Repository.IPersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements PersonaInterface{
    @Autowired
    IPersonaRepo  iPersonaRepo;

    @Override
    public List<Persona> getPersona() {
      List<Persona> persona = iPersonaRepo.findAll();
      return persona;
    }

    @Override
    public Persona savePersona(Persona persona) {
       Persona _persona = iPersonaRepo.save(persona);
       return _persona;
    }

    @Override
    public void deletePersona(Long id) {
       iPersonaRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = iPersonaRepo.findById(id).orElse(null);
        return persona;
    }
    
}

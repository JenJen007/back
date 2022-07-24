
package com.portfolio.jcl.Interface;

import com.portfolio.jcl.Entidad.Persona;
import java.util.List;


public interface PersonaInterface {
    //Trae una lista de personas//
    public List<Persona> getPersona();
    
    //Guarda un objeto de tipo Persona//
    public Persona savePersona(Persona persona);
    
    //Elimina un usuario pero buscarlo por id//
    public void deletePersona(Long id);
    
    //Busca un objeto por id//
    public Persona findPersona(Long id);
}

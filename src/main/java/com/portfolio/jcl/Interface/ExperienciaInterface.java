
package com.portfolio.jcl.Interface;

import com.portfolio.jcl.Entidad.Experiencia;
import java.util.List;


public interface ExperienciaInterface {
      //Trae una lista de experiencias//
    public List<Experiencia> getExperiencia();
    
    //Guarda un objeto de tipo Experiencia//
    public Experiencia saveExperiencia(Experiencia experiencia);
    
    //Elimina una experiencia pero primero busca por id//
    public void deleteExperiencia(Long id);
    
    //Busca un objeto por id//
    public Experiencia findExperiencia(Long id);
}



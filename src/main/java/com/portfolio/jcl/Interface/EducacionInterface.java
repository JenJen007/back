
package com.portfolio.jcl.Interface;

import com.portfolio.jcl.Entidad.Educacion;
import java.util.List;


public interface EducacionInterface {
    //Trae una lista de educaciones//
    public List<Educacion> getEducacion();
    
    //Guarda un objeto de tipo Educacion//
    public Educacion saveEducacion(Educacion educacion);
    
    //Elimina una educacion pero primero busca por id//
    public void deleteEducacion(Long id);
    
    //Busca un objeto por id//
    public Educacion findEducacion(Long id);
}

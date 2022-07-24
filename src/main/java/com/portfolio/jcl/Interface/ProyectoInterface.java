
package com.portfolio.jcl.Interface;

import com.portfolio.jcl.Entidad.Proyecto;
import java.util.List;


public interface ProyectoInterface {
     //Trae una lista de proyectos//
    public List<Proyecto> getProyecto();
    
    //Guarda un objeto de tipo Proyecto//
    public Proyecto saveProyecto(Proyecto proyecto);
    
    //Elimina un proyecto pero primero busca por id//
    public void deleteProyecto(Long id);
    
    //Busca un objeto por id//
    public Proyecto findProyecto(Long id);
}

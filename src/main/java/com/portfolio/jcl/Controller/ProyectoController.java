
package com.portfolio.jcl.Controller;

import com.portfolio.jcl.Entidad.Proyecto;
import com.portfolio.jcl.Interface.ProyectoInterface;
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
public class ProyectoController {
    @Autowired
    ProyectoInterface proyectoInterface;
    
    @GetMapping("proyecto/traer")
    public List <Proyecto> getProyecto(){
        return proyectoInterface.getProyecto();
    }
    
     @GetMapping("proyecto/{id}")
    public Proyecto getProyectoById(@PathVariable Long id){
        Proyecto proyecto = proyectoInterface.findProyecto(id);
        return proyecto;
    }
    
    @PostMapping("proyecto/crear")
    public Proyecto createProyecto(@RequestBody Proyecto proyecto){
        Proyecto _proyecto = proyectoInterface.saveProyecto(proyecto);
        return _proyecto;
    }
    
    @DeleteMapping("proyecto/{id}")
    public void deleteProyecto (@PathVariable Long id){
        proyectoInterface.deleteProyecto(id);
    }
    
    @PutMapping("proyecto/{id}")
    public Proyecto editProyecto(@PathVariable Long id, @RequestBody Proyecto proyecto){
        Proyecto _proyecto = proyectoInterface.findProyecto(id);
        _proyecto.setNameProye(proyecto.getNameProye());
        _proyecto.setDescripProye(proyecto.getDescripProye());
        _proyecto.setFechaProye(proyecto.getFechaProye());
        _proyecto.setEnlaceProye(proyecto.getEnlaceProye());
        
        proyectoInterface.saveProyecto(proyecto);
        return _proyecto;
    }
}


package com.portfolio.jcl.Controller;

import com.portfolio.jcl.Entidad.Experiencia;
import com.portfolio.jcl.Interface.ExperienciaInterface;
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
public class ExperienciaController {
    @Autowired 
    ExperienciaInterface experienciaInterface;
    
    @GetMapping("experiencia/traer")
    public List <Experiencia> getExperiencia(){
        return experienciaInterface.getExperiencia();
    }
    
     @GetMapping("experiencia/{id}")
    public Experiencia getExperienciaById(@PathVariable Long id){
        Experiencia experiencia = experienciaInterface.findExperiencia(id);
        return experiencia;
    }
    
    @PostMapping("experiencia/crear")
    public Experiencia createExperiencia(@RequestBody Experiencia experiencia){
        Experiencia _experiencia = experienciaInterface.saveExperiencia(experiencia);
        return _experiencia;
    }
    
    @DeleteMapping("experiencia/{id}")
    public void deleteExperiencia (@PathVariable Long id){
        experienciaInterface.deleteExperiencia(id);
    }
    
    @PutMapping("experiencia/{id}")
    public Experiencia editExperiencia(@PathVariable Long id, @RequestBody Experiencia experiencia){
        Experiencia _experiencia = experienciaInterface.findExperiencia(id);
        _experiencia.setNameExp(experiencia.getNameExp());
        _experiencia.setCargoExp(experiencia.getCargoExp());
        _experiencia.setDescripExp(experiencia.getDescripExp());
        _experiencia.setFechaExpIni(experiencia.getFechaExpIni());
        _experiencia.setFechaExpFin(experiencia.getFechaExpFin());
        
        experienciaInterface.saveExperiencia(experiencia);
        return _experiencia;
    }
}

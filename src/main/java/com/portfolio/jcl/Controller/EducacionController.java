
package com.portfolio.jcl.Controller;

import com.portfolio.jcl.Entidad.Educacion;
import com.portfolio.jcl.Interface.EducacionInterface;
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
public class EducacionController {
      @Autowired EducacionInterface educacionInterface;
    
    @GetMapping("educacion/traer")
    public List <Educacion> getEducacion(){
        return educacionInterface.getEducacion();
    }
    
     @GetMapping("educacion/{id}")
    public Educacion getEducacionById(@PathVariable Long id){
        Educacion educacion = educacionInterface.findEducacion(id);
        return educacion;
    }
    
    @PostMapping("educacion/crear")
    public Educacion createEducacion(@RequestBody Educacion educacion){
        Educacion _educacion = educacionInterface.saveEducacion(educacion);
        return _educacion;
    }
    
    @DeleteMapping("educacion/{id}")
    public void deleteEducacion (@PathVariable Long id){
        educacionInterface.deleteEducacion(id);
    }
    
    @PutMapping("educacion/{id}")
    public Educacion editEducacion(@PathVariable Long id, @RequestBody Educacion educacion){
        Educacion _educacion = educacionInterface.findEducacion(id);
        _educacion.setNameEdu(educacion.getNameEdu());
        _educacion.setTitleEdu(educacion.getTitleEdu());
        _educacion.setFechaEduIni(educacion.getFechaEduIni());
        _educacion.setFechaEduFin(educacion.getFechaEduFin());
        
        educacionInterface.saveEducacion(educacion);
        return _educacion;
    }
}

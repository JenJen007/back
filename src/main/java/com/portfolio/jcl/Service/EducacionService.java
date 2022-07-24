
package com.portfolio.jcl.Service;

import com.portfolio.jcl.Entidad.Educacion;
import com.portfolio.jcl.Interface.EducacionInterface;
import com.portfolio.jcl.Repository.IEducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements EducacionInterface{
    @Autowired
    IEducacionRepo iEducacionRepo;

    @Override
    public List<Educacion> getEducacion() {
       List<Educacion> educacion = iEducacionRepo.findAll();
       return educacion;
    }

    @Override
    public Educacion saveEducacion(Educacion educacion) {
        Educacion _educacion = iEducacionRepo.save(educacion);
        return _educacion;
    }

    @Override
    public void deleteEducacion(Long id) {
       iEducacionRepo.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
       Educacion educacion = iEducacionRepo.findById(id).orElse(null);
       return educacion;
    }
    
}

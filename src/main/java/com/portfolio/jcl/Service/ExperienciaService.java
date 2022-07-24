
package com.portfolio.jcl.Service;

import com.portfolio.jcl.Entidad.Experiencia;
import com.portfolio.jcl.Interface.ExperienciaInterface;
import com.portfolio.jcl.Repository.IExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements ExperienciaInterface{
    @Autowired
    IExperienciaRepo iExperienciaRepo;

    @Override
    public List<Experiencia> getExperiencia() {
       List<Experiencia> experiencia = iExperienciaRepo.findAll();
       return experiencia;
    }

    @Override
    public Experiencia saveExperiencia(Experiencia experiencia) {
        Experiencia _experiencia = iExperienciaRepo.save(experiencia);
        return _experiencia;
    }

    @Override
    public void deleteExperiencia(Long id) {
        iExperienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = iExperienciaRepo.findById(id).orElse(null);
        return experiencia;
    }
    
}

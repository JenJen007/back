
package com.portfolio.jcl.Service;

import com.portfolio.jcl.Entidad.Proyecto;
import com.portfolio.jcl.Interface.ProyectoInterface;
import com.portfolio.jcl.Repository.IProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements ProyectoInterface{
    @Autowired
    IProyectoRepo iProyectoRepo;

    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyecto = iProyectoRepo.findAll();
        return proyecto;
    }

    @Override
    public Proyecto saveProyecto(Proyecto proyecto) {
        Proyecto _proyecto = iProyectoRepo.save(proyecto);
        return _proyecto;
    }

    @Override
    public void deleteProyecto(Long id) {
        iProyectoRepo.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proyecto = iProyectoRepo.findById(id).orElse(null);
        return proyecto;
    }
    
}

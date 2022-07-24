
package com.portfolio.jcl.Repository;

import com.portfolio.jcl.Entidad.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepo extends JpaRepository<Experiencia, Long>{
    
}

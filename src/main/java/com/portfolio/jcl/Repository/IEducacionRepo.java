
package com.portfolio.jcl.Repository;

import com.portfolio.jcl.Entidad.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepo extends JpaRepository<Educacion, Long> {
    
}

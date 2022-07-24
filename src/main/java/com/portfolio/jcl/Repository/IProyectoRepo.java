
package com.portfolio.jcl.Repository;

import com.portfolio.jcl.Entidad.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepo extends JpaRepository<Proyecto, Long>{
    
}

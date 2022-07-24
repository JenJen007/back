
package com.portfolio.jcl.Repository;

import com.portfolio.jcl.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepo extends JpaRepository<Persona, Long> {
    
}

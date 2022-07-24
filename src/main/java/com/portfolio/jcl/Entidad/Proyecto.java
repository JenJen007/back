
package com.portfolio.jcl.Entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProye;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nameProye;
    
    @NotNull
    @Size(min = 1, max = 500, message = "no cumple con la longitud")
    private String descripProye;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String enlaceProye;
    
    @NotNull
    private int fechaProye;
     
    
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String imgProye;
    
}


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
public class Educacion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEdu;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nameEdu;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String titleEdu;
    
    @NotNull
    private int fechaEduIni;
    
    @NotNull
    private int fechaEduFin;
    
    
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String imgEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String nameEdu, String titleEdu, int fechaEduIni, int fechaEduFin, String imgEdu) {
        this.idEdu = idEdu;
        this.nameEdu = nameEdu;
        this.titleEdu = titleEdu;
        this.fechaEduIni = fechaEduIni;
        this.fechaEduFin = fechaEduFin;
        this.imgEdu = imgEdu;
    }
    

    
}
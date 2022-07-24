
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
public class Experiencia implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExp;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nameExp;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String cargoExp;
    
    @NotNull
    @Size(min = 1, max = 1500, message = "no cumple con la longitud")
    private String descripExp;
    
    @NotNull
    private int fechaExpIni;
    
    @NotNull
    private int fechaExpFin;
    
    
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String imgExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String nameExp, String cargoExp, String descripExp, int fechaExpIni, int fechaExpFin, String imgExp) {
        this.idExp = idExp;
        this.nameExp = nameExp;
        this.cargoExp = cargoExp;
        this.descripExp = descripExp;
        this.fechaExpIni = fechaExpIni;
        this.fechaExpFin = fechaExpFin;
        this.imgExp = imgExp;
    }
    
    
    
}


package com.portfolio.jcl.Entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
     
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String domicilio;
    
    @NotNull
    @Size(min = 1, max = 200, message = "no cumple con la longitud")
    private String email;
    
    @NotNull
    @Size(min = 1, max = 70, message = "no cumple con la longitud")
    private String titulo;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String aboutMe;
    
    
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String fotoPerfil;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;
     
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProye")
    private List<Proyecto> proyectoList;

    public Persona() {
    }

    public Persona(Long idUser, String nombre, String apellido, String domicilio, String email, String titulo, String aboutMe, String fotoPerfil) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.email = email;
        this.titulo = titulo;
        this.aboutMe = aboutMe;
        this.fotoPerfil = fotoPerfil;
    }

   
    }
    
    
    

package com.example.model;
 
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="iva")
public class IvaModel {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private Long id_iva;
    

    @NotNull
    @Column( name="nombre")
    private String nombre;

    @NotNull
    @Column( name="porcentaje")
    private Double porcentaje;


    public IvaModel() {
    }


    

    /**
     * @return Long return the id_iva
     */
    public Long getId_iva() {
        return id_iva;
    }

    /**
     * @param id_iva the id_iva to set
     */
    public void setId_iva(Long id_iva) {
        this.id_iva = id_iva;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Double return the porcentaje
     */
    public Double getPorcentaje() {
        return porcentaje;
    }

    /**
     * @param porcentaje the porcentaje to set
     */
    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

}

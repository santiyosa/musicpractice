package com.example.musica.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "banda")

public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idbanda;

    @Column(name = "nombrebanda", length = 45)
    private String nombrebanda;

    @Column(name = "nacionalidad", length = 45)
    private String nacionalidad;

    @Column(name = "fundacion", length = 45)
    private String fundacion;

    @Column(name = "genero", length = 45)
    private String genero;


    public Band() {
    }
    

    public Long getIdbanda() {
        return this.idbanda;
    }

    public void setIdbanda(Long idbanda) {
        this.idbanda = idbanda;
    }

    public String getNombrebanda() {
        return this.nombrebanda;
    }

    public void setNombrebanda(String nombrebanda) {
        this.nombrebanda = nombrebanda;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFundacion() {
        return this.fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}

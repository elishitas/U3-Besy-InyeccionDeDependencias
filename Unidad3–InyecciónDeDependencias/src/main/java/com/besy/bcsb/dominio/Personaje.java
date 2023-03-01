package com.besy.bcsb.dominio;

public class Personaje {

    private Long Id;
    private String nombre;
    private Integer edad;
    private Float peso;
    private String historia;

    public Personaje(Long Id, String nombre, Integer edad, Float peso, String historia) {
        this.Id = Id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}

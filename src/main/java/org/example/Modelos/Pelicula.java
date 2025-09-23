package org.example.Modelos;

import java.time.LocalDate;

public class Pelicula {
    private Integer id;
    private String titulo;
    private String genero;
    private Integer duracion;
    private LocalDate fechaEstreno;
    private Double calificacion;
    private String Sipnosis;
    private String imagenPortada;

    public Pelicula() {
    }

    public Pelicula(Integer id, String titulo, String genero, Integer duracion, LocalDate fechaEstreno, Double calificacion, String sipnosis, String imagenPortada) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.fechaEstreno = fechaEstreno;
        this.calificacion = calificacion;
        this.Sipnosis = sipnosis;
        this.imagenPortada = imagenPortada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public String getSipnosis() {
        return Sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        Sipnosis = sipnosis;
    }

    public String getImagenPortada() {
        return imagenPortada;
    }

    public void setImagenPortada(String imagenPortada) {
        this.imagenPortada = imagenPortada;
    }
}

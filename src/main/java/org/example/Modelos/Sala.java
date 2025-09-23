package org.example.Modelos;

public class Sala {
    private Integer numero;
    private Integer capacidad;
    private String tipo;
    private String sonido;
    private String ubicacion;
    private Boolean Activa;
    private String limpieza;
    private String tecnico;

    public Sala() {
    }

    public Sala(Integer numero, Integer capacidad, String tipo, String sonido, String ubicacion, Boolean activa, String limpieza, String tecnico) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.sonido = sonido;
        this.ubicacion = ubicacion;
        this.Activa = activa;
        this.limpieza = limpieza;
        this.tecnico = tecnico;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSonido() {
        return sonido;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Boolean getActiva() {
        return Activa;
    }

    public String getLimpieza() {
        return limpieza;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setActiva(Boolean activa) {
        Activa = activa;
    }

    public void setLimpieza(String limpieza) {
        this.limpieza = limpieza;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
}

package org.example.Modelos;

public class Asiento {
    private Integer fila;
    private Integer numero;
    private Boolean vip;
    private String tipo;
    private Boolean ocupado;
    private Boolean reservado;
    private String estado;
    private Boolean accesibleDiscapacitados;

    public Asiento() {
    }

    public Asiento(Integer fila, Integer numero, Boolean vip, String tipo, Boolean ocupado, Boolean reservado, String estado, Boolean accesibleDiscapacitados) {
        this.fila = fila;
        this.numero = numero;
        this.vip = vip;
        this.tipo = tipo;
        this.ocupado = ocupado;
        this.reservado = reservado;
        this.estado = estado;
        this.accesibleDiscapacitados = accesibleDiscapacitados;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Boolean getReservado() {
        return reservado;
    }

    public void setReservado(Boolean reservado) {
        this.reservado = reservado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getAccesibleDiscapacitados() {
        return accesibleDiscapacitados;
    }

    public void setAccesibleDiscapacitados(Boolean accesibleDiscapacitados) {
        this.accesibleDiscapacitados = accesibleDiscapacitados;
    }
}

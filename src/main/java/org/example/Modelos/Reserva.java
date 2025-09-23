package org.example.Modelos;

import java.time.LocalDate;

public class Reserva {
    private Integer idReserva;
    private Cliente cliente;
    private String pelicula;
    private Integer asiento;
    private LocalDate fechaReserva;
    private Double precioTotal;
    private Boolean pagado;
    private String estadoReserva;
    private String metodoPago;
    private LocalDate fechaFuncion;

    public Reserva() {
    }

    public Reserva(Integer idReserva, Cliente cliente, String pelicula, Integer asiento, LocalDate fechaReserva, Double precioTotal, Boolean pagado, String estadoReserva, String metodoPago, LocalDate fechaFuncion) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.asiento = asiento;
        this.fechaReserva = fechaReserva;
        this.precioTotal = precioTotal;
        this.pagado = pagado;
        this.estadoReserva = estadoReserva;
        this.metodoPago = metodoPago;
        this.fechaFuncion = fechaFuncion;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getPelicula() {
        return pelicula;
    }

    public Integer getAsiento() {
        return asiento;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public LocalDate getFechaFuncion() {
        return fechaFuncion;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setAsiento(Integer asiento) {
        this.asiento = asiento;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setFechaFuncion(LocalDate fechaFuncion) {
        this.fechaFuncion = fechaFuncion;
    }
}

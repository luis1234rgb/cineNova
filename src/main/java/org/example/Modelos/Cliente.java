package org.example.Modelos;

import java.time.LocalDate;

public class Cliente {
    private Integer id;
    private String nombre;
    private Integer documento;
    private String correo;
    private String direccion;
    private Integer telefono;
    private LocalDate fechaRegistro;
    private Boolean clienteVIP;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, Integer documento, String correo, String direccion, Integer telefono, LocalDate fechaRegistro, Boolean clienteVIP) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
        this.clienteVIP = clienteVIP;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public Boolean getClienteVIP() {
        return clienteVIP;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setClienteVIP(Boolean clienteVIP) {
        this.clienteVIP = clienteVIP;
    }
}



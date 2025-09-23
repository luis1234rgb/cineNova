package org.example;

import org.example.Modelos.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente0 = new Cliente();
        cliente0.setId(1);
        cliente0.setNombre("pepe");
        cliente0.setDocumento(10020202);
        cliente0.setCorreo("pepe@gmail.com");
        cliente0.setDireccion("callefalsa123");
        cliente0.setTelefono(22322323);
        cliente0.setFechaRegistro(LocalDate.of(20205,2,12));
        cliente0.setClienteVIP(true);

        Cliente cliente1 = new Cliente(2,"toby",12223222,"toby@gmail.com","calle2222",20202020,LocalDate.of(2025,2,5),false);

        Pelicula pelicula0 = new Pelicula();
        pelicula0.setId(2);
        pelicula0.setTitulo("wallstreet");
        pelicula0.setGenero("Accion");
        pelicula0.setDuracion(150);
        pelicula0.setFechaEstreno(LocalDate.of(2025,4,2));
        pelicula0.setCalificacion(4.5);
        pelicula0.setSipnosis("pelicula que trata de una empresa");
        pelicula0.setImagenPortada("url:www.imagenportada");

        Pelicula pelicula1 = new Pelicula(3,"Megalodon","fantasia",150,LocalDate.of(2025,8,22),5.0,"Atrapa a el megalodon","url(www.imagenMegalodon.com)");

        Sala sala0 = new Sala();
        sala0.setNumero(1);
        sala0.setCapacidad(100);
        sala0.setTipo("3D");
        sala0.setSonido("Stereo");
        sala0.setUbicacion("primer piso");
        sala0.setActiva(true);
        sala0.setLimpieza("limpio");
        sala0.setTecnico("No necesita tecnico");

        Sala sala1 = new Sala(4,150,"2D","stereo","segundo piso",false,"por limpiar","se necesita tecnico");


        Asiento asiento0 = new Asiento();
        asiento0.setFila(1);
        asiento0.setNumero(22);
        asiento0.setVip(true);
        asiento0.setTipo("reclinable");
        asiento0.setOcupado(false);
        asiento0.setReservado(false);
        asiento0.setEstado("limpio");
        asiento0.setAccesibleDiscapacitados(true);

        Asiento asiento1 = new Asiento(3,33,false,"normal",false,true,"limpio",false);

        Reserva reserva0 = new Reserva();
        reserva0.setIdReserva(22);
        reserva0.setCliente(cliente0);
        reserva0.setPelicula("wallstreet");
        reserva0.setAsiento(22);
        reserva0.setFechaReserva(LocalDate.of(2025,8,2));
        reserva0.setPrecioTotal(22.000);
        reserva0.setPagado(true);
        reserva0.setEstadoReserva("reservado");
        reserva0.setMetodoPago("tarjeta debito");
        reserva0.setFechaFuncion(LocalDate.of(2025,12,3));

        Reserva reserva1 = new Reserva(4,cliente1,"Megalodon",2,LocalDate.of(2025,8,4),25.000,false,"no confirmado","efectivo",LocalDate.of(2025,12,8));

        System.out.println(cliente0);
        System.out.println(cliente1);
        System.out.println(pelicula0);
        System.out.println(pelicula1);
        System.out.println(sala0);
        System.out.println(sala1);
        System.out.println(asiento0);
        System.out.println(asiento1);
        System.out.println(reserva0);
        System.out.println(reserva1);


    }
}
package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Plataforma {
    private int idPlataforma;
    private String nombre;
    private LocalDate fechaLanzamiento;
    private int idEmpresa;

    //Constructor

    public Plataforma(int idPlataforma, String nombre, LocalDate fechaLanzamiento) {
        this.idPlataforma = idPlataforma;
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    //Setters & Getters
    public int getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    //Equals & HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plataforma that)) return false;
        return getIdPlataforma() == that.getIdPlataforma() && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getFechaLanzamiento(), that.getFechaLanzamiento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPlataforma(), getNombre(), getFechaLanzamiento());
    }
}

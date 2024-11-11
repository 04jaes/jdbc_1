package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class VideoJuego {
    private int idVideoJuego;
    private String titulo;
    private String genero;
    private LocalDate fechaLanzamiento;

    //Constructor
    public VideoJuego(String titulo, String genero, LocalDate fechaLanzamiento) {
        this.titulo = titulo;
        this.genero = genero;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    //Getter & Setters
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

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    //ToString
    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                '}';
    }

    //Equals & HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VideoJuego that)) return false;
        return Objects.equals(getTitulo(), that.getTitulo()) && Objects.equals(getGenero(), that.getGenero()) && Objects.equals(getFechaLanzamiento(), that.getFechaLanzamiento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getGenero(), getFechaLanzamiento());
    }
}

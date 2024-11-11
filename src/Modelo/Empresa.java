package Modelo;

import java.util.Objects;

public class Empresa {
    private int idEmpresa;
    private String nombre;
    private String cif;

    //Constructor
    public Empresa(int idEmpresa, String nombre, String cif) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.cif = cif;
    }

    //Setters & Getters

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    //ToString

    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", nombre='" + nombre + '\'' +
                ", cif='" + cif + '\'' +
                '}';
    }

    //Equals & Hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empresa empresa)) return false;
        return getIdEmpresa() == empresa.getIdEmpresa() && Objects.equals(getNombre(), empresa.getNombre()) && Objects.equals(getCif(), empresa.getCif());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdEmpresa(), getNombre(), getCif());
    }
}

package Modelo;

import java.util.ArrayList;
import java.util.Objects;

public class BD {
    private String host;
    private String usuario;
    private String clave;
    private String nombreBD;

    public BD(String host, String usuario, String clave, String nombreBD) {
        this.host = host;
        this.usuario = usuario;
        this.clave = clave;
        this.nombreBD = nombreBD;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreBD() {
        return nombreBD;
    }

    public void setNombreBD(String nombreBD) {
        this.nombreBD = nombreBD;
    }

    @Override
    public String toString() {
        return "BD{" +
                "host='" + host + '\'' +
                ", usuario='" + usuario + '\'' +
                ", clave='" + clave + '\'' +
                ", nombreBD='" + nombreBD + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BD bd)) return false;
        return Objects.equals(getHost(), bd.getHost()) && Objects.equals(getUsuario(), bd.getUsuario()) && Objects.equals(getClave(), bd.getClave()) && Objects.equals(getNombreBD(), bd.getNombreBD());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHost(), getUsuario(), getClave(), getNombreBD());
    }
    public void conectar(){

    }
    public void desconectar(){

    }

    public ArrayList<String> ejecutar(String sql){
        return null;
    }

}


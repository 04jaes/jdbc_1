package Modelo;

import java.util.Objects;

public class VjPlataforma {
    private int idViedeoJuego;
    private int idPlataforma;

    //Constructor

    public VjPlataforma(int idViedeoJuego, int idPlataforma) {
        this.idViedeoJuego = idViedeoJuego;
        this.idPlataforma = idPlataforma;
    }

    //Setters & Getters

    public int getIdViedeoJuego() {
        return idViedeoJuego;
    }

    public void setIdViedeoJuego(int idViedeoJuego) {
        this.idViedeoJuego = idViedeoJuego;
    }

    public int getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    //Equals & Hash code

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VjPlataforma that)) return false;
        return getIdViedeoJuego() == that.getIdViedeoJuego() && getIdPlataforma() == that.getIdPlataforma();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdViedeoJuego(), getIdPlataforma());
    }
}

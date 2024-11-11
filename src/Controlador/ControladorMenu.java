package Controlador;

import Modelo.Lector;
import Vista.Menu;

public class ControladorMenu {
    public char mostrarMenu(){
        //Menu.mostrar();
        return Lector.pedir().charAt(0);
    }
}

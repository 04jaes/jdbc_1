package Controlador;

import Modelo.Lector;
import Vista.Menu;

public class ControladorMenu {
    //Arraylist de string pos = 0 -> titulo

    public static char mostrarMenu(){
        //Menu.mostrar();
        return Lector.pedir().charAt(0);
    }
}

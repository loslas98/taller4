package Desastre;

import Desaparecido.Desaparecido;

import java.util.ArrayList;

public class Tormenta extends Desastre{
    String intensidadViento;

    public Tormenta(String pais, String ciudad, String año, ArrayList<Desaparecido> desaparecidos, String intensidadViento) {
        super(pais, ciudad, año, desaparecidos);
        this.intensidadViento = intensidadViento;
    }


}

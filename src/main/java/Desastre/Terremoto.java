package Desastre;

import Desaparecido.Desaparecido;

import java.util.ArrayList;

public class Terremoto extends Desastre{
    private String gradosRichter;
    private String nombre;

    public Terremoto(String gradosRichter,String nombre,String pais, String ciudad, String año, ArrayList<Desaparecido> desaparecidos) {
        super(pais,ciudad,año,desaparecidos);
        this.gradosRichter = gradosRichter;
        this.nombre = nombre;
    }

    public String getGradosRichter() {
        return gradosRichter;
    }

    public void setGradosRichter(String gradosRichter) {
        this.gradosRichter = gradosRichter;
    }


}

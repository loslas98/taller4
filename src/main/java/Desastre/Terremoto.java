package Desastre;

import Desaparecido.Desaparecido;

import java.util.ArrayList;

public class Terremoto extends Desastre{
    private String gradosRichter;

    public Terremoto(String gradosRichter,String pais, String ciudad, String año, ArrayList<Desaparecido> desaparecidos) {
        super(pais,ciudad,año,desaparecidos);
        this.gradosRichter = gradosRichter;
    }

    public String getGradosRichter() {
        return gradosRichter;
    }

    public void setGradosRichter(String gradosRichter) {
        this.gradosRichter = gradosRichter;
    }
}

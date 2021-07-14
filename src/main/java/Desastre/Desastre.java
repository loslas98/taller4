package Desastre;

import Desaparecido.Desaparecido;

import java.util.ArrayList;

public class Desastre{
    private String pais;
    private String ciudad;
    private String año;
    private ArrayList<Desaparecido> desaparecidos;

    public Desastre(String pais, String ciudad, String año, ArrayList<Desaparecido> desaparecidos) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.año = año;
        this.desaparecidos = desaparecidos;
    }

    public Desastre(ArrayList<Desaparecido> desaparecidos) {
        this.desaparecidos = desaparecidos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public ArrayList<Desaparecido> getDesaparecidos() {
        return desaparecidos;
    }

    public void setDesaparecidos(ArrayList<Desaparecido> desaparecidos) {
        this.desaparecidos = desaparecidos;
    }

    public void listaDesparecidos(ArrayList<Desaparecido> desaparecidos){
        for (Desaparecido desaparecido:desaparecidos){
            System.out.println(desaparecido);

        }

    }
    public void agregarDesaparecidos(ArrayList<Desaparecido> desaparecidos,Desaparecido desaparecido){
        desaparecidos.add(desaparecido);

    }

    public void detalleDesastre(){

    }
}

package Desaparecido;

import Desastre.Terremoto;

public class Desaparecido {
    private String nombre;
    private String pais;
    private String edad;
    private String sexo;
    private Terremoto terremoto;

    public Desaparecido(String nombre, String pais, String edad, String sexo, Terremoto terremoto) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.sexo = sexo;
        this.terremoto = terremoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Desaparecido{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", edad='" + edad + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public String[] arreglo(){
        String nombre = this.nombre;
        String edad = this.edad;
        String pais = this.pais;
        String sexo = this.sexo;
        String terremotoNombre  = this.terremoto.getNombre();
        return new String[]{nombre,edad,pais,sexo,terremotoNombre};

    }
}

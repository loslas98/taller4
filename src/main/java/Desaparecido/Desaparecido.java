package Desaparecido;

public class Desaparecido {
    private String nombre;
    private String pais;
    private String edad;
    private String sexo;

    public Desaparecido(String nombre, String pais, String edad, String sexo) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.sexo = sexo;
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
}

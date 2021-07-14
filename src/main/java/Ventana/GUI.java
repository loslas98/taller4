package Ventana;

import Desaparecido.Desaparecido;
import Desastre.Terremoto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class GUI extends JFrame {
    private JPanel panel1;
    private JTable desaparecidosTerremoto;

    public GUI(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        this.setTitle("Desaparecidos Terremoto");
        this.setVisible(true);
        Object [] columnas = {"Nombre","Edad","Pais","Sexo","Terremoto"};
        desaparecidosTerremoto.setModel(new DefaultTableModel(null,columnas));
        ArrayList<Desaparecido> desaparecidos = new ArrayList<Desaparecido>();
        Terremoto valdivia = new Terremoto("Valdivia 1960",desaparecidos);
        Desaparecido max = new Desaparecido("max","chile","22","masculino",valdivia);
        valdivia.actualizarDesaparecidos(desaparecidos,max);
        Desaparecido john = new Desaparecido("john","chile","43","masculino",valdivia);
        valdivia.actualizarDesaparecidos(desaparecidos,john);
        Desaparecido ines = new Desaparecido("Ines","chile","43","femenino",valdivia);
        valdivia.actualizarDesaparecidos(desaparecidos,ines);
        Desaparecido mike = new Desaparecido("Michael","EEUU","23","masculino",valdivia);
        valdivia.actualizarDesaparecidos(desaparecidos,mike);

        listaDesaparecidos(desaparecidos);








    }

    public void listaDesaparecidos(ArrayList<Desaparecido> desaparecidos){
        for (Desaparecido desaparecido:desaparecidos){
            DefaultTableModel modelo = (DefaultTableModel) desaparecidosTerremoto.getModel();
            String[] datos = desaparecido.arreglo();
            modelo.addRow(datos);

        }

    }
}

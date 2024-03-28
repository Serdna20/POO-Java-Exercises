package com.mycompany.figurasdesuperheroes;

import coleccion.Coleccion;
import dimension.Dimension;
import figura.Figura;
import superheroe.Superheroe;

public class FigurasDeSuperheroes {

    public static void main(String[] args) {
        Superheroe volador = new Superheroe("Volador");
        Superheroe armadura = new Superheroe("Armadura");
        Superheroe acuatico = new Superheroe("Acuatico");
        
        volador.setDescription("Vuela");
        armadura.setDescription("Resistente");
        acuatico.setDescription("Viaja en el agua");
        
        Dimension small = new Dimension(10,10,10);
        Dimension medium = new Dimension(15,15,15);
        Dimension big = new Dimension(22,22,22);
        
        Figura superman = new Figura("20", 28000, medium, volador);
        Figura ironman = new Figura("21", 30000, big, armadura);
        Figura aquaman = new Figura("22", 18000, medium, acuatico);
        
        System.out.println(aquaman.toString());
        System.out.println(aquaman.getPrice());
        Coleccion collecion1 = new Coleccion("DC");
        collecion1.addFigura(superman);
        collecion1.addFigura(ironman);
        collecion1.addFigura(aquaman);
        collecion1.subirPrecio(21000,"22");
        System.out.println(aquaman.getPrice());
        volador.setCape(true);
        
        System.out.println(collecion1.toString());
        System.out.println(collecion1.masValioso());
        System.out.println(collecion1.getValorColeccion());
        System.out.println(collecion1.getVolumenColeccion());
        
    }
}

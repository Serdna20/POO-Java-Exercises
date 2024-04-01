package com.mycompany.poopersona;
import com.mycompany.poopersona.persona.Persona;
import java.util.Scanner;
public class POOPersona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona Liam = new Persona(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
        Persona Charlotte = new Persona(sc.next(), sc.nextInt(), sc.next().charAt(0));
        Persona Charise = new Persona();
        Charise.setNombre("Charise");
        Charise.setEdad(17);
        Charise.setSexo('M');
        Charise.setPeso(30);
        Charise.setAltura(1.6);
        
        Liam.esMayor();
        Charlotte.esMayor();
        Charise.esMayor();
        
        Liam.informarPeso();
        Charlotte.informarPeso();
        Charise.informarPeso();
        
        System.out.println(Liam.toString());
        System.out.println(Charlotte.toString());
        System.out.println(Charise.toString());
        
    }
}

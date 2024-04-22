package com.mycompany.testingjavaexceptions;
import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }
    
    public int division() {        
        while (true) {
            try {            
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese el número a dividir:");
                int a = sc.nextInt();
                System.out.println("Ingrese el cociente:");
                int b = sc.nextInt();
                return a/b;
            } catch (Exception e) {
                System.out.println("Valor de b no válido, ingrese los números nuevamente:");
            }
        }
    }
    
    public int division(int a, int b) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {
                return a/b;
            } catch (Exception  e) {                
                try {                    
                    System.out.println("Valor de b (0) no válido, ingrese un nuevo valor:");
                    b = sc.nextInt();
                } catch (Exception e2) {
                } 
            }
        }
            
    }
}

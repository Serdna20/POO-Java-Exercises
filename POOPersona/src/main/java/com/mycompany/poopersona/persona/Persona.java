package com.mycompany.poopersona.persona;
import java.util.Random;

public class Persona {
    String nombre;
    int edad;
    int dni;
    char sexo;
    double peso;
    double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;        
        this.sexo = 'H';
        this.peso = 1;
        this.altura = 1;
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = 1;
        this.altura = 1;    
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.dni = generaDNI();
    }
    
    public int calcularIMC() {
        final double imc = peso/(altura*altura);
        if (imc < 20) {
            return -1;
        }
        else if (imc >= 20 && imc <= 25) {
            return 0;
        }
        return 1;
    }
    
    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        }
        return false;
    }
    
    void comprobarSexo(char sexo) {
        if (!(sexo == 'H' || sexo == 'M')) {
            this.sexo = 'H';
        }
        else {
            this.sexo = sexo;
        }
    }
    
    int generaDNI() {
        Random random = new Random();
        return random.nextInt(100000000-9999999) + 9999999;    
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    public void esMayor() {
        if (esMayorDeEdad()) {
            System.out.println(nombre + " es mayor de edad.");
        }
        else {
            System.out.println(nombre + " es menor de edad.");
        }
    }
    
    public void informarPeso() {
        switch(calcularIMC()) {
            case -1:
                System.out.println(nombre + " se encuentra por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println(nombre + " se encuentra en su peso ideal.");
                break;
            case 1:
                System.out.println(nombre + " tiene sobrepeso.");
                break;
            default:
                break;
        }
    
    }
}

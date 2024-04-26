package com.mycompany.juegodelahorcado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class JuegoDelAhorcado {

    public static void main(String[] args) {      
        
        /* for (int index = 0; index <= word.length(); index++) {
            System.out.println(word.charAt(index));        
        } */  
        
        System.out.println("Ingrese su palabra:");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        String word = sc.nextLine().toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        
        int lettersAmount = word.length();
        int healthPoints = 20;
        sc.close();
        
        // Los numeros que no puede generar nuevamente
        ArrayList<Integer> guessedIndexes = new ArrayList<>();
        ArrayList<Character> lettersToGuess = new ArrayList<>();
        
        // Palabra ingresada en un array
        char[] letters = word.toCharArray();        
        
        // Letras de la palabra en un ArrayList
        for (char l : letters) {
            lettersToGuess.add(l);
        }
        
        String results;
        
        while (true) {
            int guess = random.nextInt(27-1);
            // This is basically a valid letter
            if (!guessedIndexes.contains(guess)) {
                // Ejecutar
                if (lettersToGuess.contains(alphabet.charAt(guess))) {
                    System.out.println("Le atinaste: "+alphabet.charAt(guess));
                    lettersAmount = lettersAmount-Collections.frequency(lettersToGuess,alphabet.charAt(guess));
                }
                else {
                    System.out.println(alphabet.charAt(guess));
                    healthPoints = healthPoints-1;
                }
                // Código que revisa si está o no
                guessedIndexes.add(guess);
                
                if (lettersAmount == 0) {
                    results = "You won";
                    break;
                }
                
                if (healthPoints==0) {
                    results = "Dead";
                    break;
                }
            }
        }
        
        System.out.println(results);
        
        
        
        
        
    }
}

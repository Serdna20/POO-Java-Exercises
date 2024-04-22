package com.mycompany.testingjavaexceptions;

public class TestingJavaExceptions {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        /*
        try {
            int answer = calculator.division(4, 2);
            System.out.println(answer);
        } catch (Exception e) {
            System.out.println("A problem has ocurred!");
        } finally {
            System.out.println("Finally executed");
        }
        System.out.println("Fuera del bloque");
        

        try {
            int[] numbers = new int[2];
            numbers[5] = 2/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicion de array no valida");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Operacion no valida");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println("Ha ocurrido un error");
        }

        */
        int res = calculator.division(2, 0);
        System.out.println(res);
        
        System.out.println(calculator.division());
    }
}

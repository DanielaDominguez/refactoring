package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// refactorizar el siguiente codigo

        /* Scanner console = new Scanner( System.in);
        System.out.print("Enter addition number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter addition number 2  ");
        int num2 = console.nextInt();
        int addition = num1 + num2;
        System.out.println( num1+" + "+num2+" = "+ addition);

        System.out.print("Enter subtraction number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter subtraction number 2  ");
        num2 = console.nextInt();
        int subtraction = num1 - num2;
        System.out.println( num1+" - "+num2+" = "+ subtraction);

        System.out.print("Enter multiplication number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter multiplication number 2  ");
        num2 = console.nextInt();
        int multiplication = num1 * num2;
        System.out.println( num1+" * "+num2+" = "+ multiplication);

        System.out.print("Enter division number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter division number 2  ");
        num2 = console.nextInt();
        int division = num1 / num2;
        System.out.println( num1+" / "+num2+" = "+ division);
        */

        Scanner console = new Scanner( System.in);

        System.out.print("Enter number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter number 1  ");
        int num2 = console.nextInt();
        System.out.println("Ingresa la operación deseana: \n1)Suma \n2)Resta \n3)Mutiplicación \n4)División");
        int operacion = console.nextInt();
        console.nextLine();
        float resultado = 0;

        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                System.out.println( num1+" + "+num2+" = "+ resultado);
            break;
            case 2:
                resultado = num1 - num2;
                System.out.println( num1+" - "+num2+" = "+ resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println( num1+" * "+num2+" = "+ resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println( num1+" / "+num2+" = "+ resultado);
                break;
            default:
                System.out.println("La operación que seleccionaste es inválida");
                break;
        }
        console.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import java.util.*;
/**
 *
 * @author Aluno CA
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=================Calculadora==================");
        System.out.println("Escreva um numero: ");
        int Valor1 = scan.nextInt();
        
        System.out.println("Escreva o segundo valor: ");
        int Valor2 = scan.nextInt();
        
        scan.close();
        
        double Soma = Valor1+Valor2;
        
        double Mult = Valor1 * Valor2;
        
        double Div = (Valor1) / (Valor2);
        
        double Sub = Valor1 - Valor2;
        
        System.out.println("\no da Soma dos dois numeros é: " + Soma);
        System.out.println("======================================");
         System.out.println("o Resultado da Subtração dos dois numeros é: " + Sub);
         System.out.println("======================================");
          System.out.println("o Resultado da Multiplicação dos dois numeros é: " + Mult);
          System.out.println("======================================");
           System.out.println("o Resultado da Divisão dos dois numeros é: " + Div);
           System.out.println("======================================");
        
        
        
        
        
        // TODO code application logic here
    }
    
}

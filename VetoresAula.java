/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetores;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class Vetores {

    public static void main(String[] args) {
       
        int numero [] = new int[5];
        Scanner entrada = new Scanner (System.in);
        
        for (int indice=0; indice<5;indice++)
        {
            System.out.println("Digite um Numero:");
            numero[indice] = entrada.nextInt();
        }
        
        
        
        
    }
}

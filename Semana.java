/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana;

import java.util.*;

/**
 *
 * @author Aluno CA
 */
public class Semana {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva um numero de 1 a 7, referente aos dias da semana:");
        int Numerodia = scan.nextInt();
        
        scan.close();
        
        switch (Numerodia){
          
            case 1:
                System.out.println("Hoje é Domingo");
                
                break; 
                
            case 2 :
                System.out.println("Hoje é Segunda");
                
                break;
                
            case 3 : 
                System.out.println("Hoje é Terça");
                
                break;
                
            case 4:
                System.out.println("Hoje é quarta");
                
                break;
                
            case 5:
                System.out.println("Hoje é quinta");
                
                break;
                
            case 6:
                System.out.println("Hooje é sexta");
                
                break;
              
            case 7:
                System.out.println("Hoje é sabado");
                break;
                
            default:
                
                System.out.println("NAO EXISTE");
                
                
                break;
                        
        }         
    }
}

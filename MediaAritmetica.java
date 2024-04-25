/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaaritmetica;

import java.util.*;
/**
 *
 * @author Aluno CA
 */
public class MediaAritmetica {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite num1");
        double Num1 = scan.nextDouble();
        
        System.out.println("Digite num2");
        double Num2 = scan.nextDouble();
        
        scan.close ();
        
        double Res = (Num1 + Num2)/2;
        
        if (Res < 4.0 ){
            
            System.out.println("Reprovado");
        }else if (Res >7.0){ 
            
            System.out.println("Exame"); 
            
        }else if (Res >7.1){ 
        
        System.out.println("Aprovado");
        }else{}
        
        System.out.println("Sua media foi:" + Res);
        }
    
        
    }

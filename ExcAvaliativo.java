/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exc.avaliativo;
 import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
//TABUADA COM FOR
public class ExcAvaliativo {

    public static void main(String[] args) {
        
        int  valor;
        int mult = 0; 
        int res = 0;
        
        Scanner tab = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        valor = tab.nextInt();
        
        for(int X = 0; X < 10; X++){
            res = valor * ++mult;
            System.out.println(valor +"x" +mult + "=" +res);
            
        }
       
        
          
        
        
        
      
    }
}

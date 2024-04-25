/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automovel;

 import java.util.*;

/**
 *
 * @author Aluno CA
 */
public class Automovel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva o tempo estimado do automovel ate o destino em horas:");
        int Tempo = scan.nextInt();
        
        System.out.println("Digite a distancia do seu ponto de partida ate o destino:");
        int Km = scan.nextInt ();
        
        scan.close();
        
        double Gas = Km / Tempo;
        
        System.out.println("O gasto de gasolina foi "+ Gas + ("L"));
        
        
    }
}

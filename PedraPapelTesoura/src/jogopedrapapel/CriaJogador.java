/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogopedrapapel;

import java.util.Scanner;

/**
 *
 * @author erica
 */
public class CriaJogador {
    public static void CriaJogador()
    {
                
        String nome;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome do Jogador: ");
        nome = sc.next();
        
        //instânciar um objeto - criar o objeto
        Jogador player = new Jogador(nome);
        
        System.out.println("Player 1 - " + player.getNome()); 
        System.out.println("Player 2 - Computador");
        
    }
    
}

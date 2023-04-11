/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademicoheranca;

public class teste {

    
    public static void main(String[] args) {
        ProfessorHorista profHorista = new ProfessorHorista();
        profHorista.nome = "Rodrigo";
        ProfessorPesquisador profPesq = new ProfessorPesquisador();
        profPesq.nome = "José";
        profHorista.lecionar();
        profPesq.lecionar();
    }
       
}

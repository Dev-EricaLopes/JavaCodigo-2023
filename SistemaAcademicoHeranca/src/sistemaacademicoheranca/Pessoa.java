/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademicoheranca;

/**
 *
 * @author erica
 */
public class Pessoa {
    private String nome;
    private int idade;

    
    public Pessoa() {
        System.out.println("Construindo Pessoa...");
        this.setNome(nome);
        this.setIdade(idade);
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}

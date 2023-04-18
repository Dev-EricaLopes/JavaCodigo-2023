/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademicoheranca;

/**
 *
 * @author erica
 */
public class AlunoDeGraduacao extends Aluno
{

    public AlunoDeGraduacao() {
        super("Alice", 19);
    }
    //não definimos nome e idade aqui mais..eles são herdados.
    double nota1, nota2, notaFinal; 
}

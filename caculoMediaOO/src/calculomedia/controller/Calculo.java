package calculomedia.controller;

import javax.swing.JOptionPane;

import calculomedia.classes.Aluno;

public class Calculo {

	
	public static void main (String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno ?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String nota1 = JOptionPane.showInputDialog("Qual a segunda nota ?");
		String nota2 = JOptionPane.showInputDialog("Qual a terceira nota ?");
		String nota3= JOptionPane.showInputDialog("Qual a terceira  nota ?");
		String nota4 = JOptionPane.showInputDialog("Qual a quarta nota?");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNota1(Double.valueOf(nota1));
		aluno1.setNota2(Double.valueOf(nota2));
		aluno1.setNota3(Double.valueOf(nota3));
		aluno1.setNota4(Double.valueOf(nota4));
	
		System.out.println("O nome é :"+ aluno1.getNome());
		System.out.println("A idade é :"+ aluno1.getIdade());
		System.out.println("A media do aluno "+ aluno1.getNome() + "é :"+ aluno1.getMedia());
		
		/*Retornando tipo boolean e utilizando condições ternarias*/
		System.out.println("Resultado de aprovação :" + ( aluno1.getAprovacao() ? "Aluno aprovado" : "Aluno reprovado"));
		/*Retornando tipo string*/
		System.out.println("Resultado da aprovação é :" + aluno1.getAprovacao());
		
			}
	
}

package calculomedia.controller;

import calculomedia.classes.Aluno;

public class Calculo {

	
	public static void main (String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("mateus");
		aluno1.setIdade(19);
		
		System.out.println("O nome é :"+ aluno1.getNome());
		System.out.println("A idade é :"+ aluno1.getIdade());
		
			}
}

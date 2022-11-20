package calculomedia.controller;

import calculomedia.classes.Aluno;

public class Calculo {

	
	public static void main (String[] args) {
		
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("mateus");
		aluno1.setIdade(19);
		aluno1.setNota1(70);
		aluno1.setNota2(70);
		aluno1.setNota3(70);
		aluno1.setNota4(90.5);
	
		System.out.println("O nome é :"+ aluno1.getNome());
		System.out.println("A idade é :"+ aluno1.getIdade());
		System.out.println("A media do aluno "+ aluno1.getNome() + "é :"+ aluno1.getMedia());
		
			}
}

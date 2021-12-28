package br.com.alura;

import java.util.ArrayList;

public class TestandoListas {
	
	public static void main(String[] args) {
		
		String aula1 = "Conhencendo mais de listas";
		String aula2="Modelando a classe aula";
		String aula3="Trabalhando com cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);//adicionando os objetos a array list
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		
	}

}

package menu;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int verf = 1, idade = 0;
		String nome = null;
		
		while(verf > 0) {
			System.out.println(" 1- Digite um nome e uma idade \n 2- Listar nome e idade \n 3- Alterar Nome e Idade \n 4- Apagar nome \n 5- Sair\n");
			System.out.println("Digite uma opcao: ");
			int numero = input.nextInt();
			switch(numero) {
				case 1: 
					if(nome == null && idade == 0) {
						System.out.println("Digite um nome: ");
						nome = input.next();
						System.out.println("Digite uma idade: ");
						idade = input.nextInt();
					}else {
						System.out.println("Já existe nome e idade cadastrados");
					}
					if(idade <= 0) {
						System.out.println("Idade invalida!");
						nome = null;
						idade = 0;
						break;
					}
					System.out.println("Nome e idade cadastrado com sucesso!");
					break;
				case 2: 
					if(nome != null && idade != 0) {
						System.out.println("Nome: " + nome + " idade: " + idade + "\n");	
					}else {
						System.out.println("Nao contem dados cadastrados!");
					}
					break;
				case 3:
					if(nome != null && idade != 0) {
						System.out.println("Nome antigo: " + nome + " idade antiga: " + idade);
						System.out.println("Digite o novo nome: ");
						nome = input.next();
						System.out.println("Digite a nova idade: ");
						idade = input.nextInt();
						System.out.println("Dados cadastrado com sucesso!");
						}else {
						System.out.println("Nenhum dados Cadastrado!");
					}
				case 4:
					if(nome != null && idade != 0) {
						System.out.println("Nome que esta cadastrado: " + nome + " idade que esta cadastrada: " + idade);
						nome = null;
						idade = 0;
						System.out.println("Dados excluidos com sucesso!");
					}else {
						System.out.println("Nao contem dados cadastrados");
					}
				case 5:
					verf = 0;
					System.out.println("Software encerrado com sucesso!");
				default:
					System.out.println("Opcao digitada invalida!");
					
					
			}
			
		}

	}

}

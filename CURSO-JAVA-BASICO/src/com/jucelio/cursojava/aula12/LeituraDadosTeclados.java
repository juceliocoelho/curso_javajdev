package com.jucelio.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclados {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scanner.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scanner.next();
        System.out.println("Seu primeiro nome �: " + primeiroNome);
        
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Sua idade �: " + idade);
        
        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Sua idade �: " + altura);
        System.out.println("Didite o seu primeiro nome , idade, quantidade de filhos, altura, e se tem bichinho de estima��o ");
	}

}


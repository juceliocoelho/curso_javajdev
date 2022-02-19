package com.jucelio.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclados {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scanner.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scanner.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);
        
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Sua idade é: " + idade);
        
        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Sua idade é: " + altura);
        System.out.println("Didite o seu primeiro nome , idade, quantidade de filhos, altura, e se tem bichinho de estimação ");
	}

}


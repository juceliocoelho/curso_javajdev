package exercicio5;

import java.util.Scanner;

public class tete6 {

	public static void main(String[] args) {


		System.out.println("Digite o valor 140811");
		Scanner input = new Scanner(System.in);
		int N, horas, minutos, segundos;

		N = input.nextInt();

		horas = N / 3600;
		minutos = (N % 3600) / 60;
		segundos = (N % 3600) % 60;
		System.out.println(horas + ":" + minutos + ":" + segundos);

		
	}

}

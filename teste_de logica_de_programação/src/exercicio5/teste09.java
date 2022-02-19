package exercicio5;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class teste09 {
  public static void main(String[] args) {
	  Scanner ler = new Scanner(System.in);
	  
	  String posiçoes =JOptionPane.showInputDialog("Quantos números você vai digitar? ");
	  
	  int n = 10;
	  int vet[] = new int[n];
	  int i = 0;
	  
	  
  	  System.out.printf("Digite um numero:");
	    vet[i] = ler.nextInt();
		for(i = 0; i <n; i++) {
		}
			
		int soma = 0;
		int menor = vet[0];
		int maior = vet[0];
		for (i=0;i<n; i++) {
			soma = soma + vet[i];
			if(vet[i] <menor)
				menor = vet[i];
			if(vet[i]> maior)
				maior = vet[i];
		}
		System.out.printf("\n");
	    for (i=0; i<n; i++) {
	      if (vet[i] == menor)
	        System.out.printf("v[%d] = %2d <--- menor valor\n", i, vet[i]);
	      else if (vet[i] == maior)
	              System.out.printf("v[%d] = %2d <--- maior valor\n", i, vet[i]);
	           else System.out.printf("v[%d] = %2d\n", i, vet[i]);
	    }

	    System.out.printf("\nSoma = %d\n", soma);
	  

		   
   	  
    }	
  }	
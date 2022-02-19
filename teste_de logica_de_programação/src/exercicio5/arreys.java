package exercicio5;

import javax.swing.JOptionPane;

public class arreys {

	public static void main(String[] args) {

		String posiçoes =JOptionPane.showInputDialog("Quantos números você vai digitar? ");
		
		int numero = 0;
		int N = 9;
		int vet[] = new int[N ];
		int i = 0;
		int numero_par = 0 ;
		int numero_impar = 0;
		
		
		System.out.printf("Digite um numero: " );
		
		
		if(numero%2 ==0) {
			numero_par += numero;
		}else {
			numero_impar += numero;
		}
	
			 System.out.println("NUMEROS NEGATIVOS:\n");
		    for (i = 0; i < numero_impar; i++) {
		        if (vet[i] < 0) {
		            System.out.printf("%d\n", vet[i]);
		        }
       }
		    for (i = 0; i < N; i++);
		
	    }
  }

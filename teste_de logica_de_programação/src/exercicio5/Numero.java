package exercicio5;

	import java.util.Scanner;

	public class Numero {
	    public static void main(String[] args) {
	    	
	    	 System.out.println("Digite um numero ");
	        Scanner entrada = new Scanner(System.in);
	        int num = entrada.nextInt();

	       
	        for (int i = 0; i <= num; i++) {
	          if (i % 2 == 1) {
	              System.out.println(i);
	            }
	        }
	    }

	}

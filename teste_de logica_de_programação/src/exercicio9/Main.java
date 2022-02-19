	package exercicio9;

	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	       
	        int quantidadeNumeros = 0;

	        /**
	         *  N�mero digitado
	         */
	        int numeroDigitado = 0;

	        /**
	         *  Atributo l�gico para controlar o fluxo do programa
	         *  valor falso = falha na entrada de dados
	         *  valor true = dados v�lidos para digita��o
	         */
	        boolean continuar = false;

	        /**
	         *  Para evitar erros em tempo de execu��o usei try catch
	         */
	        try {

	            /**
	            * Espera a digita��o de um n�mero inteiro
	             */
	            System.out.print("Quantos n�meros voc� vai digitar? ");
	            quantidadeNumeros = scan.nextInt();

	            /**
	             *  verifica se o n�mero est� dentro da faixa v�lida > 0 <= 9
	             *  e seta true para o atributo continuar
	             */
	            continuar = quantidadeNumeros <= 9 && quantidadeNumeros >0;

	        } catch (Exception e) {

	            /**
	             *  Se n�o for digitado um valor n�merico captura erro
	             */
	            System.err.println("Ops! Algo deu errado!  Digite apenas n�meros inteiros: " + e.getMessage());

	        }

	        /**
	         *  Se continuar for true, solicita os n�meros e salva no vetor
	         */
	        if (continuar) {

	            /**
	             * Cria um vetor com o tamanho correto para receber
	             * a quantidade de n�meros a serem digitados
	             */
	            int numeros[] = new int[quantidadeNumeros];

	            /**
	             * Loop para solicitar os n�meros
	             */
	            for (int i = 0; i < quantidadeNumeros; i++) {

	                numeroDigitado = 0;

	                try {

	                    System.out.print("Digite um n�mero: ");
	                    numeroDigitado = scan.nextInt();
	                    numeros[i] = numeroDigitado;

	                    /**
	                     *  Verifica se todos os n�meros j� foram digitados
	                     *  e lista somente os negativos
	                     */
	                    if (i == (quantidadeNumeros - 1)) {
	                        System.err.println("N�meros Negativos. ");

	                        for (int y = 0; y < quantidadeNumeros; y++) {

	                            if (numeros[y] < 0) System.err.println(numeros[y]);

	                        }
	                        System.err.println("Fim");
	                    }

	                } catch (Exception e) {

	                    System.err.println("Ops! Algo deu errado!  Digite apenas n�meros inteiros: " + e.getMessage());

	                }

	            }

	        } else {

	            /**
	             *  N�mero informado n�o � v�lido
	             */
	            System.err.println("O n�mero deve ser maior que 0 ou menor ou iqual a 9. ");

	        }
	        scan.close();

	    }

	}



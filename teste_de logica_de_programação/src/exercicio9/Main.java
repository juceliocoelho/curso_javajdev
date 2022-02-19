	package exercicio9;

	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	       
	        int quantidadeNumeros = 0;

	        /**
	         *  Número digitado
	         */
	        int numeroDigitado = 0;

	        /**
	         *  Atributo lógico para controlar o fluxo do programa
	         *  valor falso = falha na entrada de dados
	         *  valor true = dados válidos para digitação
	         */
	        boolean continuar = false;

	        /**
	         *  Para evitar erros em tempo de execução usei try catch
	         */
	        try {

	            /**
	            * Espera a digitação de um número inteiro
	             */
	            System.out.print("Quantos números você vai digitar? ");
	            quantidadeNumeros = scan.nextInt();

	            /**
	             *  verifica se o número está dentro da faixa válida > 0 <= 9
	             *  e seta true para o atributo continuar
	             */
	            continuar = quantidadeNumeros <= 9 && quantidadeNumeros >0;

	        } catch (Exception e) {

	            /**
	             *  Se não for digitado um valor númerico captura erro
	             */
	            System.err.println("Ops! Algo deu errado!  Digite apenas números inteiros: " + e.getMessage());

	        }

	        /**
	         *  Se continuar for true, solicita os números e salva no vetor
	         */
	        if (continuar) {

	            /**
	             * Cria um vetor com o tamanho correto para receber
	             * a quantidade de números a serem digitados
	             */
	            int numeros[] = new int[quantidadeNumeros];

	            /**
	             * Loop para solicitar os números
	             */
	            for (int i = 0; i < quantidadeNumeros; i++) {

	                numeroDigitado = 0;

	                try {

	                    System.out.print("Digite um número: ");
	                    numeroDigitado = scan.nextInt();
	                    numeros[i] = numeroDigitado;

	                    /**
	                     *  Verifica se todos os números já foram digitados
	                     *  e lista somente os negativos
	                     */
	                    if (i == (quantidadeNumeros - 1)) {
	                        System.err.println("Números Negativos. ");

	                        for (int y = 0; y < quantidadeNumeros; y++) {

	                            if (numeros[y] < 0) System.err.println(numeros[y]);

	                        }
	                        System.err.println("Fim");
	                    }

	                } catch (Exception e) {

	                    System.err.println("Ops! Algo deu errado!  Digite apenas números inteiros: " + e.getMessage());

	                }

	            }

	        } else {

	            /**
	             *  Número informado não é válido
	             */
	            System.err.println("O número deve ser maior que 0 ou menor ou iqual a 9. ");

	        }
	        scan.close();

	    }

	}



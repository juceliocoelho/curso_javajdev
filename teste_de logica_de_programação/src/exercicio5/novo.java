package exercicio5;

import javax.swing.JOptionPane;

public class novo {
    public static void main(String[] args){
       
    	String posiçoes =JOptionPane.showInputDialog("Quantos números você vai digitar? ");
    	
    	System.out.println("Digite o primeiro numero ");
        // declaração de vetor
        int[] vetor = new int[9];
        
        // declaração de variáveis
        int numeros_impar = 0, numero_par = 0;
        
        do{
            // validação números ímpares
            if(numeros_impar % 2 == 1){
                vetor[numero_par] = numeros_impar;
                numero_par++;
            }
            numeros_impar++;
        }while(numero_par < 10);
        
        // zerando o valor de i
        numeros_impar = 0;
        
        // imprimindo os números ímpares
        for(; numeros_impar < vetor.length; numeros_impar++){
            System.out.println(vetor[numeros_impar]);
        }
    } 
} 

package exercicio5;

import javax.swing.JOptionPane;

public class novo {
    public static void main(String[] args){
       
    	String posi�oes =JOptionPane.showInputDialog("Quantos n�meros voc� vai digitar? ");
    	
    	System.out.println("Digite o primeiro numero ");
        // declara��o de vetor
        int[] vetor = new int[9];
        
        // declara��o de vari�veis
        int numeros_impar = 0, numero_par = 0;
        
        do{
            // valida��o n�meros �mpares
            if(numeros_impar % 2 == 1){
                vetor[numero_par] = numeros_impar;
                numero_par++;
            }
            numeros_impar++;
        }while(numero_par < 10);
        
        // zerando o valor de i
        numeros_impar = 0;
        
        // imprimindo os n�meros �mpares
        for(; numeros_impar < vetor.length; numeros_impar++){
            System.out.println(vetor[numeros_impar]);
        }
    } 
} 

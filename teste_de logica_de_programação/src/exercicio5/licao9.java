package exercicio5;


import javax.swing.JOptionPane;

public class licao9 {

	public static void main(String[] args) {

		
		String posi�oes =JOptionPane.showInputDialog("Quantos n�meros voc� vai digitar? ");
		double [] numero = new double[Integer.parseInt(posi�oes)];
		
		for (int pos = 0; pos < numero.length; pos ++) {
			String valor = JOptionPane.showInputDialog("Digite um numero = " + pos);
			numero[pos]= Double.valueOf(valor);		}
		for (int pos = 0; pos <numero.length; pos++) {
		System.out.println(" Numero " + (pos + 1) + " � = " + numero [pos]);
	}

}
}
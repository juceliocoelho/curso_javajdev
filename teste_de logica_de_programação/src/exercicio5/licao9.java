package exercicio5;


import javax.swing.JOptionPane;

public class licao9 {

	public static void main(String[] args) {

		
		String posiçoes =JOptionPane.showInputDialog("Quantos números você vai digitar? ");
		double [] numero = new double[Integer.parseInt(posiçoes)];
		
		for (int pos = 0; pos < numero.length; pos ++) {
			String valor = JOptionPane.showInputDialog("Digite um numero = " + pos);
			numero[pos]= Double.valueOf(valor);		}
		for (int pos = 0; pos <numero.length; pos++) {
		System.out.println(" Numero " + (pos + 1) + " é = " + numero [pos]);
	}

}
}
package exercicio8;
import java.io.IOException;
import java.util.Scanner;

class InterfaceTexto {
private Scanner entrada;
private CordenadasDeUmponto x;
private CordenadasDeUmponto y;

public InterfaceTexto(){
entrada = new Scanner(System.in);
x = new CordenadasDeUmponto();
y = new CordenadasDeUmponto();
}

public void executar(){

   double x= entrada.nextDouble();
   double y = entrada.nextDouble();
  
   CordenadasDeUmponto cordenadas = new CordenadasDeUmponto();
   System.out.println(cordenadas.getQuadrantes(x,y));
}
}

class CordenadasDeUmponto {
//atributos
private double x =0, y = 0 ;

public String getQuadrantes(double x , double y){
if (x>0 && y>0){
return “Q1”;

}
 
if(x<0 && y>0){
   return "Q2" ;

} 

if(x<0 && y<0){
   return "Q3";
}

if(x>0 && y<0){
   return "Q4";
}

if(x==0 && y==0){
    return "Origem";
} 

if(y==0){
    return "Eixo X";

}

if(x==0){
    return "Eixo Y";
}
return "";
}
}

public class TESTE8{
public static void main (String[] args) throws IOException{
InterfaceTexto T = new InterfaceTexto();

  T.executar();  
  
}
}




		

import java.util.Scanner;
public class EjercicioClase{

public static void main(String []args){

Scanner sc = new Scanner(System.in);

int DatoEntrada = 0;
		System.out.println("Inserte la cantidad deseada");
		DatoEntrada = sc.nextInt();

if		(DatoEntrada % 10 == 0){
		System.out.println(DatoEntrada);


}else {System.out.println("Tu dato es invalido");}


}
}
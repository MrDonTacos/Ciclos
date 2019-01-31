import java.util.Scanner;
public class EjercicioClase{

public static void main(String []args){

Scanner sc = new Scanner(System.in);

int DatoEntrada = 0;

		DatoEntrada = sc.nextInt();

if		(DatoEntrada % 10 == 0){
		System.out.println("Tu dato es valido");


}else {System.out.println("Tu dato es invalido");}


}
}
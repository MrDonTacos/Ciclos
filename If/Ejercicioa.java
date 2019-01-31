import java.util.Scanner;
public class Ejercicioa{

public static void main(String []args){

Scanner sc = new Scanner(System.in);

int Horas = 0;
int TotalDinero = 0;

			System.out.println("Inserte numero de horas trabajadas");
			Horas = sc.nextInt();

if		(Horas <= 40){
		Horas = 4 * Horas;
		TotalDinero = Horas;
		System.out.println("Tu salario es: " + TotalDinero);
}else if	(Horas > 40){
		Horas = Horas % 10;
		Horas = Horas * 6;
		TotalDinero = Horas + 40 * 4 ;
		System.out.println("Tu salario es: " + TotalDinero);

}

}

}
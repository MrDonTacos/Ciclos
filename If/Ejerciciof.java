import java.util.Scanner;
public class Ejerciciof{

public static void main(String []args){

Scanner sc = new Scanner(System.in);

double m2 = 0.0;
double Balcon = 0.0;
double VentExt = 0.0;
double VentInt = 0.0;
int NumYears = 0;
double SemiTotal = 0;
double Total = 0;
double Porcentaje = 0.0;

		System.out.println("Inserte Metros Cuadrados de su casa");
		m2 = sc.nextDouble();

		System.out.println("Inserte número de balcones de su casa");
		Balcon = sc.nextDouble();


		System.out.println("Inserte número de ventanas Exteriores");
		VentExt = sc.nextDouble();


		System.out.println("Inserte número de ventanas Interiores");
		VentInt = sc.nextDouble();


		System.out.println("Inserte cantidad de años de su casa");
		NumYears = sc.nextInt();

		m2 = m2 * 1000.0;
		Balcon = Balcon * 200.0;
		VentExt = VentExt * 100.0;
		VentInt = VentInt * 25.0;
		SemiTotal = m2 + Balcon + VentExt + VentInt;

		if(NumYears > 10 && NumYears < 20){
		Porcentaje = SemiTotal * .10;
		Total = SemiTotal - Porcentaje;
		System.out.println("Los impuestos por tu casa son: " + Total);

}else if	(NumYears > 20){	
		Porcentaje = SemiTotal * .20;
		Total = SemiTotal - Porcentaje;
		System.out.println("Los impuestos por tu casa son: " + Total);

}else if     	(NumYears < 10) {
		System.out.println("Los impuestos por tu casa son: " + SemiTotal);
		

}else { System.out.println("Inserte datos validos"); }

}

}
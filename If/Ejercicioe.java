import java.util.Scanner;
public class Ejercicioe{

public static void main (String [] args){

Scanner sc = new Scanner(System.in);
String Nom = "";
int Sal = 0;
double Por = 0.0;
double SalTot = 0.0;
double Excedente = 0.0;
String Imp = "";

			System.out.println("Inserte nombre");
			Nom = sc.nextLine();

			System.out.println("Inserte su salario");
			Sal = sc.nextInt();
			
if              (Sal <= 2000){
			Imp = "Ninguno";
			SalTot = Sal;

}else if	(Sal > 2000 && Sal <= 5000){
		Imp = "2%";
		Excedente = Sal - 2000;
		Por = Excedente * 0.02;
		SalTot = Sal - Por;
}else if 	(Sal > 5000){
		Excedente = Sal - 5000;
		Imp = "5%";
		Por = Excedente * 0.05;
		SalTot = Sal - (Por + 500);


}		
			System.out.println("Su nombre es: " + Nom);	
			System.out.println("Su salario bruto es: " + Sal);	
			System.out.println("Su clave de impuesto es: " + Imp );	
			System.out.println("El importe del impuesto es: " + Por);
			System.out.println("Su Salario Total es: " + SalTot);		
}
}
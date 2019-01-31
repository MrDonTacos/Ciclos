import java.util.Scanner;
public class Examen{

String Br1 ="";
String Br2 ="";
int Yr1 =0;
int Yr2 =0;

public void Leer(){

Scanner sc = new Scanner(System.in);

System.out.println("Inserte nombre del primer hermano");
	Br1 = sc.next();

System.out.println("Inserte edad del primer hermano");
	Yr1 = sc.nextInt();

System.out.println();
System.out.println();

System.out.println("Inserte nombre del segundo hermano");
	Br2 = sc.next();
System.out.println("Inserte edad del segundo hermano");
	Yr2= sc.nextInt();
}

public void Comparar(){
if	(Yr1>Yr2){

	System.out.println("El Hermano mayor es: " + Br1);
	
	Yr2 = Yr1 - Yr2;
	System.out.println("Es " + Yr2 + " años mayor que el menor" );

}else {

	System.out.println("El hermano mayor es: " + Br2);

	Yr1 = Yr2 - Yr1;
	System.out.println("Es " + Yr1 + " años mayor que el menor");

}
}

public static void main(String[] args){

Examen obj = new Examen();

obj.Leer();
obj.Comparar();

}

}







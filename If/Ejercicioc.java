import java.util.Scanner;
public class Ejercicioc{

public static void main (String[] args){

Scanner sc = new Scanner(System.in);
int Num1;
int Num3;
int Num3Cif = 0;

		System.out.println("Inserte numero de 3 cifras");	
		Num3Cif = sc.nextInt();

if (Num3Cif >= 100 && Num3Cif <= 999){
		Num1 = Num3Cif / 100;
		Num3 = Num3Cif % 10;

if (Num1 == Num3){ 
		System.out.println("Su numero es Capicúa");
}else{ System.out.println("Su número no es Capicúa");}


}else{ System.out.println("Inserte un numero de 3 digitos");}

}

}
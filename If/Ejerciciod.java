import java.util.Scanner;
public class Ejerciciod{

public static void main(String []args){

int Dado1 = 0;
int Dado2 = 0;
int Dado3 = 0;
Scanner sc = new Scanner(System.in);

		System.out.println("Inserte número del dado 1");
		Dado1 = sc.nextInt();

		System.out.println("Inserte número del dado 2");
		Dado2 = sc.nextInt();

		System.out.println("Inserte número del dado 3");
		Dado3 = sc.nextInt();

if 		((Dado1 == 6 && Dado2 != 6 && Dado3 != 6) || (Dado2 == 6 && Dado1 != 6 && Dado3 != 6) || (Dado3 == 6 && Dado2 != 6 && Dado1 != 6)){
		System.out.println("Regular");

}else if	(Dado1 == 6 && Dado2 == 6 && Dado3 != 6|| Dado1 == 6 && Dado3 == 6  && Dado2 != 6 || Dado1 != 6 && Dado2 == 6 && Dado3 == 6){
		System.out.println("Muy bien");

}else if	(Dado1 == 6 && Dado2 == 6 && Dado3 == 6){
		System.out.println("Excelente");

}else {System.out.println("Pesimo");}

}
}
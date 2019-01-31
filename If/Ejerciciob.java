import java.util.Scanner;
public class Ejerciciob{

public static void main(String []args){

Scanner sc = new Scanner(System.in);

int Num1 = 0;
int Num2 = 0;
int Num3 = 0;
int Total =0;

		System.out.println("Inserte número de dos digitos");
		Num1 = sc.nextInt();

if		(Num1 >= 10 && Num1 <=99){
		Num2 = Num1 /10;
		Num3 = Num1 % 10;
		Total = Num2 + Num3;
	
		System.out.println("La suma de sus dos digitos es: " + Total);

}

}
}
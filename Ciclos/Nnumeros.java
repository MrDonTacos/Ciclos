import java.util.Scanner;
public class Nnumeros{

int Num = 0;
int Pares = 0;
int Impares = 0;

public void Leer(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserte n�mero entero: ");
			Num = sc.nextInt();
}
public void Operacion(){

while(Num != 0){
		Num = Num % 2;

if(Num == 0 ){
		 Pares = Pares + 1;
}else{
		Impares = Impares + 1;
}
		Leer();
			
}
}	
public void Presentar(){

System.out.println("Tu cantidad de n�meros pares es: " + Pares);
System.out.println("Tu cantidad de n�meros primos es: " + Impares);
}
}
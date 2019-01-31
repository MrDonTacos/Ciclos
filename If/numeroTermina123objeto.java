import java.util.Scanner;
public class numeroTermina123objeto{

int num1 = 0;
int dig1 = 0;
int dig2 = 0;
int Resultado = 0;
			
public void leer(){
			Scanner sc = new Scanner(System.in);

			System.out.println("Inserte un numero de dos digitos que termine en: 1,2,3");
			num1=sc.nextInt();
}

public void Num2Num3(){
if(num1 >= 10 && num1 <= 99){
			dig1 = num1%10;
			dig2 = num1/10;
			}else{ 			System.out.println("Inserte un numero valido");}

}


public void CalcularValores123(){
if(dig1 == 1){
			Resultado = dig1;
}else if (dig1 == 2){
			Resultado = dig1 + dig2;
}else if(dig1 == 3){

			Resultado = dig1 * dig2;
}
}

public void PresentarValores(){

if(dig1 == 1){
			System.out.println(Resultado); 
}else if (dig1 == 2){
			System.out.println(Resultado);
}else if(dig1 == 3){
			System.out.println(Resultado);
}
}


}


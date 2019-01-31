import java.util.Scanner;
public class Primos{

int Num = 0;
double div = 0.0; 
int Try = 0;

public void Leer(){

Scanner sc = new Scanner(System.in);
System.out.println("Inserte número");
Num = sc.nextInt();

System.out.println("Inserte el número de veces a ejecutar el programa");
Try = sc.nextInt();


}

public void Evaluar(){

for(int i=2;i<=Num;i++){

div = Num%i;


if(div == 0 && Num != i){

Num = 0; 

}

}

}

public void Presentar(){

if(Num == 0){System.out.println("Tu número es un número compuesto");}
else{System.out.println("Tu número es un número primo");}

}

public static void main(String[]args){

Primos Pr = new Primos();


While(Try == 0){
Pr.Leer();
Pr.Evaluar();
Pr.Presentar();

Try--;
}
}

}



import java.util.Scanner;
public class Cajero{

public static void main(String []args){

int Dinero;
int d500 = 0;
int d200= 0;
int d100= 0;
int d50= 0;
int d20= 0;
Scanner sc = new Scanner(System.in);
			System.out.println("Cuanto dinero Queres");
			Dinero = sc.nextInt();

if((Dinero % 50) % 20 ==0) {

if(Dinero >=500) {
			d500 = Dinero /500;
			Dinero = Dinero -d500 *500;
}if(Dinero>=200){
			d200 = Dinero /200;
			Dinero = Dinero -d200 *200;

}if(Dinero>=100){
			d100 = Dinero /100;
			Dinero = Dinero -d100 *100;
}if(Dinero >=50 && (Dinero % 50)   % 20 == 0){
			d50 = Dinero /50;
			Dinero = Dinero -d50 *50;
}if(Dinero >=20){

			d500 = Dinero /500;
			Dinero = Dinero -d500 *500;
			}

}else { System.out.println("Inserte un número valido");}

System.out.println("Billetes de 500 " + d500);
System.out.println("Billetes de 200 " + d200);
System.out.println("Billetes de 100 " + d100);
System.out.println("Billetes de 50 " + d50);
System.out.println("Billetes de 20 " + d20);

}

}
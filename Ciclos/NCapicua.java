import java.util.Scanner;
public class NCapicua{

int Repetidor = 1;
int Capicua = 0;
int NoCapicua = 0;
int Num1;
int Num3;
int Num3Cif = 0;


public void Leer (){

		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte numero de 3 cifras");	
		Num3Cif = sc.nextInt();
}
public void Comparar(){
if (Num3Cif >= 100 && Num3Cif <= 999){
		Num1 = Num3Cif / 100;
		Num3 = Num3Cif % 10;

if (Num1 == Num3){ 
		Capicua = Capicua + 1;
}else{ NoCapicua = NoCapicua + 1;}


}else{ Num3Cif = 0;}

}

public void Repetir(){
while(Num3Cif!=0){
Leer();
Comparar();


}
}

public void Presentar(){

System.out.println("Su Cantidad de números Capicúas fue: " + Capicua);
System.out.println("Su cantidad de números no Capicúas fue: " + NoCapicua);
}


public static void main (String []args){

NCapicua obj = new NCapicua();

obj.Leer();
obj.Comparar();
obj.Repetir();
obj.Presentar();

}
}
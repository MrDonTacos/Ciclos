import java.util.Scanner;
import java.util.Random;

public class MostrarMensaje {

int [] a = new int [6];
int num = 0;
int rd = 0;
int opc = 0;
int exit = 0;
public void Random(){
for(int i = 0; i < a.length; i++){
Random aleatorio = new Random();
rd = aleatorio.nextInt(100) + 1;
a[i] = rd;
}
}
public void Scanner(){
Scanner sc = new Scanner(System.in);
num = sc.nextInt();
}
public void Ciclo2(){
System.out.println("Inserte 6 números para el arreglo");
for(int i = 0; i < a.length; i++){
Scanner();
a[i] = num;
}
}
public void Presentar(){
String msg = "Ingrese el número del proceso que quiere hacer: \n  1. Llenar el arreglo de manera aleatoria \n ";
msg = msg + "2. Llenar el arreglo insertando datos \n 3. Presentar datos del arreglo \n 4. Decir adios \n Numero:" ;
System.out.println(msg );
}
public void Casos(){
Presentar();
Scanner();
while ((num == 3 || num == 2 || num == 1) && exit == 0){
switch(num){
case 1: Random(); break;
case 2: Ciclo2(); break;
case 3: for (int i = 0; i<a.length; i++ ) {System.out.println("Tu " + (i + 1) + "° número es " + a[i]);}; break;
case 4: System.out.println("Adiós"); exit = 4 ; break;
} if(exit != 4){
System.out.println();
Presentar();
Scanner();
}
}
}
public static void main(String[] args){
Tarea obj = new Tarea();
obj.Casos();
}
}

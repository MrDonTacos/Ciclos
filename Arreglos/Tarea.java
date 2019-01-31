import java.util.Scanner;
import java.util.Random;

public class Tarea {

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
System.out.println("Tu " + (i + 1) + "° número es " + a[i]);
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
}for(int b = 0; b <a.length ; b++){
System.out.println("Tu " + (b + 1) + "° número es " + a[b]);
}
}
public void Presentar(){
System.out.println("Ingrese el número del proceso que quiere hacer: \n  1. Llenar el arreglo de manera aleatoria \n 2. Llenar el arreglo insertando datos \n 3. Decir adios \n Numero:" );
}
public void Casos(){
Presentar();
Scanner();
while ((num == 3 || num == 2 || num == 1) && exit == 0){
switch(num){
case 1: Random(); break;
case 2: Ciclo2(); break;
case 3: System.out.println("Adiós"); exit = 4 ; break;
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

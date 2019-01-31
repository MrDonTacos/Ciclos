import java.util.Scanner;
public class Exponencial{

int base = 0;
int exp = 0;
int acumulador = 1;

public void Leer(){

Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese valor de la base");
        base = sc.nextInt();

      System.out.println("Ingrese valor del exponente");
        exp = sc.nextInt();
}

public void Calcular(){

for (int i = 1; i <= exp ; i++ ) {

acumulador = acumulador * base;

}
}
public void Presentar(){

System.out.println();
System.out.println(base + " Elevado a la " + exp + " es igual a: " + acumulador);

}


public static void main(String[] args) {
  Exponencial obj = new Exponencial();

  obj.Leer();
  obj.Calcular();
  obj.Presentar();
}

}

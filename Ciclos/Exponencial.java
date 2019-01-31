import java.util.Scanner;
public class Exponencial{


int exponencial = 1;
int acumulador = 0;

public void leer(){
Scanner sc = new Scanner(System.in);

System.out.println("Inserte número exponencial");
acumulador = sc.nextInt();
}

public void ciclo(){
while(acumulador > 0){

exponencial = exponencial * acumulador;
acumulador--;
}
}

public void presentar(){
System.out.println("El resultado de tu número exponencial es: " + exponencial);
}


}
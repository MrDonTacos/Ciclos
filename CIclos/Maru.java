import java.util.Scanner;
public class Maru{

public static void main(String []args)
{

Scanner sc = new Scanner(System.in);

int Calfo=0;
int Calf=0;
double Prom=0;
double Acumulador=0;

do{

System.out.println();
System.out.println("Inserte calificación del 1-100");
Calf=sc.nextInt();
if(Calf!=0){
Acumulador= Acumulador + 1;

Calfo = Calfo + Calf;
Prom = Calfo / Acumulador;
}

}
while(Calf>0);

System.out.println("El promedio de calificación es: " + Prom);
}
}
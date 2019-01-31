import java.util.Scanner;
public class PNPO{


int Calfo=0;
int Calf=0;
double Prom=0;
double Acumulador=0;

public void Leer(){

Scanner sc = new Scanner(System.in);
System.out.println();
System.out.println("Inserte número");
Calf=sc.nextInt();

}

public void Calcular(){

do{

Leer();
if(Calf>0){
Acumulador++;

Calfo = Calfo + Calf;
Prom = Calfo / Acumulador;
}

}
while(Calf>0 || Calf <0);
}

public void Presentar(){

System.out.println("El promedio de calificación es: " + Prom);
}





public static void main(String []args)
{

PNPO PNP = new PNPO();

PNP.Leer();
PNP.Calcular();
PNP.Presentar();

}
}
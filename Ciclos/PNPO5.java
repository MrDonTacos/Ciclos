import java.util.Random;
public class PNPO5 {

int acumulador = 0;
double Prom=0;
int Calf = 0;
int Num= 0;
int Acumulador2=0;

public void Random(){

Random rd = new Random();
Num= rd.nextInt(100);

}

public void Calculo(){

do{
  while(Acumulador2 <4){
  Random();
  System.out.println(Num);
if (Num%10 == 5) {
acumulador++;
Calf = Num + Calf;
Prom = Calf/acumulador;
}
Num=0;
Acumulador2++;
}
} while(Num > 0 || Num < 0);
}



public void Presentar(){

  System.out.println();
  System.out.println(Prom);
}

public static void main(String[] args) {
  PNPO5 PNP = new PNPO5();

  PNP.Calculo();
  PNP.Presentar();
}

}

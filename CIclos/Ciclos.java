import java.util.Random;
import javax.swing.JOptionPane;

public class Ciclos{

    int impar = 0;
    int par = 0;
    int num = 0;
    final int N = 10;

    public void ciclosFor(){
        Random aleatorio = new Random();

        for (int i=0;i <N ; i++ ) {
            num=aleatorio.nextInt(100) + 1;
            if(num%2==0)
            par++;
            else
            impar++;
        }

    }





public void Presentar(){
  System.out.println("El numero PAR es: " + par);
  System.out.println("El numero IMPAR es: " + impar);
//  JOptionPane.showMessageDialog(null, "Los pares son: " +par);
}

public static void main(String[] args) {

Ciclos obj = new Ciclos();

obj.ciclosFor();
obj.Presentar();

}

}

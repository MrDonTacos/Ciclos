import java.util.Random;
import javax.swing.JOptionPane;
public class Objeto{

 int vector[] = new int[5];
public void LlenarVector(){
  Random rd = new Random();
for(int i=0; i<vector.length;i++){
  vector[i] = rd.nextInt(10)+1;
}


}





  public static void main(String[] args) {

  }
}

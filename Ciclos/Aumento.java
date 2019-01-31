public class Aumento{

int N=5;

public void ciclo(){

for (int i = 1; i <= N; i++){
for(int a = 0; a<i; a++){
System.out.print("*");

}

System.out.println();
}


}

public static void main (String[] args){

Aumento obj = new Aumento();

obj.ciclo();

}



}
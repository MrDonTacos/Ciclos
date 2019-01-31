public class Figurados{

int N = 6; 

public void Calcular(){

for(int i=1; i <= N; i++){

for(int b=1; b <= N - i ; b++){

System.out.print(" ");}

for(int a= N; a > N-i; a--){

System.out.print("*");
System.out.print(" ");



}




System.out.println();


}


}

public static void main(String[]args){

Figurados obj = new Figurados();

obj.Calcular();


}

}

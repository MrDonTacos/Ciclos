public class Figurauno{

public void calcular(){

for(int i = 0; i<5; i++){

for(int a = 5; a>i; a--){

System.out.print("*");


}
System.out.println();
}
}

public static void main (String[] args){

Figurauno uno = new Figurauno();

uno.calcular();
}

}
import java.util.Random;
public class PartidosPoliticos{

public static void main(String[] args){



int VotoPersona = 0;
int Votos= 0;
int Pan= 0;
int Pri= 0;
int Morena= 0;
int Naranja= 0;
int Prd= 0;
int Verde= 0;
int VotoNulo=0;
int c = 0;

				System.out.println("PAN........1");
				System.out.println("PRI........2");
				System.out.println("Morena.....3");
				System.out.println("Naranja....4");
				System.out.println("Verde......5");
				System.out.println("PRD........6");
				System.out.println("Votos Nulos.....Cualquier número distinto a los anteriores");
				Random aleatorio = new Random();


while(c < 5){
while(Votos < 1000){
	
	
			VotoPersona = aleatorio.nextInt(6) +1;

			switch (VotoPersona){
			
			case 1: Pan = Pan + 1 ;break;
			case 2: Pri = Pri + 1 ;break;
			case 3: Morena = Morena + 1 ;break;
			case 4: Naranja = Naranja + 1 ;break;
			case 5: Verde = Verde + 1 ;break;
			case 6: Prd = Prd + 1 ;break;
			default: VotosNulos = VotosNulos+1;break;

}
		Votos = Votos + 1;
}
				
if(Pan > Pri && Pan > Morena && Pan > Naranja  && Pan > Verde && Pan > Prd){

  System.out.println("Tu partido ganador fue el PAN con: "+ Pan + " Votos");

}else if(Pri > Pan &&Pri > Morena &&Pri > Naranja  &&Pri > Verde &&Pri > Prd ){

  System.out.println("Tu partido ganador fue el PRI con: " + Pri + " Votos");

}else if(Naranja > Pri &&Naranja > Morena &&Naranja > Pan  &&Naranja > Verde &&Naranja > Prd ){

  System.out.println("Tu partido ganador fue el partido Naranja con: " + Naranja + " Votos");

}else if(Verde > Pri &&Verde > Morena &&Verde > Naranja  &&Verde > Pan &&Verde > Prd ){

  System.out.println("Tu partido ganador fue el Partido Verde con: " + Verde + " Votos");

}else if(Prd > Pri &&Prd > Morena &&Prd > Naranja  &&Prd > Verde &&Prd > Pan ){

  System.out.println("Tu partido ganador fue el PRD con: " + Prd + " Votos");

}else if(Morena > Pri &&Morena > Pan &&Morena > Naranja  &&Morena > Verde &&Morena > Prd ){

  System.out.println("Tu partido ganador fue el Morena con: " + Morena + " Votos");

}else{System.out.println("Ganó el voto nulo con: " + VotoNulo);}


				System.out.println("Los votos por el PAN fueron: " +Pan);
				System.out.println("Los votos por el PRI fueron: " + Pri);
				System.out.println("Los votos por el partido Morena fueron: " + Morena);
				System.out.println("Los votos por el partido Naranja fueron: " + Naranja);
				System.out.println("Los votos por el Partido Verde fueron: " + Verde);
				System.out.println("Los votos por el PRD fueron: " + Prd);
				System.out.println("Los votos nulos fueron: " VotoNulo);

				System.out.println();
				System.out.println();
 VotoPersona = 0;
Votos= 0;
Pan= 0;
Pri= 0;
Morena= 0;
Naranja= 0;
Prd= 0;
Verde= 0;
c = c+1;
}
}
}
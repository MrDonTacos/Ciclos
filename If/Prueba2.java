public class Prueba2{

public static void main(String[] args){

String [] NotasMusical = {"DO","DO#","REB","RE","RE#","MIB","MI","FAB","MI#","FA","FA#","SOLB","SOL","SOL#","LAB","LA","LA#","SIB","SI","DOB","SI#"};
int IntervaloMusical1 = 0;
int IntervaloMusical2 = 0;
int IntervaloTotal = 0;
String NotaMusical = "";
String NotaMusical2 = "";
Scanner sc = new Scanner(System.in);

			System.out.println("Este programa solo calcula los intervalos en una sola octava, de forma Ascendete o Descendente, según sea el caso");
	

	System.out.println("Ingrese una nota musical de Do a Do con máximo un '#' o un 'b' ");
		NotaMusical = sc.nextLine();
		NotaMusical = NotaMusical.toUpperCase();

		if(NotaMusical.equals(NotaMusical[0])){
        	IntervaloMusical1 = 10;

} else if 	((NotaMusical.equals(DOS)) || (NotaMusical.equals(REB))){
		IntervaloMusical1 = 15;
} else if 	(NotaMusical.equals(RE)){
		IntervaloMusical1 = 20;
} else if 	((NotaMusical.equals(RES)) || (NotaMusical.equals(MIB))){
		IntervaloMusical1 = 25;
} else if 	((NotaMusical.equals(MI)) || (NotaMusical.equals(FAB))){
		IntervaloMusical1 = 30;
} else if 	((NotaMusical.equals(MIS)) || (NotaMusical.equals(FA))){
		IntervaloMusical1 = 35;
} else if 	((NotaMusical.equals(FAS)) || (NotaMusical.equals(SOLB))){
		IntervaloMusical1 = 40;
} else if 	(NotaMusical.equals(SOL)){
		IntervaloMusical1 = 45;
} else if 	((NotaMusical.equals(SOLS)) || (NotaMusical.equals(LAB))){
		IntervaloMusical1 = 50;
} else if 	(NotaMusical.equals(LA)){
		IntervaloMusical1 = 55;
} else if 	((NotaMusical.equals(LAS)) || (NotaMusical.equals(SIB))){
		IntervaloMusical1 = 60;
} else if 	(NotaMusical.equals(SI)){
		IntervaloMusical1 = 65;
} else if 	(NotaMusical.equals(SIS)){
		IntervaloMusical1 = 70;
}else{		System.out.println("Inserte una nota valida");  
		System.exit(0);
}



		System.out.println("Ingrese una segunda nota:");
		NotaMusical2 = sc.nextLine();
		NotaMusical2 = NotaMusical2.toUpperCase();
	
 		if(NotaMusical2.equals(DO)){
		IntervaloMusical2 = 10;
		

} else if 	((NotaMusical2.equals(DOS)) || (NotaMusical2.equals(REB))){
		IntervaloMusical2 = 15;
} else if 	(NotaMusical2.equals(RE)){
		IntervaloMusical2 = 20;
} else if 	((NotaMusical2.equals(RES)) || (NotaMusical2.equals(MIB))){
		IntervaloMusical2 = 25;
} else if 	((NotaMusical2.equals(MI)) || (NotaMusical2.equals(FAB))){
		IntervaloMusical2 = 30;
} else if 	((NotaMusical2.equals(MIS)) || (NotaMusical2.equals(FA))){
		IntervaloMusical2 = 35;
} else if 	((NotaMusical2.equals(FAS)) || (NotaMusical2.equals(SOLB))){
		IntervaloMusical2 = 40;
} else if 	(NotaMusical2.equals(SOL)){
		IntervaloMusical2 = 45;
} else if 	((NotaMusical2.equals(SOLS)) || (NotaMusical2.equals(LAB))){
		IntervaloMusical2 = 50;
} else if 	(NotaMusical2.equals(LA)){
		IntervaloMusical2 = 55;
} else if 	((NotaMusical2.equals(LAS)) || (NotaMusical2.equals(SIB))){
		IntervaloMusical2 = 60;
} else if 	(NotaMusical2.equals(SI)){
		IntervaloMusical2 = 65;
} else if 	(NotaMusical2.equals(SIS)){
		IntervaloMusical2 = 70;
}else{		System.out.println("Inserte una nota valida");  
		System.exit(0);
}


		
		IntervaloTotal = IntervaloMusical2 - IntervaloMusical1;
		if(IntervaloTotal < 0){
		IntervaloTotal = IntervaloTotal * -1;}
		switch(IntervaloTotal){  
    		case 5: System.out.println("Tu intervalo es una 2da Menor");break;  
    		case 10: System.out.println("Tu intervalo es una 2da Mayor");break;  
    		case 15: System.out.println("Tu intervalo es una 3era Menor");break; 
    		case 20: System.out.println("Tu intervalo es una 3era Mayor");break;  
    		case 25: System.out.println("Tu intervalo es una 4ta Justa");break;  
    		case 30: System.out.println("Tu intervalo es una 4ta Aumentada");break; 
     		case 35: System.out.println("Tu intervalo es una 5ta Justa");break;  
    		case 40: System.out.println("Tu intervalo es una 6ta Menor");break;  
    		case 45: System.out.println("Tu intervalo es una 6ta Mayor");break; 
    		case 50: System.out.println("Tu intervalo es una 7ma Menor");break;  
    		case 55: System.out.println("Tu intervalo es una 7ma Mayor");break;  
    		case 60: System.out.println("Tu intervalo es una 8va Justa");break;
    		case 0 : System.out.println("Tu intervalo es un Unisono");break; 
}
}
}
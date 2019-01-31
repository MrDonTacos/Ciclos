import java.util.Scanner;
public class NominaVmetodos{

String nombre = "";
int NoEmp = 0;
int HrWork = 0;
char PassDep ;
String Dep = "";
int SalarioHr = 0;
int SalarioTri = 0;
int SalarioDob = 0;  
int Salario = 0;
int SalarioTot = 0;
int HrTri = 0;
int HrDob = 0;
int HrNor = 0;

public void LeerDatos(){ 

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserte su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Inserte su número de empleado: ");
		NoEmp = sc.nextInt();
		System.out.println("Inserte horas trabajadas: ");
		HrWork = sc.nextInt();
		System.out.println("Inserte clave de departamento: ");
		PassDep = sc.next().charAt(0);


}


public void Departamentos(){

if (PassDep == 'a') {

		Dep = "Contabilidad";
		SalarioHr = 100;

} else if (PassDep == 'b'){

		Dep = "Sistemas";
		SalarioHr = 200;

} else if (PassDep == 'c'){

		Dep = "Ventas";
		SalarioHr = 150;

}else if (PassDep == 'd'){

		Dep = "Seguridad";
		SalarioHr = 150;

}else if (PassDep == 'e'){

		Dep = "Producción";
		SalarioHr = 120;

}



}

public void HorasWK() {


if (HrWork > 45){

		HrTri = HrWork - 45;
		SalarioTri = HrTri * (SalarioHr*3);
		HrDob = 9;
		SalarioDob = HrDob * (SalarioHr*2);
		HrNor = 36;
		Salario = HrNor * SalarioHr;
		SalarioTot = Salario + SalarioDob + SalarioTri;
} else if (HrWork <= 45 && HrWork > 36){
		HrNor = 36;
		HrDob = HrWork - HrNor;
		SalarioDob = HrDob * (SalarioHr * 2);
		Salario = HrNor * SalarioHr;
		SalarioTot = SalarioDob + Salario;
}else {
		HrNor = HrWork;
		Salario = HrWork * SalarioHr;
		SalarioTot = Salario;

}



}

public void Presentar(){

		System.out.println("Tu departamento es: " + Dep);
		System.out.println("Tu Salario por hora es: " + SalarioHr);
		System.out.println("Tus Horas trabajadas son: " + HrWork);
		System.out.println("Tu nombre es: " + nombre);
		System.out.println("Tu Clave de departamento es: " + PassDep);
		System.out.println("Tus horas Triples son: " + HrTri);
		System.out.println("Tus horas dobles son: " + HrDob);
		System.out.println("Tus horas normales son: " + HrNor);
		System.out.println("Tu salario Total es: " + SalarioTot);



}


}
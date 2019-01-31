import javax.swing.JOptionPane;

public class TrabajoFinal{
String let="";
final int num =6;
int SalarioHr=0;
int pos =-1;
int noemp=0;
int noEmp2[] = new int[num];
String Nombre [] = new String[num];
int    noEmp  [] = new int[num];
int    HrWr   [] = new int [num];
char   Dep    [] = new char  [num];
String Departamentos[] ={"contabilidad" , "sistemas", "ventas", "seguridad", "produccion"};
int Nomina[] = new int [num];
String Deps[]= new String [num];
int exist=0;


public void verificarExistNom(){
for (int i=0;i<Nombre.length ; i++ ) {
  if(Nombre[pos].equals(Nombre[i]) && i!=pos){
  JOptionPane.showMessageDialog(null, "Ya existe este nombre, favor de ingresar otro nombre");
  let ="";
  exist= exist +1;
}

}
}

public void verificarExistNum(){

for (int i=0; i<noEmp.length ;i++ ) {

  if(noEmp[pos] == noEmp[i] && i!=pos){
  JOptionPane.showMessageDialog(null, "Este numero de control ya existe, favor de ingresar otro");
  let ="";
  exist = exist +1;}
}
}

public void insertarDatos(){
if (pos<num) {

    pos = pos +1;
    for (int i=pos;i<pos +1 && i<num ; i++ ) {

      for (int j=0; j<=exist ; j++ ) {
      let = JOptionPane.showInputDialog("Inserte Nombre");
      Nombre[i] = let;
      verificarExistNom();
    }exist=0;
      for(int j=0; j<=exist; j++){
      let = JOptionPane.showInputDialog("Inserte numero de empleado ");
      noEmp[i] = Integer.parseInt(let);
      verificarExistNum();
    }exist=0;

      let = JOptionPane.showInputDialog("Inserte horas trabajados");
      HrWr [i] = Integer.parseInt(let);
      let = JOptionPane.showInputDialog("Inserte clave de departamento \na)Contabilidad\nb)Sistemas\nc)Ventas\nd)Seguridad\ne)Produccion");

      Dep[i] = let.charAt(0);


  }

}else {
  JOptionPane.showMessageDialog(null, "Datos llenos");
}
}

public void buscarEmpleado(){

  let = JOptionPane.showInputDialog("Inserte numero de empleado");
  noemp = Integer.parseInt(let);
  presentarDatos();
}

    public void presentarDatos(){
      Departamento();
    let="1. Nombre               2. No. de empleado         3. Horas trabajadas          4. Departamento    5. Nomina\n \n";
    for (int i=0; i<num ; i++ ) {
      if(noemp == noEmp[i] ){
        let = let + "1. " +Nombre[i] + "    2. " + noEmp[i] + "       3. " +  HrWr[i] + "                4. " + Deps[i];
        JOptionPane.showMessageDialog(null, let);
      }
    }

}

public void Departamento(){

for (int i=0; i<num ; i++ ) {

   switch (Dep[i]) {
     case 'a': Deps[i] ="Contabilidad";  SalarioHr=100 ;break;
     case 'b':Deps[i]= "Sistemas";  SalarioHr=200;break;
case 'c':Deps[i]= "Ventas"; SalarioHr=150 ;break;
case 'd':Deps[i]= "Seguridad"; SalarioHr=150 ;break;
case 'e':Deps[i]= "Produccion"; SalarioHr=120 ;  break;
 }


}
}
public void CalcularSalario(){

  int  SalarioTri=0;
  int HrTri=0;
  int HrDob=0;
  int SalarioDob=0;
  int HrNor=0;
  int Salario = 0;



  for (int i=0;i<num ; i++ ) {
    if (HrWr[i] > 45){


      HrTri = HrWr[i] - 45;
		SalarioTri = HrTri * (SalarioHr*3);
		HrDob = 9;
		SalarioDob = HrDob * (SalarioHr*2);
		HrNor = 36;
		Salario = HrNor * SalarioHr;
		Nomina[i] = Salario + SalarioDob + SalarioTri;
     }
    else if (HrWr[i] <= 45 && HrWr[i] > 36){
      HrNor = 36;
		HrDob = HrWr[i] - HrNor;
		SalarioDob = HrDob * (SalarioHr * 2);
		Salario = HrNor * SalarioHr;
		Nomina[i] = SalarioDob + Salario;

    }
    else{
      Salario = HrWr[i] * SalarioHr;
		Nomina[i] = Salario;


    }
  }
}

public void presentarNomina(){
Departamento();
CalcularSalario();
  let="1. Nombre               2. No. de empleado         3. Horas trabajadas          4. Departamento    5. Nomina\n \n";
  for (int i=0; i<pos +1 ; i++ ) {


    let = let + "1. "+Nombre[i] + "    2. " + noEmp[i] + "      3. " +  HrWr[i] + "         4. " + Deps[i] + "          5. " + Nomina[i] +"\n";

}JOptionPane.showMessageDialog(null, let);
}

public void conta(){
  let = "1. Nombre               2. No. de empleado         3. Horas trabajadas          4. Departamento    5. Nomina\n \n";
for (int i=0; i<num ; i++ ) {
  if (Dep[i]==97){
      let = let + "1. "+Nombre[i] + "    2. " + noEmp[i] + "      3. " +  HrWr[i] + "         4. " + Deps[i] + "          5. " + Nomina[i] +"\n";
  }
}
}

public void Siste(){
  let = "1. Nombre               2. No. de empleado         3. Horas trabajadas          4. Departamento    5. Nomina\n \n";
for (int i=0; i<num ; i++ ) {
  if (Dep[i]==98){
      let = let + "1. "+Nombre[i] + "    2. " + noEmp[i] + "      3. " +  HrWr[i] + "         4. " + Deps[i] + "          5. " + Nomina[i] +"\n";
  }
}
}

public void ventas(){
  let = "1. Nombre               2. No. de empleado         3. Horas trabajadas          4. Departamento    5. Nomina\n \n";
for (int i=0; i<num ; i++ ) {
  if (Dep[i]==99){
      let = let + "1. "+Nombre[i] + "    2. " + noEmp[i] + "      3. " +  HrWr[i] + "         4. " + Deps[i] + "          5. " + Nomina[i] +"\n";
  }
}
}

public void seguridad(){
  let = "1. Nombre               2. No. de empleado         3. Horas trabajadas          4. Departamento    5. Nomina\n \n";
for (int i=0; i<num ; i++ ) {
  if (Dep[i]==100){
      let = let + "1. "+Nombre[i] + "    2. " + noEmp[i] + "      3. " +  HrWr[i] + "         4. " + Deps[i] + "          5. " + Nomina[i] +"\n";
  }
}
}

public void produccion(){
  let = "1. Nombre               2. No. de empleado         3. Horas trabajadas          4. Departamento    5. Nomina\n \n";
for (int i=0; i<num ; i++ ) {
  if (Dep[i]==101){
      let = let + "1. "+Nombre[i] + "    2. " + noEmp[i] + "      3. " +  HrWr[i] + "         4. " + Deps[i] + "          5. " + Nomina[i] +"\n";
  }
}
}

public void buscarEmpxDep(){
  Departamento();
  CalcularSalario();

    let=JOptionPane.showInputDialog("Ingrese Departamento");
    let = let.toLowerCase();
    for (int i=0; i<Departamentos.length ; i++ ) {
      if( Departamentos[i].equals(let.trim())){
        switch (i) {
case 0: conta() ;JOptionPane.showMessageDialog(null, let);break;
case 1: Siste();JOptionPane.showMessageDialog(null, let);break;
case 2: ventas();JOptionPane.showMessageDialog(null, let);break;
case 3: seguridad();JOptionPane.showMessageDialog(null, let);break;
case 4: produccion();JOptionPane.showMessageDialog(null, let);break;
        }
      }
      }

        }

public void VectorCopia(){
  for (int i=0;i<noEmp.length ;i++ ) {
    noEmp2[i] = noEmp[i];
  }
}

public void MetBurb(){
  VectorCopia();
  int aux=0;
  for (int i=0; i<=pos ;i++ ) {
    for (int j=i+1; j<=pos ;j++ ) {
      if (noEmp2[i]>noEmp2[j]) {
        aux=noEmp2[i];
        noEmp2[i] = noEmp2[j];
        noEmp2[j] = aux;
      }
    }
  }
  }


public void Acomodo(){
  Departamento();
  CalcularSalario();
  MetBurb();
    let= "1. No. de empleado               2. Nombre         3. Horas trabajadas          4. Departamento    5. Nomina\n \n";
    for (int i=0; i<=pos ; i++ ) {
      for (int j=0; j<=pos ; j++ ) {
        if (noEmp2[i] == noEmp[j]) {
          let = let + "1: "+noEmp2[i] + "    2: " + Nombre[j] + "      3: " +  HrWr[j] + "       4: " + Deps[j] + "        5: " + Nomina[j] +"\n";
        }
      }
    }JOptionPane.showMessageDialog(null, let);
}

public void menu(){

  String Let="";
  int num2=0;
  do {

  Let= JOptionPane.showInputDialog(" 1. Insertar Datos del Trabajador \n 2. Consultar Datos de un trabajador \n 3. Calcular Salario de los trabajadores \n 4. Presentar nominas del departamento \n 5. Presentar datos por orden de numero de empleado \n 6. Finalizar programa");
  num2= Integer.parseInt(Let);

  switch (num2) {
    case 1:insertarDatos(); ;break;
    case 2:buscarEmpleado() ;break;
    case 3:presentarNomina() ;break;
    case 4: buscarEmpxDep();break;
    case 5: Acomodo();break;

  }
} while (num2!=6);
}

public static void main(String[] args) {
  TrabajoFinal tr = new TrabajoFinal();
    tr.menu();
}
}

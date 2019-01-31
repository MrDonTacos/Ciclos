Algoritmo sin_titulo
	num<-0
	div<-0
	try<-0
	Escribir "Inserte el número de veces a ejectutar el programa"
	Leer try
	Mientras try == 0 Hacer
		Escribir "Inserte número"
		Leer num
		Para i<-2 Hasta num Con Paso i+1 Hacer
			div = num%1
			
			Si div == 0 && num != i Entonces
				num =0
			Sino
				acciones_por_falso
			Fin Si
		Fin Para
		Si num == 0 Entonces
			Escribir "Tu número es un número compuesto"
		Sino
			Escribir "Tu número es un número primo"
		Fin Si
		try <- try-1
	Fin Mientras 
	
FinAlgoritmo

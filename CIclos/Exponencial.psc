Algoritmo sin_titulo
	base<-0
	exo<-0
	acumulador<-1
	Escribir "Ingrese valor de la base"
	Leer base
	Escribir "Ingrese valor del exponente"
	Leer exo
	Para i<-1 Hasta exo Con Paso i+1 Hacer
		acumulador<-acumulador*base
	Fin Para
	Escribir ""
	Escribir base " Elevado a la " exo  " es igual a: ",acumulador
FinAlgoritmo

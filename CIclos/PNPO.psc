Algoritmo sin_titulo
	calfo<-0
	calf<-0
	prom<-0
	acumulador<-0
	Repetir
		Escribir "Inserte número"
		Leer calf
		Si calf > 0 Entonces
			acumulador =+1
			calfo<-calfo + calf
			prom<-calfo/acumulador
		Sino
			acciones_por_falso
		Fin Si
	Hasta Que calf > 0 || calf < 0
	Escribir "El promedio de la calificación es: "
FinAlgoritmo

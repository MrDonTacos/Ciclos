Algoritmo sin_titulo
	acumulador<-0
	prom<-0
	calf<-0
	num<-0
	acumulador2<-0
	
	Repetir
		Mientras acumulador2 <4 Hacer
			num=azar[100]
			Escribir num
			Si num%10 == 5 Entonces
				acumulador=+1
				calf<-num +calf
				prom<- calf/acumulador
			
			Fin Si
			num<-0 
			acumulador2= acumulador2 +1
		Fin Mientras
	Hasta Que num > 0 || num <0
FinAlgoritmo

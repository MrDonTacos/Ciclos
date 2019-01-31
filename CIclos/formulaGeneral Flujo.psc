Algoritmo formulaGeneral
	a = 0
	b = 0
	c = 0
	Escribir "Introduce el valor de a"
	Leer a
	Escribir "introduce el valor de b"
	Leer b
	Escribir "Introduce el valor de c"
	Leer c
	x1 = -b+raiz(ABS((b*b)-4*a*c))/2*a
	x2 = -b-raiz(ABS((b*b)-4*a*c))/2*a
	Escribir "La solucion es" x1 "y" x2
	Si (b*b < -4*a*c) Entonces
		Escribir "Son dos valores con parte real y parte imaginaria. Es decir, el resultado será un numero complejo"
	Sino
		Si (b*b > -4*a*c) Entonces
			Escribir "Son dos valores distintos de X reales"
		Sino
			Escribir Son dos valores de X reales e iguales
		FinSi
	FinSi
FinAlgoritmo


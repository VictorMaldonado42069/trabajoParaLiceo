Algoritmo ejercicioUno
	Definir a,b,c,x,y,m,z,u,d,t Como Real
	Definir tf Como Caracter // tf = tipo de formula
	Repetir
		Escribir 'Indique la formula que desea aplicar (m ó z)'
		Leer tf
		Si (tf<>'m') | (tf<>'z') | (tf<>'M') | (tf<>'Z') Entonces
			Escribir 'La opción que ha escogido no existe. Por favor, intente de nuevo'
		FinSi
	Hasta Que (tf='m') | (tf='z') | (tf='M') | (tf='Z')
	Si (tf='m') | (tf='M') Entonces
		Escribir 'Ingrese el valor de a'
		Leer a
		Escribir 'Ingrese el valor de b'
		Leer b
		Mientras (a=null) & (b=null) & (c=null) & (x=null) & (y=null) Hacer
			Escribir 'Una o más variables son invalidas. Por favor intente de nuevo'
			Escribir 'Ingrese el valor de a'
			Leer a
			Escribir 'Ingrese el valor de b'
			Leer b
		FinMientras
		m <- (5*(a^2)*(b^3))+rc((a^2)+(b^2))
		Escribir Concatenar('El resultado para m es ',ConvertirATexto(m))
	SiNo
		Si (tf='z') | (tf='Z') Entonces
			Escribir 'Ingrese el valor de a'
			Leer a
			Escribir 'Ingrese el valor de b'
			Leer b
			Escribir 'Ingrese el valor de c'
			Leer c
			Escribir 'Ingrese el valor de x'
			Leer x
			Escribir 'Ingrese el valor de y'
			Leer y
			Mientras (a=null) & (b=null) & (c=null) & (x=null) & (y=null) Hacer
				Escribir 'Una o más variables son invalidas. Por favor intente de nuevo'
				Escribir 'Ingrese el valor de a'
				Leer a
				Escribir 'Ingrese el valor de b'
				Leer b
				Escribir 'Ingrese el valor de c'
				Leer c
				Escribir 'Ingrese el valor de x'
				Leer x
				Escribir 'Ingrese el valor de y'
				Leer y
			FinMientras
			u <- (3*(a^2)*(b^5))
			d <- (7*(y^2))-((a*b)*(c^6))+(6*(x^2))+(98*(y^3))
			z <- u+d
			Escribir Concatenar('El resultado para z es ',ConvertirATexto(z))
		FinSi
	FinSi
FinAlgoritmo

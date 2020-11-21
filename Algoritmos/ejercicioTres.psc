Algoritmo ejercicioTres
	Definir subTotal,total Como Real
	Definir descuento,cantidad Como Entero
	Escribir 'Indique el costo unitario de la tabla'
	Leer costoUnitario
	Escribir 'Ingrese la cantidad de tablas del cliente'
	Leer cantidad
	subTotal <- costoUnitario*cantidad
	Repetir
		Escribir 'Ingrese el tipo de cliente'
		Escribir '1) Paga a tiempo'
		Escribir '2) Paga con retraso'
		Escribir '3) Cliente nuevo'
		Leer descuento
	Hasta Que (descuento=1) | (descuento==2) | (descuento==3)
	Segun descuento  Hacer
		1:
			total <- (subTotal-(subTotal*0.15))
			Escribir Concatenar('Usted ha escogido la esfera azul. Tiene un 20% de descuento y el monto a pagar es ',ConvertirATexto(total))
		2:
			total <- (subTotal-(subTotal*0.12))
			Escribir Concatenar('Usted ha escogido la esfera roja. Tiene un 30% de descuento y el monto a pagar es ',ConvertirATexto(total))
		De Otro Modo:
			total <- (subTotal-(subTotal*0.12))
			Escribir Concatenar('Usted ha escogido la esfera blanca. El monto a pagar es ',ConvertirATexto(total))
	FinSegun
FinAlgoritmo

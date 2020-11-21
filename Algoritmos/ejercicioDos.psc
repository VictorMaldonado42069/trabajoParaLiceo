Algoritmo ejercicioDos
	Definir subTotal,total Como Real
	Definir descuento Como Entero
	Escribir 'Indique el costo de su compra'
	Leer subTotal
	Repetir
		Escribir 'Ingrese el color de su esfera de descuento'
		Escribir '1) Azul'
		Escribir '2) Rojo'
		Escribir '3) Blanco'
		Leer descuento
	Hasta Que (descuento=1) | (descuento==2) | (descuento==3)
	Segun descuento  Hacer
		1:
			total <- (subTotal-(subTotal*0.2))
			Escribir Concatenar('Usted ha escogido la esfera azul. Tiene un 20% de descuento y el monto a pagar es ',ConvertirATexto(total))
		2:
			total <- (subTotal-(subTotal*0.3))
			Escribir Concatenar('Usted ha escogido la esfera roja. Tiene un 30% de descuento y el monto a pagar es ',ConvertirATexto(total))
		De Otro Modo:
			total <- subTotal
			Escribir Concatenar('Usted ha escogido la esfera blanca. El monto a pagar es ',ConvertirATexto(total))
	FinSegun
FinAlgoritmo

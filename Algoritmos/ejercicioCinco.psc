Algoritmo ejercicioCinco
	Definir peso,altura,dosis Como Real
	Definir sexo Como Caracter
	Repetir
		Escribir 'Ingrese el peso del estudiante en libras'
		Leer peso
		Escribir 'Ingrese la altura en metros'
		Leer altura
		Escribir 'Indique el sexo (H para hombre y M para mujer)'
		Leer sexo
		Si sexo<>'m' | sexo<>'h' | peso<0 | altura<0 Entonces
			Escribir 'Ha ingresado un dato invalido'
		FinSi
	Hasta Que (sexo='m' | sexo='h' | peso<0 | altura<0)
	Si sexo='m' Entonces
		Si peso>=130 & altura>1.50 Entonces
			dosis <- (altura*0.25)+(peso*0.75)
			Escribir Concatenar('La dosis de vitaminas en gramos que debe consumir es de ',ConvertirATexto(dosis))
		SiNo
			dosis <- (altura*0.35)+(peso*0.65)
			Escribir Concatenar('La dosis de vitaminas en gramos que debe consumir es de ',ConvertirATexto(dosis))
		FinSi
	FinSi
	Si sexo='h' Entonces
		Si peso>=150 & altura>1.60 Entonces
			dosis <- (altura*0.2)+(peso*0.8)
			Escribir Concatenar('La dosis de vitaminas en gramos que debe consumir es de ',ConvertirATexto(dosis))
		SiNo
			dosis <- (altura*0.3)+(peso*0.7)
			Escribir Concatenar('La dosis de vitaminas en gramos que debe consumir es de ',ConvertirATexto(dosis))
		FinSi
	FinSi
FinAlgoritmo

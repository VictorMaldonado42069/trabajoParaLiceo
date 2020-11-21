Algoritmo ejercicioCuatro
	Definir sueldoBase,horasTrabajadas,horasExtra,total Como Real
	Definir he,categoria Como Caracter // he = almacena si trabajó o no horas extra
	Escribir 'Indique el salario base del trabajador'
	Leer sueldoBase
	Escribir 'Escriba las horas trabajadas'
	Leer horasTrabajadas
	Escribir 'Señale la categoria del trabajador (A, B, C, D)'
	Leer categoria
	Escribir '¿Trabajó horas extra? (escribir 1 para <<sí>> y 0 para <<no>>)'
	Leer he
	Si he='1' Entonces
		Escribir '¿Cuantas horas extra trabajó?'
		Leer horasExtra
		Segun categoria  Hacer
			A,A:
				horasExtra <- horasExtra*4000
			B,B:
				horasExtra <- horasExtra*3000
			C,C:
				horasExtra <- horasExtra*2500
			D,D:
				horasExtra <- horasExtra*1000
			De Otro Modo:
				Escribir 'La categoria escogio no existe, se mostrará el salario total sin horas extra'
				horasExtra <- 0
		FinSegun
		total <- (sueldoBase*horasTrabajadas)+horasExtra
		Escribir Concatenar('El salario total es de ',ConvertirATexto(total))
	SiNo
		total <- (sueldoBase*horasTrabajadas)
		Escribir Concatenar('El salario total es de ',ConvertirATexto(total))
	FinSi
FinAlgoritmo

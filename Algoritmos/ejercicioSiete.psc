Algoritmo ejercicioSiete
	Definir examen,tareas,finalMate,finalFisica,acumulador Como Real
	Definir cantidadTareasFisica,iterador Como Entero
	Escribir 'Ingrese la nota del examen de matemática'
	Leer examen
	examen <- (examen*18)/20
	Escribir 'Ingrese la nota de la tarea #1 de matemática'
	Leer tareas
	acumulador <- acumulador+tareas
	Escribir 'Ingrese la nota de la tarea #2 de matemática'
	Leer tareas
	acumulador <- acumulador+tareas
	Escribir 'Ingrese la nota de la tarea #3 de matemática'
	Leer tareas
	acumulador <- acumulador+tareas
	tareas <- acumulador/3
	finalMate <- examen+tareas
	Escribir 'Ingrese la nota del examen de fisica'
	Leer examen
	examen <- (examen*16)/20
	Escribir 'Indique el numero de tareas de fisica'
	Leer cantidadTareasFisica
	Para iterador<-1 Hasta cantidadTareasFisica Hacer
		Escribir Concatenar('Ingrese la nota de la tarea de matemática #',ConvertirATexto(iterador))
		Leer tareas
		acumulador <- acumulador+tareas
	FinPara
	tareas <- acumulador/cantidadTareasFisica
	finalMate <- examen+tareas
	Escribir Concatenar('Su nota final de matematica es: ',ConvertirATexto(finalMate))
	Escribir Concatenar('Su nota final de fisica es: ',ConvertirATexto(finalFisica))
FinAlgoritmo

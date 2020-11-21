Algoritmo ejercicioSeis
	Definir venta,comision Como Real
	Definir numVentas,indice Como Entero
	Escribir 'Igrese el numero de ventas que ha realizado'
	Leer numVentas
	Si numVentas=0 Entonces
		Escribir 'Su ganancia por ventas es de Bs.0'
	SiNo
		Para indice<-1 Hasta numVentas Hacer
			Escribir Concatenar('Escriba el costo de la venta #',ConvertirATexto(indice))
			Leer venta
			Si venta>0 & venta<500000 Entonces
				comision <- comision+(venta*0.005)
			SiNo
				Si venta>=500000 & venta<1000000 Entonces
					comision <- comision+(venta*0.01)
				SiNo
					Si venta>=1000000 & venta<1500000 Entonces
						comision <- comision+(venta*0.02)
					SiNo
						Si venta>=1500000 Entonces
							comision <- comision+(venta*0.025)
						SiNo
							Escribir 'Usted ha ingresado un valor invalido, vuelva a escribirlo'
							indice <- indice-1
						FinSi
					FinSi
				FinSi
			FinSi
		FinPara
		Escribir Concatenar('Su ganancia por ventas es de Bs.',ConvertirATexto(comision))
	FinSi
FinAlgoritmo

Algoritmo SistemaCompraTechShop
	Escribir "Sistema de Compra TechShop"
	
	//Definicion de variables
	Definir  usuarioValido, contrasenaValida Como Logico
	Definir intentosLogin, intentosPago, descuento Como Entero
	Definir totalCompra, totalFinal, precioProducto, cantidadProducto, subTotal Como Real
	Definir respuestaPago Como Cadena 
	
	usuarioValido <- Falso
	contrasenaValida <- Falso
	intentosLogin <- 0
	
	Mientras intentosLogin < 3 Y (usuarioValido = Falso O contrasenaValida = Falso) Hacer
		Escribir "Ingrese su nombre de usuario: "
		Leer nombreUsuario
		Escribir  "Ingrese Contraseña: "
		Leer contrasena
		
		
			si nombreUsuario = "cliente" y contrasena = "1234" Entonces
				usuarioValido <- Verdadero
				contrasenaValida <- Verdadero
				Escribir "inicio de sesión exitoso"
			SiNo
				intentosLogin <- intentosLogin + 1
				si intentosLogin < 3 Entonces
					Escribir "Credenicales Incorrectas. Intente de nuevo"
				SiNo
					Escribir "Acceso bloqueado por demasiados intentos fallidos"
				FinSi
			FinSi		
	FinMientras //Cierre correcto del primer Mientras
	
	//seleccion de productos
	//inicializamos variables
	totalCompra <- 0 
	cantidadProducto <- 0
	precioProducto <- 0
	subTotal <- 0
	
	Repetir
		Escribir "Ingrese el precio del producto (0 para finalizar): "
		Leer precioProducto 
		Si precioProducto > 0 Entonces
			Escribir "Ingrese la cantidad del Producto: "
			Leer cantidadProducto
			subTotal <- precioProducto * cantidadProducto
			totalCompra <- totalCompra + subTotal
			Escribir  "Producto añadido al carrito. Subtotal: ", subTotal
			
		FinSi
	Hasta Que precioProducto = 0
	
FinAlgoritmo

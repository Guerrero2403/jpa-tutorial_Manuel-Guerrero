TAREA GRUPAL(EXPOCICION)
INTEGRANTES:
-Manuel Guerrero
-Bustamante Daniela
-Yair Chiang
-Bryan Abarca
 
Descripción de la Tarea:

 

Parte 1: Configuración del Proyecto

 

1.   Crear un Proyecto Spring Boot:

      •   Visita Spring Initializr.

      •   Configura el proyecto con los siguientes detalles:

             •   Project: Maven

             •   Language: Java

             •   Spring Boot: 2.5.4 (o la versión más reciente)

             •   Group: com.ejemplo

             •   Artifact: jpa-tutorial

             •   Name: jpa-tutorial

             •   Package name: com.ejemplo.jpa-tutorial

             •   Packaging: Jar

             •   Java: 8 o superior



      •   Añade las dependencias:

             •   Spring Web

             •   Spring Data JPA

             •   Base de datos relacional

      •   Genera y descarga el proyecto.

      •   Abre el proyecto en tu IDE favorito.
![Captura de pantalla (2296)](https://github.com/Guerrero2403/jpa-tutorial_Manuel-Guerrero/blob/main/capturas/Screenshot_1.png)

 

Parte 2: Crear la Entidad y el Repositorio

 

1.   Crear la Entidad Producto:

      •   Crea un paquete llamado model.

      •   Dentro del paquete model, crea una clase Producto.
![Captura de pantalla (2296)](https://github.com/Guerrero2403/jpa-tutorial_Manuel-Guerrero/blob/main/capturas/Screenshot_2.png)

2.   Crear el Repositorio ProductoRepository:

      •   Crea un paquete llamado repository.

      •   Dentro del paquete repository, crea una interfaz ProductoRepository.
     ![Captura de pantalla (2296)](https://github.com/Guerrero2403/jpa-tutorial_Manuel-Guerrero/blob/main/capturas/Screenshot_4.png)

 

Parte 3: Crear el Servicio


1.   Crear la Clase ProductoService:

      •   Crea un paquete llamado service.

      •   Dentro del paquete service, crea una clase ProductoService.
   ![Captura de pantalla (2296)](https://github.com/Guerrero2403/jpa-tutorial_Manuel-Guerrero/blob/main/capturas/Screenshot_5.png)


 

Parte 4: Crear el Controlador

 

1.   Crear la Clase ProductoController:

      •   Crea un paquete llamado controller.

      •   Dentro del paquete controller, crea una clase ProductoController.

 

Parte 5: Inicializar la Base de Datos

 

1.   Cargar Datos de Prueba:

      •   Crea una clase de configuración para inicializar algunos objetos Producto al inicio de la aplicación.
![Captura de pantalla (2296)](https://github.com/Guerrero2403/jpa-tutorial_Manuel-Guerrero/blob/main/capturas/Screenshot_2.png)

 

Parte 6: Ejecutar y Probar la Aplicación

 

1.   Ejecutar la Aplicación:

      •   Ejecuta tu aplicación desde tu IDE o desde la línea de comandos con mvn spring-boot:run.

2.   Probar los Endpoints:

      •   Usa herramientas como Postman o cURL para probar los endpoints REST que has creado:

             •   GET /api/productos

             •   GET /api/productos/{id}

             •   GET /api/productos/search?nombre={nombre}

            •.   GET /api/productos/searchByPrecio?preciomin={preciomin }&preciomax={ preciomax}

 

Los datos de prueba son los siguientes:

repository.save(new Producto("Laptop", "Laptop de alta gama", 1500.00));

            repository.save(new Producto("Smartphone", "Smartphone con cámara de 48MP", 700.00));

            repository.save(new Producto("Monitor", "Monitor 4K de 27 pulgadas", 300.00));

            repository.save(new Producto("Teclado", "Teclado mecánico retroiluminado", 100.00));

            repository.save(new Producto("Mouse", "Mouse inalámbrico ergonómico", 50.00));



PRUEBAS DEL CODIGO 


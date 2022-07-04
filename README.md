# Proyecto2_WebService
Tarea Programada 2 del Curso Sistemas Operativos 2022.  Jerry Solera Celestino y Adrián Lobo Oviedo.
La apliación trata sobre un registro sencillo de mascotas y sus respectivos dueños.
Al inicializar tenemos la opción 1, en la cual usted deberá digitar el nombre de su mascota y su ID (ID del dueño), mientras que la opción 0 se saldrá del programa.

---------------------------------------------------------------------------------------------------------------------------------------------------------------

Usado en este proyecto:

  * Lenguaje de Programación JAVA
  * Payara Server
  * JDK 11
  * NetBeans

---------------------------------------------------------------------------------------------------------------------------------------------------------------

Al digitar el nombre de la mascota y el ID del dueño, se mandará una petición POST al web service para que almacene los datos, creando hilos por cada petición.

Hacer funcionar la API:

- Compilar Server_WebService para levantar el servicio web o añadir el archivo .war al payara server en aplicaciones.

- Compilar Cliente_WebService para utilizar la aplicación de ingreso de mascotas.

- El archivo log se almacenará los archivos de payara "payara5\glassfish\domains\domain1\config"

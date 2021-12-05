![](IBM.png)

### Caso Practico
Construir un Micro Servicio \ API donde el usuario o sistema pasa la informaci�n para definir el perfil de tarjetas de cr�dito, de acuerdo con el cuadro siguiente:

![](tabla.jpg)

Esta aplicaci�n ser� la responsable de obtener el tipo de tarjeta de cr�dito m�s adecuado para el cliente basado en su perfil. Los datos de perfil que el usuario capturar� son los siguientes:

Input:
- Preferencias (Your passion)
- Salario (Monthly salary)
- Edad (Age)

OutPut
- Tipo de tarjeta

------------

**Datos:**
+  Cliente:
    * Preferencias (Your passion)
		- Shoping
		- Travels
		- Help
		- My business
		- Sports
		- My style
	* Salario (Monthly salary)
		- 6999 > salary < 15000; < 35000; < more
		- 11999 > salary < 30000; < more
		- 14999 > salary < 30000; < 35000
		- 29999 > salary < 35000
		- 34999 > salary < 50000; < more
		- 49999 > salary < more
	* Edad (Age)
		- 17 > age < 24
		- 23 > age < 33
		- 32 > age < 76
+ TipoTarjeta:
	* B*smart
	* Afinity Card
	* Clasica
	* Office Depot
	* Costco
	* Best Buy Banamex
	* The Home Depot
	* Oro
	* Platinum
	* Citi / AAdvantage
	* Banamex Teleton
	* APAC
	* Marti Clasica Citibanamex
	* America Deporteismo
	* Pumas Deporteismo
	* Toluca Deporteismo
	* La verde Deporteismo
	* Marti Premium Citibanamex

------------

**Componentes importantes:**
- Java 8;
- Desarrollo en REST;
- Spring Boot;
- Spring Cloud;
- Maven;
------------

# TarjetasREST
Paso a paso para ejecutar la aplicaci�n:

1. Instalar PostgreSQL
- Al momento de instalar tener en cuenta la siguiente configuraci�n del motor de base de datos:
- usuario: postgres
- contrasena: admin

(Si ya tiene instalado Postgres omitir este paso y valide el usuario y la contrase�a de la base de datos)

2. Luego de instalar el motor de base de datos debe:

- Crear base de datos universidad.

Una vez creada la base de datos ejecutar los siguientes queries:

- create schema universidad;

3. Clonar y descargar el presente proyecto:
- https://github.com/Guadalupe-Moreno/TarjetasREST.git

4. Importar el proyecto como MAVEN en la IDE spring tool suite, eclipse o intellij, 
**se debe tener instalada la librer�a lombook**

![](Import.png)

5. Ejecutar el proyecto **run as spring boot app**

****
# Mi Programa de Conversión de Monedas

Este proyecto es un programa simple en Java que permite convertir entre diferentes tipos de monedas utilizando la API de Exchange Rate.

## Estructura del Proyecto

El proyecto está estructurado en diferentes paquetes y clases:

- **`com.gioyis.miprograma.principal`**: Contiene la clase principal `Principal` que es el punto de entrada del programa y la clase `Menu` que muestra el menú de opciones al usuario.

- **`com.gioyis.miprograma.apiconversor`**: Contiene la clase `ConfigApi` que configura la conexión con la API de Exchange Rate y la clase `MiMoneda` que representa la respuesta de la API.

- **`com.gioyis.miprograma.modelos`**: Contiene las clases `Moneda` y `ConvertirMoneda` que representan los modelos de datos para las monedas y realizan las operaciones de conversión.

## Uso del Programa

El programa permite al usuario seleccionar el tipo de conversión de moneda que desea realizar a través de un menú interactivo. Luego, solicita la cantidad de la moneda a convertir y muestra el valor convertido.

### Opciones de Conversión

El usuario puede seleccionar entre las siguientes opciones de conversión:

1. GTQ Quetzal => USD Dollar Estadounidense
2. USD Dollar Estadounidense => GTQ Quetzal
3. GTQ Quetzal => MXN Peso Mexicano
4. MXN Peso Mexicano => GTQ Quetzal
5. GTQ Quetzal => EUR Euro
6. EUR Euro => GTQ Quetzal
7. GTQ Quetzal => PEN Sol Peruano
8. PEN Sol Peruano => GTQ Quetzal
0. Salir del programa

## Configuración

Para utilizar el programa, asegúrate de tener instalado Java en tu sistema. Además, es necesario tener una conexión a internet para acceder a la API de Exchange Rate.

## Ejecución del Programa

Para ejecutar el programa, sigue estos pasos:

1. Clona el repositorio o descarga el código fuente.
2. Abre una terminal y navega hasta el directorio donde se encuentra el archivo `Principal.java`.
3. Compila el programa utilizando el comando `javac Principal.java`.
4. Ejecuta el programa con el comando `java Principal`.

¡Disfruta del programa de conversión de monedas!

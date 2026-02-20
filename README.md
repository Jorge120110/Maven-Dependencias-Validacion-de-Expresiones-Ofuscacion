# Maven + Dependencias + Validación de Expresiones + Ofuscación

## Requisitos: 

Java 8 

## Instrucciones de Compilación:

Primero entrar a /umg.edu.gt.data-structure.stack y ejecutar mvn clean install -Pobfuscate.

Luego entrar a /stackHandler y ejecutar mvn clean package -Pobfuscate.

## Instrucciones de Ejecución:
```
Ejecutar el JAR normal: java -jar target/stackHandler-0.0.1-SNAPSHOT.jar.

Ejecutar el JAR ofuscado: java -jar target/stackHandler-0.0.1-SNAPSHOT-obf.jar.
```
## Análisis de Ingeniería Inversa:

### ¿Qué tanto se dificulta la lectura?: 

Desde mi punto de vista, utilizando YGuard (porque me daba muchos menos problemas que ProGuard), si bien la sintaxis general si cambia, no se imposibilita su lectura, una persona que sepa medianamente lo que hace (incluso yo sin mucha experiencia) podría tomar las funciones e inspeccionarlo para obtener sus funciones, esta bien para confundir, pero creo que no seria lo optimo para la seguridad.

### ¿Se pierde claridad estructural?: 

Si bien el orden se mantiene igual, si que cambia un poco la lógica interna del código, por lo que se necesitaría un análisis mas pausado para saber que pasa.


## 📓 Notas de la Clase 1
## **SINTAXIS BASICA**
Antes de realizar codigo es importante primero escribir la sentencia public static void main(String[] args), debido a
que sin esto no vamos a poder generar codigo dentro de java, ya que ese es el punto de entrada del programa.
**Cómo podemos imprimir algo en JAVA?**
- Utilizamos System.out.println() y dentro del parentesis ponemos el texto que queremos imprimir pero entre comillas dobles,
como lo podemos evidenciar en el archivo holaMundo, para ahorrarnos tiempo podemos escribir sout y precionar TAB y se no
coloca la linea completa, además que es imporante saber que por el hecho de poner .printl se nos va a realizar un salto de 
linea al final de la impresión si es que no queremos eso podemos solo usar .print.
- Algo muy importante que me di cuenta al realizar mis primero ejercicios es el uso del salto de linea cuanod estamos 
imprimiendo codigo lo que nos permite usar solo un print pero imprimir codigo en 2 lineas diferentes.
- En el ejercicio 6 del archivo ejerciciosSintaxisBasica podemos observar la palabra err que se usa en conjunto con el System y el println
para generarnos un mensaje en color rojo, la sentencias es: System.err.println()

## **VARIABLES Y CONSTANTES**
## **Las Variables**
las variables como su propio nombre lo indica son valores que van a cambiar constantemente a medida que nosotros 
vayamos reasignando valores a las mismas, entonces, a modo de analogía asociamos a las varibales de la siguiente
manera: es una caja de un tipo especifico que tiene un nombre y un contenido dentro, como por ejemplo:

- **String:** tipo especifico de la caja
- **name:** nombre de la caja (puede ser cualquiera, aunque hay ciertas "reglas" que tenemos que seguir)
- **"Josue":** es el contenido de la caja, recordando que un String se lo define entre comillas dobles

Pero tenemos que recordar que String es un clase que sirve para guardar cadenas de texto no datos primitivos,
por ello su sintaxis es la S en mayusculas, a diferencia de lo siguientes tipos de variables que su sintaxis es en
minusculas:

- int 
- byte 
- float 
- double 
- char 
- long 
- boolean

Estos si son tipos de variables que nos permiten almacenar datos los datos primitivos de java y como podemos ver su sintaxis 
es en minusculas.

## ** Las Constantes**
Como su nombre lo indica son valores que son constantes desde que los definimos es decir que no los vamos a poder
cambiar en ningun momentos y se las define completamente en mayusculas y con la palbra reservada final

Ejemplo de definición de una constante:
final double IVA = 0.15; 

## **Inferencia de tipos**
Tambien podemos definir cualquier variable con la palabra reservada var así java infiere un tipo de varibale sin que nosotros 
tengamos que hacerlo manuelmente es decir que podemos definir una variable así:
var nombre = "Josue"; 
No le estamos deciendo a java directamente que vamos a definir un String pero el lo infiere, aunque igual es importante
recordar que si nosotros creamos una varibale con var y su contenido es de tipo string no lo vamos a poder cambiar despues. 


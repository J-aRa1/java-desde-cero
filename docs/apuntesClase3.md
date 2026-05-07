## 📓 Notas de la Clase 3
## **Los Strings**
Como ya lo mencionamos antes estas no son de tipo primitivo si no es considerado una clase, ya que se construye a base de caracteres y se usa para
almacenar cadenas de texto, como ya lo vimos antes para definir una variable de este tipo lo hacemos con la palabra reservada String
sin embargo al ser una clase tambien lo podemos hacer con su constructor y definir un string con la palabra new, por ejemplo:
- var apellido = new String ("ApeliidoPrueba")

Pero ya que string es muy usado Java lo acorta para que podamos definirlo de la manera que lo hemos venido haciendo ya que si lo hacemos como lo hemos visto 
recien java nos dirá que es redundante. 

--- 
## **Concatenación de String**
En pocas palabras la concatenación son sirve para "unir" Strings al momento de imprimirlo o de operarlos con el .concat, por ejemplo si 
yo defino 2 variables con mi nombre y apellido y quiero imprimir todo jutno con un solo print puedo usar el "+" como simbolo de concatenación
y la sentencia se vería algo así println(nombre + apellido) teniendo en cuenta que nombre y apellido en este caso serían variables

--- 
## **lenght**
Cuando nosotros trabajos con Strings muchas veces nos conviene saber cuál es la longitud del String con el que estamos trabajando, 
para eso usamos .lenght esto lo hacemos siempre y cuando vaya seguido de una variable definida ya que el lenght funciona de la siguiente forma:
- varibaleEjemplo.lenght 

Asi entonces si nososotros almacenos esa nueva varibale y la imprimimos nos daría un numero con la longitud de la variable, pero es muy importante recordar
que en java los espacios entre letras tambien ocupan espacio en la longitud de la variable. 

---
## **charAt**
Nos sirve cuando nosotros queremos saber el caracter de una posicion especifica de nuestro String ya que a diferencia del .lenght el charAt utiliza un 
argumento es decir si nosotros usamos el mismo ejemplo de antes
- varibaleEjemplo.charAt() Dentro del parentesis debemos especificar la posición del caracter que nosotros queremos obtener teniendo en cuanta que los valores inician en 0. 
Entonces si nosotros colacamos el 0 dentro de los parentesis del ejemplo nos imprimiría la primera letra de la variable.

  


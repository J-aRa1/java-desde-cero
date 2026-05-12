## 📓 Notas de la Clase 5
## **toUpperCase/toLowerCase**
Utilizamos estos métodos para que toda una cadena de texto se vuelva mayusculas o minusculas, para entenderlo más facilmente
lo vamos a ejemplificar en el codigo a continuación: 
``` java
public class ejemplo_toUpper_and_Lower_case {
    static void main(String[] args) {
    // Se define una variable de tipo String en este caso con un nombre y con el uso de las mayusculas y minusculas 
    // mezclando para poder evidenciar de mejor manera el cambio. 
    String nombre = "NoMBrE_PRUeba";
    nombre = nombre.toLowerCase();
    System.out.println(nombre)
    // En este caso la impresión sería: nombre_prueba  
    // Podemos usar la misma variable para el uso del toUpperCase
    nombre = nombre.toUpperCase();
    System.out.println(nombre);
    // Y en este caso la salida sería: NOMBRE_PRUEBA
    // Es importante aclarar que tambien podemos definir la variable con el método todo en una misma linea de esta forma:
    String nombre = "NoMBrE_PRUeba".toUpperCase();
    String nombre = "NoMBrE_PRUeba".toLowerCase();
    }
}
```
---
## **contains**
Este es un método que se puedo utilizar para comprobar si es que un String contiene los caractere especificos que nosotros 
le digamos, para su uso debomos utilizar .contains() y dentro de los paréntesis deben los caracteres que queremos comprobar, 
pero es importante aclarar que el resultado de este método es un boolean. 
- Ejemplo:
``` java
public class ejemplo_contains {
    static void main(String[] args) {
    String frase = "Hoy es un lindo día".contains(oy); // Dentro del parentesis van los caracteres que queremos comprobar.
    // En este ejemplo quiero comprobar si en la frase hay un oy. 
    // Ahora si yo imprimo frase el resultado va a ser true pq si existe.
    // Sin embargo es muy importante evaluar este método en igualdad de condiciones por ello tambien es muy importante 
    // concatenar este método con el anteriormente explicado y así que este método sea mucho más eficiente. 
    }
}
```
--- 
## **equals**
Un error muy común es utilizar el == para compara String en java pero esto está un poco erroneo ya que si bien muchas veces
puede servir no es lo más optimo para comparar el contenido de 2 Strings, para ello es mejor utilizar el método .equals.
- Ejemplo:
``` java
public class ejemplo_equals {
    static void main(String[] args) {
    String ej1 = "ejemplo";
    String ej2 = "ejemplo";
    System.out.println(ej1.equals(ej2));
    // En este caso en especifico la salida va a ser true, sin embargo su yo cambiaria solo una letra por una mayuscula 
    // el resultado sería false, pero para evitar este probelma de las mayusculas y minusculas existe un método para ignorar 
    // el tipo de letras y que se compare solo el contenido y es el método .equalsIgnoreCase, así entonces podemos comparar
    // Strings de una forma más comoda. 
    // Redfinimos las variables anteriores pero esta vez alterando los caracteres.
    ej1 = "ejEMPLo";
    ej2 = "EjeMplO";
    System.out.println(ej1.equalsIgnoreCase(ej2));
    // El resultado de este print de igual manera va a ser true por lo anteriormente explicado.
    }
}
```
---
## **trim**
Usamos este método para eliminar los espacios del principio y del final de un String pero esto no afecta a los espacios
intermedios del mismo, es decir: que este método se utiliza más cuando se le pide datos al usuario y nosotros para limpiar los datos 
utilizamos este método para eliminar los espacios del principio y del final.
- Ejemplo:
``` java
public class ejemplo_trim { 
    static void main(String[] args) {
    // Para este ejemplo uso datos ya definidos.
    String nombre = "     Nombre_Ejemplo         "; 
    // Como podemos ver a modo de exageración para poder evidenciar mejor el método hemos usado varios espacios al
    // principio y al final de la variable.
    System.out.println(nombre.trim());
    // Al usar el método la salida es: Nombre_Ejemplo.
    // Sin espacios ni al principio ni al final. 
    }
}
```
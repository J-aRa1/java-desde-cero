## 📓 Notas de la Clase 4
## **substring**
Esto lo usamos cuando queremos "quedarnos" con una parte de la cadena String es decir si yo tengo una cadena de texto muy larga
pero yo solo quiero tener cierta parte de ese String lo que hacemos es usar `.substring` para cortar la parte que queremos, su uso es de la siguiente forma
posterior a tener una variable con un String dentro nosotros podemos volver a llamar a esa variable con su nombre por ejemplo:
- stringLargoEj.substring() como vemos tenemos un par de parentesis donde java nos obliga a poner un parámetro, pero lo podemos hacer de dos formas
El primero es donde solo usamos el número de ubicación de caulquier caracter del String y al imprimir de nuevo la variable se nos imprimirá desde la posición 
puesta en los parentesis hasta el final, sin embargo tambien podemos poner un principio y un fin exacto al definir obvimente 2 numeros en el parentesis, por ejemplo
si yo quiero imprimir de la posición 1 hasta la 5 son los números que tendremos que poner en el parentesis, sin embargo como ya lo vimos el primer caracter para java siempre es 0.
``` java
public class Ejemplo_substring {
    public static void main(String[] args) {
    String fraseLarga = "El éxito es la suma de pequeños esfuerzos repetidos día tras día.";
    String fraseLargaCortada = fraseLarga.substring(15);
    System.out.println(fraseLargaCortada);
    // Al imprimir este texto vamos a obtener la frase desde la posición 15 hasta el final de la frase 
    // fraseLargaCortada: suma de pequeños esfuerzos repetidos día tras día.
    /* Ahora hagamos un ejemplo con la otra forma de aplicar .substring cuando en el parámetro tenemos 2 números que marcan
       el inicio y el fin de la frase. */ 
    String fraseLargaCortada2 = fraseLarga.substring(15, 31); // Un dato muy importante a tener en cuenta es que el caracter 31 
    // no se va a imprimir si no el 30.
    System.out.println(fraseLargaCortada2);
    // La salida en este caso va a ser: suma de pequeños 
    }
}
```


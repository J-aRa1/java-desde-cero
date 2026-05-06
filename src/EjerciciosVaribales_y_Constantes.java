public class EjerciciosVaribales_y_Constantes {
    static void main(String[] args) {
        // 1. Declara una variable de tipos String y asignale un nombre.
        String nombre;
        nombre = "Nombre de Prueba";
        System.out.println(nombre);

        // 2. Crea una varibale de tipo int y asignale una edad.
        int edad;
        edad = 15;
        System.out.println(edad);

        // 3. Crear una varibale double con una altura en metros.
        double altura;
        altura = 1.98;
        System.out.println(altura);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likeProgramming = true;
        System.out.println(likeProgramming);

        // 5. Declara una constante con tu email.
        final String email = "correoprueba@github.com";
        System.out.println(email);

        // 6. Crea una variable de tipo char y guarda una inicial
        char incial = 'A';
        System.out.println(incial);

        // 7. Crea una variable con tu localidad, luego cambia su valor y vuelve a imprimirla
        String localidad = "Ciudad de Pruba";
        System.out.println(localidad);
        localidad = "Gotham City";
        System.out.println(localidad);

        // 8. Crea una varible int llamda a, otra int llamda b e imprimir la suma de ambas
        int a = 10;
        int b = 20;
        int suma = a+b;
        System.out.println(suma);

        // 9. Imprime el tipo de dos varibles definidas anteriormente

        String nombre9 = "Java";
        Integer num9 = 2;

        System.out.println(nombre.getClass().getSimpleName());
        System.out.println(num9.getClass().getSimpleName());
        //Algo importante es que al utilizar .getClass solo lo podemos hacer con el String y no con los tipos de variables
        // primitivas como int, por ello para poder imprimir el tipo de num9 utilicé Integer.

        // 10. Intenta declarar una varibale sin inicializarla y luego asignale un valor antes de imprimirla
        String color;
        color = "Rojo";
        System.out.println("El color que se eligió fue: "+color);
    }
}

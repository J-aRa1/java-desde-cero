public class ejerciciosSintaxisBasica {
    public void main(String[] args) {
        // 1. Imprime un mensaje que diga tu nombre en lugar de "Hola, mundo"
        System.out.println("Mi nombre es: Josué R.");

        // 2. Imprime 2 líneas: "Hola" y luego "Mundo" con un solo println
        System.out.println("Hola\nMundo");

        // 5. Imprime tu edad, tu color favorito
        // Forma 1:
        System.out.println("Mi edad es: 19 años, mi color favorito es: Negro");
        // Forma 2:
        String nombre = "Mi edad es: 19 años";
        nombre = nombre.concat(", mi color favorito es: Negro");
        System.out.println(nombre);

        // 6. Explora los diferentes System.XXX.println(); más allá del "out"
        System.err.println("ERROR");

        // 7. Utiliza varios println para imprimir una frase
        System.out.println("Hola mundo");
        System.out.println("Este soy yo desde JAVA");
        System.out.println("Ten un lido día");

        // 8. Imprime un diseño ASCII por ejemplo una cara feliz usando simbolos
        System.out.println("o.o");

        // 9. Ejecutar el programa sin el metodo main
        // Aquí me saltó error y no me dejó ni siquiera correr el programa.
    }
}

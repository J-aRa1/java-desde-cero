public class ejerciciosDeOperadores {
    public void main(String[] args) {
        // 1. Crea una variable con el resultado de cada operación aritmetica.
        // 1.1 Suma
        var num1 = 3;
        var num2 = 6;
        var sumar = num1 + num2;
        System.out.println(sumar);
        // 1.2 Restar
        var num3 = 10;
        var num4 = 6;
        var restar = num3 - num4;
        System.out.println(restar);
        // 1.3 Multiplicar
        var num5 = 10;
        var num6 = 3;
        var multi = num5*num6;
        System.out.println(multi);
        // 1.4 Dividir
        var num7 = 21.0;
        var num8 = 3.2;
        var div = num7/num8;
        System.out.println(div);
        // 1.5 Modulo
        var num9 = 16;
        var num10 = 4;
        var modulo = num9%num10;
        System.out.println(modulo);

        // 2. Crea una variable para cada tipo de operador de asignación.
        // 2.1 =
        var igual = 3; //Se usa el operador de asignación =
        // 2.2 +=
        var Num1 = 3;
        Num1 += 2;
        System.out.println(Num1);
        // 2.3 -=
        var Num2 = 8;
        Num2 -= 6;
        System.out.println(Num2);
        // 2.4 *=
        var Num3 = 7;
        Num3 *= 3;
        System.out.println(Num3);
        // 2.5 /=
        var Num4 = 12;
        Num4 /= 4;
        System.out.println(Num4);

        // 3. Imprimir 3 comparaciones verdares con diferentes los operadores de comparación.
        var comp1 = 4>2;
        System.out.println(comp1);
        var comp2 = 3<6;
        System.out.println(comp2);
        var comp3 = 0>=0;
        System.out.println(comp3);

        // 4. Imprimir 3 comparaciones falsas con diferentes los operadores de comparación.
        var comp4 = 10 == 2;
        System.out.println(comp4);
        var comp5 = 9 > 23;
        System.out.println(comp5);
        var comp6 = 11<= 3;
        System.out.println(comp6);

        // 5. Utilizar el operador lógico AND.
        var oplog1 = 12 > 4;
        var oplog2 = 9 == 9;
        var AND = oplog1 && oplog2;
        System.out.println(AND); // El valor del AND es verdadero cuando ambos valores de verdad son verdaderos, caso contrario sería falso.

        // 6. Utiliza el operador lógico OR
        var oplog3 = 90 < 33 || 11 == 87;
        System.out.println(oplog3); // El valor del OR es negativo solo cuando ambos valores de verdad son negativos, caso contrario sería verdadero.

        // 7. Combina ambos operadores lógicos
        var oplog4 = (21>12) && (23>=23);
        System.out.println(oplog4); // Es verdadero ya que ambos valores de verdad son verdaderos.

        // 8. Añade alguna negación
        var oplog5 = !(30>60);
        System.out.println(oplog5);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        // 9.1
        var opun1 = 12;
        System.out.println(-opun1);
        // 9.2
        var opun2 = 0;
        opun2++;
        System.out.println(opun2);
        // 9.3
        var opun3 = 12;
        --opun3;
        System.out.println(opun3);

        // 10. Combina operadores aritmeticos, de comparación y lógicos.
        // Uso Op. Aritmeticos
        var oparit1 = 3*12;
        var oparit2 = 90%10;

        // Uso de Op. de comparacióm
        var opcom = oparit1 > oparit2;

        // Uso de Op. Logicos
        var oplog = opcom && 12>=12;
        System.out.println(oplog);
    }
}

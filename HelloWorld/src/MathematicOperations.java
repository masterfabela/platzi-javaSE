public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // Devuelbe un entero hacia arriba
        System.out.println(Math.ceil(x));
        // Debuelve un entero hacia abajo
        System.out.println(Math.floor(x));
        // Debuelve un numero elevado
        System.out.println(Math.pow(x,y));
        // Devuelbe el numero mayor
        System.out.println(Math.max(x, y));
        // Obtiene la raiz cuadrada de un numero
        System.out.println(Math.sqrt(y));
        // Area de un Circulo
        // pi * r2
        System.out.println(Math.PI + Math.pow(y,2));

        // Area de una esfera
        // 4*pi*r4
        System.out.println(4 * Math.PI * Math.pow(y,2));

        // Voulumen Esfera
        // (4/3)*pi*r3
        System.out.println((4.0/3.0)*Math.PI*Math.pow(y,3));


    }
}

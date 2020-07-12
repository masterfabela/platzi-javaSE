public class Funciones {
    public static void main(String[] args) {
        // Area de un Circulo
        double y = 3;
        System.out.println(circleArea(y));
        System.out.println(sphereArea(y));
        System.out.println(sphereVolumen(y));
        System.out.println(convertToDolar(200,"MXN"));
        System.out.println(convertToDolar(1000,"COP "));
    }

    /**
     * Calcula la area de un circulo
     * @param radio Radio del circulo
     * @return Area del circulo
     */
    public static double circleArea(double radio){
        return Math.PI + Math.pow(radio,2);
    }

    /**
     * Calcula el area de una esfera
     * @param radio Radio de la esfera
     * @return Area de la esfera
     */
    public static double sphereArea(double radio){
        return 4 * Math.PI * Math.pow(radio,2);
    }

    /**
     * Calcula el volumen de una esfera
     * @param radio Radio de la esfera
     * @return Volumen de la esfera
     */
    public static double sphereVolumen(double radio){
        return (4.0/3.0)*Math.PI*Math.pow(radio,3);
    }

    /**
     * Especificando la moneda combierte una cantidad de dinero a dolares
     * @param cantidad Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return Devuelve la cantidad actualizada en dolares
     */
    public static double convertToDolar(double cantidad, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                cantidad = cantidad * 0.052;
                break;
            case "COP":
                cantidad = cantidad * 0.00031;
                break;
        }
        return cantidad;
    }

}

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

    public static double circleArea(double radio){
        return Math.PI + Math.pow(radio,2);
    }

    public static double sphereArea(double radio){
        return 4 * Math.PI * Math.pow(radio,2);
    }

    public static double sphereVolumen(double radio){
        return (4.0/3.0)*Math.PI*Math.pow(radio,3);
    }

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

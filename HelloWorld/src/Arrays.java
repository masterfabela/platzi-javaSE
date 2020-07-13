public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];
        String[][] cities = new String[4][2];
        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for (int i = 0; i<androidVersions.length; i++){
            System.out.println(androidVersions[i]);
        }

        for (String androidVersion : androidVersions){
            System.out.println(androidVersion);
        }
/*
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);*/

        System.out.println();
        System.out.println();
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Bogota";
        cities[1][1] = "Mexico";

        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);

        for (int i = 0; i < cities.length ; i++) {
            for (int j = 0; j < cities[0].length ; j++) {
                System.out.println(cities[i][j]);
            };
        }

        for (String[] pair: cities){
            for(String city: pair){
                System.out.println(city);
            }
        }

        String [][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i < animals.length ; i++) {
            for (int j = 0; j <animals[0].length ; j++) {
                for (int k = 0; k <animals[0][0].length ; k++) {
                    for (int l = 0; l <animals[0][0][0].length ; l++) {
                        System.out.println(animals[1][j][k][l]);
                    }

                }
            }
        }

    }
}

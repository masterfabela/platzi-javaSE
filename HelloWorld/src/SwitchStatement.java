public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "dark";
        switch (colorModeSelected){
            case "light":
                System.out.println("Selecionaste light mode");
                break;
            case "night":
                System.out.println("Seleccionaste night mode");
                break;
            case "blue dark":
                System.out.println("Seleccionaste blue dark mode");
                break;
            case "dark":
                System.out.println("Seleccionaste dark mode");
                break;
            default:
                System.out.println("Seleciona una opcion valida");
        }
    }
}

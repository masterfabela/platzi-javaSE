public class UpgradingVariables {

    public static void main(String[] args) {
        int salary = 1000;
        // bono $200
        int bono = 200;
        int completeSalary = salary + bono;
        System.out.println(completeSalary);

        //Pension: $50
        completeSalary = completeSalary - 50;
        System.out.println(completeSalary);

        // 2 horas extra + $30
        // Cupon comida: - $45
        completeSalary = completeSalary + 30 * 2;
        completeSalary = completeSalary - 45;
        System.out.println(completeSalary);

        //Actualizando cadenas de texto
        String employeeName = "Jose Ramon";
        employeeName = employeeName + " Vieites";
        System.out.println(employeeName);
        employeeName = "Irene " + employeeName;
        System.out.println("Tu nombre es " + employeeName);
    }
}

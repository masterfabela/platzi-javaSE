public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int filesSended = 3;
        if (isBluetoothEnabled){
            // Send file
            filesSended++;
            System.out.println("Archivo enviado");
        } else {
            filesSended--;
            System.out.println("Por fsvor enciende tu Bluethoot para iniciar la transferencia");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(filesSended);
    }
}

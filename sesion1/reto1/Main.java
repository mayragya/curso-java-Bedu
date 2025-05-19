//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //objeto tipo paciente
        Paciente paciente1 = new Paciente();

        //Solicitar y asignar los datos ingresados por el usuario
        System.out.print("Ingresa el nombre del paciente:");
        paciente1.nombre =scanner.nextLine();

        System.out.print("Ingresa la edad:");
        paciente1.edad = scanner.nextInt();

        System.out.print("ingresa el numero de expediente:");
        paciente1.numExpediente = scanner.nextLine();

        //mostrar datos ingresados
        paciente1.showData();
        //cerrar scanner
        scanner.close();
    }
}
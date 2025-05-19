public class Paciente {
    String nombre;
    int edad;
    String numExpediente;

    //metodo para mostrar datos del paciente
    void showData(){
        System.out.println("\nInformación del paciente:");
        System.out.println("Paciente:" + nombre);
        System.out.println("Edad:"+ edad);
        System.out.println("Expediente:" + numExpediente);

    }

}

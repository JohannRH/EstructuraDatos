import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner cp = new Scanner(System.in);
        LinkedList lista = new LinkedList<>();
        LinkedList<empleado> listaEmpleado = new LinkedList<empleado>();

        for(int i=0; i < 3; i++){
            empleado e = new empleado();

            System.out.println("EMPLEADO #"+(i+1));
            System.out.println("Nombre: ");
            e.setNombre(cp.nextLine());
            System.out.println("Apellido: ");
            e.setApellido(cp.nextLine());
            System.out.println("Direccion: ");
            e.setDireccion(cp.nextLine());
            System.out.println("Cargo: ");
            e.setCargo(cp.nextLine());
            System.out.println("Edad: ");
            e.setEdad(cp.nextInt());
            cp.nextLine();
            
            listaEmpleado.add(e);
        }
    }
}

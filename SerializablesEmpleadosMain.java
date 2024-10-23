import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class SerializablesEmpleadosMain {
    public static void main(String[] args) {
        SerializablesEmpleados empleados = new SerializablesEmpleados("Marcos", 45, 5000);
        
        try(FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ALUMNO\\Desktop\\AccesoDatos\\empleados.ser");
            ObjectOutputStream objetcOS = new ObjectOutputStream(fileOutputStream)) {
            objetcOS.writeObject(empleados);
        } catch (Exception e) {
            e.printStackTrace();
        }

        SerializablesEmpleados desSearizableEmpleados = null;
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ALUMNO\\Desktop\\AccesoDatos\\empleados.ser");
            ObjectInputStream objectIS = new ObjectInputStream(fileInputStream)) {
            desSearizableEmpleados = (SerializablesEmpleados) objectIS.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("nombre: " + desSearizableEmpleados.getNombre());
        System.out.println("edad: " + desSearizableEmpleados.getEdad());
        System.out.println("salario: " + desSearizableEmpleados.getSalario());

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Desea agregar un nuevo empleado? (s/n): ");
        String respuesta = scanner.nextLine();
        while (respuesta.equals("s")) {
            System.out.println("Ingresa el nombre: ");
            empleados.setNombre(scanner.nextLine());
            System.out.println("Ingresa la edad: ");
            empleados.setEdad(scanner.nextInt());
            System.out.println("Ingrese el salario: ");
            empleados.setSalario(scanner.nextDouble());
            System.out.println("Añadir mas empelados: (s/n)");
            scanner.close();
        }

    }
}

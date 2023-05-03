import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Employee> empleados = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        cargarDatos();
        boolean salir = false;
        while (!salir) {
            System.out.println("\n=== Menú ===");
            System.out.println("1. Mostrar empleados");
            System.out.println("2. Consultar información de un empleado");
            System.out.println("3. Crear un nuevo empleado");
            System.out.println("4. Eliminar un empleado");
            System.out.println("5. Actualizar el nombre de un empleado");
            System.out.println("6. Actualizar el teléfono de un empleado");
            System.out.println("7. Salvar los cambios");
            System.out.println("0. Salir");
            int opcion = leerEntero("Ingrese una opción: ");
            switch (opcion) {
                case 1:
                    mostrarEmpleados();
                    break;
                case 2:
                    consultarEmpleado();
                    break;
                case 3:
                    crearEmpleado();
                    break;
                case 4:
                    eliminarEmpleado();
                    break;
                case 5:
                    actualizarNombre();
                    break;
                case 6:
                    actualizarTelefono();
                    break;
                case 7:
                    salvarCambios();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
    
    private static void cargarDatos() {
        File archivo = new File("datos.csv");
        try {
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[0]);
                String name = datos[1];
                String phone = datos[2];
                float salary = Float.parseFloat(datos[3]);
                Employee empleado = new Employee(id, name, phone, salary);
                empleados.add(empleado);
            }
            lector.close();
            System.out.println("Datos cargados exitosamente.");
        } catch (FileNotFoundException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }
    
    
    private static void mostrarEmpleados() {
        System.out.println("\n=== Empleados ===");
        for (Employee empleado : empleados) {
            System.out.println(empleado.getId() + "\t" + empleado.getName());
        }
    }
    
    private static void consultarEmpleado() {
        int id = leerEntero("Ingrese el ID del empleado: ");
        Employee empleado = buscarEmpleado(id);
        if (empleado != null) {
            System.out.println("\n=== Información del empleado ===");
            System.out.println(empleado.toString());
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
    
    private static void crearEmpleado() {
        String name = leerCadena("Ingrese el nombre del empleado: ");
        Employee empleado = new Employee(name);
        empleados.add(empleado);
        System.out.println("Empleado creado exitosamente.");
    }
    
    private static void eliminarEmpleado() {
        int id = leerEntero("Ingrese el ID del empleado: ");
        Employee empleado = buscarEmpleado(id);
        if (empleado != null) {
            empleados.remove(empleado);
            System.out.println("Empleado eliminado exitosamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
    
    private static void actualizarNombre() {
        int id = leerEntero("Ingrese el ID del empleado: ");
        Employee empleado = buscarEmpleado(id);
        if (empleado != null) {
            String name = leerCadena("Ingrese el nuevo nombre del empleado: ");
            empleado.setName(name);
            System.out.println("Nombre actualizado exitosamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
    
    private static void actualizarTelefono() {
        int id = leerEntero("Ingrese el ID del empleado: ");
        Employee empleado = buscarEmpleado(id);
        if (empleado != null) {
            String phone = leerCadena("Ingrese el nuevo teléfono del empleado: ");
            empleado.setPhone(phone);
            System.out.println("Teléfono actualizado exitosamente.");
        } else {
            System.out.println("Employee no encontrado.");
        }
    }
    
    private static void salvarCambios() {
        File archivo = new File("empleados.txt");
        try {
            PrintWriter escritor = new PrintWriter(archivo);
            for (Employee empleado : empleados) {
                escritor.println(empleado.toString());
            }
            escritor.close();
            System.out.println("Cambios salvados exitosamente.");
        } catch (FileNotFoundException e) {
            System.out.println("Error al salvar los cambios: " + e.getMessage());
        }
    }
    
    private static Employee buscarEmpleado(int id) {
        for (Employee empleado : empleados) {
            if (empleado.getId() == id) {
                return empleado;
            }
        }
        return null;
    }
    
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Valor inválido. " + mensaje);
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
    
    private static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}


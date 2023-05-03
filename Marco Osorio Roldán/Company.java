import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Company {
    private ArrayList<Employee> employees;
    private String filename;

    public Company(String filename) {
        this.filename = filename;
        this.employees = new ArrayList<Employee>();
        cargarDatos();
    }

    private void cargarDatos() {
        // Aquí se carga la información desde el archivo CSV
        // y se crea una lista de empleados
    }

    public Employee read(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public Employee read(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public void create(String name, float salary) {
        // Se crea un empleado con un id aleatorio y se comprueba que sea único
        int id;
        do {
            id = new Random().nextInt(1000);
        } while (read(id) != null);

        // Se crea el empleado y se agrega a la lista
        Employee employee = new Employee(id, name, name, salary);
        employee.setSalary(salary);
        employee.setPhone("011223344");
        employees.add(employee);
    }

    public void delete(int id) {
        Employee employee = read(id);
        if (employee != null) {
            employees.remove(employee);
        }
    }

    public void delete(String name) {
        Employee employee = read(name);
        if (employee != null) {
            employees.remove(employee);
        }
    }

    public void updateName(int id, String newName) {
        Employee employee = read(id);
        if (employee != null) {
            employee.setName(newName);
        }
    }

    public void updateName(String name, String newName) {
        Employee employee = read(name);
        if (employee != null) {
            employee.setName(newName);
        }
    }

    public void updatePhone(int id, String newPhone) {
        Employee employee = read(id);
        if (employee != null) {
            employee.setPhone(newPhone);
        }
    }

    public void updatePhone(String name, String newPhone) {
        Employee employee = read(name);
        if (employee != null) {
            employee.setPhone(newPhone);
        }
    }

    public void save() {
        try {
            FileWriter writer = new FileWriter(filename);

            for (Employee employee : employees) {
                writer.write(employee.toString() + "\n");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo " + filename);
        }
    }

    public String toString() {
        String result = "";
        for (Employee employee : employees) {
            result += employee.getName() + " - " + employee.getId() + "\n";
        }
        return result;
    }
}

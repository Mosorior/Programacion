import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Alumno {
    private String nombre;
    private int edad;
    private double calificacion;

    public Alumno(String nombre, int edad, double calificacion) {
        setNombre(nombre);
        setEdad(edad);
        setCalificacion(calificacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 17 && edad <= 100) {
            this.edad = edad;
        }
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10) {
            this.calificacion = calificacion;
        }
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Calificacion: " + calificacion;
    }
}

class Grupo {
    private ArrayList<Alumno> listaAlumnos;

    // Constructor vacío
    public Grupo() {
        listaAlumnos = new ArrayList<Alumno>();
    }

    // Método para insertar un nuevo alumno a la lista
    public void insertaAlumnoLista(Alumno a) {
        listaAlumnos.add(a);
    }

    // Método para insertar un nuevo alumno a la lista pasando los datos por parámetro
    public void insertaAlumnoLista(String nombre, int edad, double calificacion) {
        Alumno a = new Alumno(nombre, edad, calificacion);
        insertaAlumnoLista(a);
    }

    // Método para obtener una representación en String del grupo
    public String toString() {
        String s = "";
        for (Alumno a : listaAlumnos) {
            s += a.toString() + "\n";
        }
        return s;
    }

    // Método para escribir los datos del grupo en un archivo binario
    public void escribeFicheroBinario(String fichero) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
            oos.writeObject(listaAlumnos);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo binario.");
        }
    }

    // Método para leer los datos del grupo desde un archivo binario
    public void leeFicheroBinario(String fichero) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
            listaAlumnos = (ArrayList<Alumno>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo binario.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al convertir el archivo binario a objeto.");
        }
    }

    // Método para escribir los datos del grupo en un archivo de texto
    public void escribeFicheroTexto(String fichero) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fichero));
            pw.print(toString());
            pw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo de texto.");
        }
    }

    // Método para leer los datos del grupo desde un archivo de texto
    public void leeFicheroTexto(String fichero) {
        try {
            Scanner sc = new Scanner(new File(fichero));
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split(",");
                String nombre = partes[0];
                int edad = Integer.parseInt(partes[1]);
                double calificacion = Double.parseDouble(partes[2]);
                insertaAlumnoLista(nombre, edad, calificacion);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de texto.");
        }
    }

    // Método para escribir los datos del grupo en un archivo CSV
    public void escribeFicheroCSV(String fichero) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fichero));
            for (Alumno a : listaAlumnos) {
                pw.println(a.getNombre() + "," + a.getEdad() + "," + a.getCalificacion());
            }
            pw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo CSV.");
        }
    }

    // Método para leer los datos del grupo desde un archivo CSV
    public void leeFicheroCSV(String fichero) {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(fichero));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                String nombre = data[0];
                int edad = Integer.parseInt(data[1]);
                double calificacion = Double.parseDouble(data[2]);
                Alumno a = new Alumno(nombre, edad, calificacion);
                insertaAlumnoLista(a);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado " + fichero);
        } catch (IOException e) {
            System.err.println("Error: Fallo de lectura del archivo " + fichero);
        } catch (NumberFormatException e) {
            System.err.println("Error: Archivo CSV mal formateado " + fichero);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.err.println("Error: Fallo al cerrar el archivo " + fichero);
                }
            }
        }
    }



public static void main(String[] args) {
    Grupo g = new Grupo();
    g.insertaAlumnoLista(new Alumno("Juan", 20, 7.5));
    g.insertaAlumnoLista(new Alumno("Ana", 19, 8.0));
    g.insertaAlumnoLista("Pedro", 21, 6.5);
    System.out.println(g);
    g.escribeFicheroBinario("alumnos.bin");
    g.leeFicheroBinario("alumnos.bin");
    System.out.println(g);

    g.escribeFicheroTexto("alumnos.txt");
    g.leeFicheroTexto("alumnos.txt");
    System.out.println(g);

    g.escribeFicheroCSV("alumnos.csv");
    g.leeFicheroCSV("alumnos.csv");
    System.out.println(g);

    // Prueba de las propiedades de acceso
    Alumno a = new Alumno("Luis", 16, 9.0);
    System.out.println(a);
    a.setNombre("");
    a.setEdad(101);
    a.setCalificacion(11);
    System.out.println(a);
}
}

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        String nombre;
        float promedio;
        String matricula;

        float promedio1 = 0;
        float promedio2 = 2;
        float promedio3 = 3;

        float n1 = 0;
        float n2 = 0;
        float n3 = 0;

        //Constructores
        Scanner sc = new Scanner(System.in);
        Alumno alumno = new Alumno();

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();

        //Array de calificaciones
        ArrayList<Calificaciones> calificaciones1 = new ArrayList<Calificaciones>();
        ArrayList<Calificaciones> calificaciones2 = new ArrayList<Calificaciones>();
        ArrayList<Calificaciones> calificaciones3 = new ArrayList<Calificaciones>();


        try {
            calificaciones1.add(new Calificaciones("Matematicas", 90));
            calificaciones1.add(new Calificaciones("Fisica", 80));
            calificaciones1.add(new Calificaciones("Historia", 90));
            calificaciones1.add(new Calificaciones("Geografia", 85));
            calificaciones1.add(new Calificaciones("Biologia", 90));
            calificaciones1.add(new Calificaciones("Programacion", 90));
            calificaciones1.add(new Calificaciones("Calculo", 90));

            calificaciones2.add(new Calificaciones("Matematicas", 85));
            calificaciones2.add(new Calificaciones("Fisica", 70));
            calificaciones2.add(new Calificaciones("Historia", 100));
            calificaciones2.add(new Calificaciones("Geografia", 85));
            calificaciones2.add(new Calificaciones("Biologia", 65));
            calificaciones2.add(new Calificaciones("Programacion", 100));
            calificaciones2.add(new Calificaciones("Calculo", 85));

            calificaciones3.add(new Calificaciones("Matematicas", 50));
            calificaciones3.add(new Calificaciones("Fisica", 60));
            calificaciones3.add(new Calificaciones("Historia", 90));
            calificaciones3.add(new Calificaciones("Geografia", 70));
            calificaciones3.add(new Calificaciones("Biologia", 60));
            calificaciones3.add(new Calificaciones("Programacion", 70));
            calificaciones3.add(new Calificaciones("Calculo", 60));

            //Calculo de promedio 1
            for(Calificaciones c1: calificaciones1) {
                n1 = n1 + c1.getCalificacion();
            }
            promedio1 = n1/calificaciones1.size();

            //Calculo de promedio 2
            for(Calificaciones c2: calificaciones2) {
                n2 = n2 + c2.getCalificacion();
            }
            promedio2 = n2/calificaciones2.size();

            //Calculo de calificaciones 3
            for(Calificaciones c3: calificaciones3) {
                n3 = n3 + c3.getCalificacion();
            }
            promedio3 = n3/calificaciones3.size();

            //3 instancias de alumnos
            alumno1 = new Alumno("Hector", promedio1, "1272124", calificaciones1);
            alumno2 = new Alumno("Arturo", promedio2, "1787672", calificaciones2);
            alumno3 = new Alumno("Fernando", promedio3, "1345892", calificaciones3);

            //Impresion alumno 1
            System.out.println("\nAlumno 1");
            System.out.println("\n\nNombre: " + alumno1.getNombre());
            System.out.println("Matricula: " + alumno1.getMatricula());
            System.out.println("Calificaciones: ");
            for(Calificaciones c: calificaciones1) {
                System.out.println("\nMateria: " + c.getMateria());
                System.out.println("Calificacion: " + c.getCalificacion());
            }
            System.out.println("\nPromedio: " + alumno1.getPromedio() + "\n");
            

            //Impresion alumno 2
            System.out.println("\nAlumno 2");
            System.out.println("\n\nNombre: " + alumno2.getNombre());
            System.out.println("Matricula: " + alumno2.getMatricula());
            System.out.println("Calificaciones: ");
            for(Calificaciones c: calificaciones2) {
                System.out.println("\nMateria: " + c.getMateria());
                System.out.println("Calificacion: " + c.getCalificacion());
            }
            System.out.println("\nPromedio: " + alumno2.getPromedio() + "\n");
            

            //Impresion alumno 3
            System.out.println("\n\nAlumno 3");
            System.out.println("\nNombre: " + alumno3.getNombre());
            System.out.println("Matricula: " + alumno3.getMatricula());
            System.out.println("Calificaciones: ");
            for(Calificaciones c: calificaciones3) {
                System.out.println("\nMateria: " + c.getMateria());
                System.out.println("Calificacion: " + c.getCalificacion());
            }
            System.out.println("\nPromedio: " + alumno3.getPromedio() + "\n");
            
        } catch (Exception e) {
            System.out.println("Se produjo un error");
        }

        //Fichero y escritura de datos
        FileOutputStream fichero = null;

        try {
            fichero = new FileOutputStream("Alumnos.txt");
            ObjectOutputStream flujo = new ObjectOutputStream(fichero);
            flujo.writeObject(alumno1);
            flujo.writeObject(alumno2);
            flujo.writeObject(alumno3);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fichero.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
}
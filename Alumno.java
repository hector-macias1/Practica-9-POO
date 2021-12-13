import java.util.ArrayList;

public class Alumno {

    //Atributos de "Alumno"
    String nombre;
    float promedio;
    String matricula;

    ArrayList<Calificaciones> calificaciones = new ArrayList<Calificaciones>();


	public Alumno(String nombre, float promedio, String matricula, ArrayList<Calificaciones> calificaciones) {
		this.nombre = nombre;
        this.promedio = promedio;
        this.matricula = matricula;
        this.calificaciones = calificaciones;
	}

    public Alumno(){
    }

    //Getters y Setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    ///////////////////////////////////////////////////
    public float getPromedio(){
        return promedio;
    }

    public void setPromedio(float promedio){
        this.promedio = promedio;
    }

    ///////////////////////////////////////////////////
    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}
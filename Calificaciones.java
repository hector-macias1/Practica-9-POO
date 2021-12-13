public class Calificaciones {
    String materia;
    float calificacion;

    public Calificaciones(String materia, float calificacion) {
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public Calificaciones(){}

    public String getMateria() {
        return materia;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
}
package AtributoStatic;

public class Classroom {
    /* atributo de instancia, depende de que exista una instancia u objeto de la clase Classroom
    es decir estara disponible en cada instancia si esta existe*/
    private String studentName;

    /*atributo de clase, estara compartida en todas las instancias de la clase,
    y no se puede modificar de forma independiente, (el nombre del colegio de un salon deberia
     ser el mismo por eso se define como estatico, puede cambiar
     por lo que no se define final para constantes)*/
    private static String schoolName = "Institucion Educativa N^1";

    public Classroom(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Classroom.schoolName = schoolName;
    }

    public void showInfo(){
        System.out.println("Nombre Estudiante: " + this.studentName + " Nombre Colegio: " + this.schoolName);
    }
}

package AtributoStatic;

public class ClassroomMain {
    public static void main(String[] args) {
        Classroom student1 = new Classroom("Carlos");
        System.out.println(student1);
        Classroom student2 = new Classroom("Natalia");
        System.out.println(student2);

        /* hago llamado a los metodos estaticos de la clase para el cambio del nombre del colegio
            que se comparte en todos las instancias de la clase.
        * */
        Classroom.setSchoolName("Promocion social N^2");

        student1.showInfo();
        student2.showInfo();
    }
}

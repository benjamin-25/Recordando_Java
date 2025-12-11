package relaciones;

public class Person {

    /*
    * Esta es una relacion de tipo Dependencia entre clases,
    * la ventaja de esta relacion es que todos los metodos que puedan ser agregados en la clase Calculator,
    * podrian ser utilizados en esta clase dentro del metodo.
    * */
    int calculateSum(Calculator calculator){
        return calculator.add(5,3);
    }
}

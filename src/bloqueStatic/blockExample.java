package bloqueStatic;

public class blockExample {
    /*
    Un bloque statico, es un bloque de codigo dentro de una clase que se ejecuta una unica vez,
    cuando la clase se carga en memoria, antes de que se cree cualquier objeto y antes de que se ejecute el main.
    por lo general se utiliza en clases de configuracion.
    **/

    static {
        System.out.println("Bloque estatico ejecutado... ");
    }

    public static void main(String[] args) {
        System.out.println("lanzando metodo main");
    }
}

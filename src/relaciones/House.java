package relaciones;

/*
* con esto pasamos clases como atributos de otra clase
* */
public class House {
    private Room room;  /* composicion, porque estas propiedades dependen de que exista una casa, si no no podrian existir,
                            se conoce como relacion fuerte */
    private Door door;  // composicion
    private Owner owner;    // asociacion, porque un propietario puede existir si no existe una casa, no es una relacion fuerte

    public House(Room room, Door door, Owner owner) {
        this.room = room;
        this.door = door;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "room=" + room +
                ", door=" + door +
                ", owner=" + owner +
                '}';
    }
}

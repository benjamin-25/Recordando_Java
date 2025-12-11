package House;

public class HouseMain {
    public static void main(String[] args) {
        House casa = new House();
        casa.setDoors(2);
        casa.setWindows(4);
        casa.setFloors(2);

        House casa2 = new House(2,5,4);
        System.out.println(casa2);
    }
}

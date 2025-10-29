package House;

public class House {

    private int doors;
    private int windows;
    private int floors;

    House(int doors, int windows, int floors){
        this.doors = doors;
        this.windows = windows;
        this.floors= floors;
    }

    House(){}

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void encenderLuz(){
        System.out.println("Luz encendida");
    }
}

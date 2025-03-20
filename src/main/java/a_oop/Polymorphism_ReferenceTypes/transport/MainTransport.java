package a_oop.Polymorphism_ReferenceTypes.transport;

public class MainTransport {
    public static void main(String[] args) {
        CarNew carNew = new CarNew(120, 5);
        Boat boat = new Boat(50, 20);
        Airplane airplane = new Airplane(900, 180);

        TransportNew[] array = {carNew, boat, airplane};
        Repairable [] array2 = {carNew, boat};

        for (TransportNew move : array){
            move.move();
        }
        for (Repairable move : array2){
            move.repair();
        }
    }
}

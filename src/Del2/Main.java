package Del2;

public class Main {
    public static void main(String[] args) {
        PaintJob stue = new PaintJob("Stue");

        //Tilføj overflader (Rectangle og Triangle)
        stue.addSurface(new Rectangle(5, 3)); // væg 1
        stue.addSurface(new Rectangle(4, 3)); // væg 2
        stue.addSurface(new Triangle(3, 4, 5)); // loft

        //Tilføj fradrag (fx dør og vindue)
        stue.addDeduction(new Rectangle(1, 2)); // dør
        stue.addDeduction(new Circle(0.5));     // rundt vindue

        //Print oversigt
        stue.printSummary();
    }
}

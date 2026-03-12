package Del2;

import java.util.ArrayList;

public class PaintJob {
    private String name;
    private ArrayList<Shape> surfaces;
    private ArrayList<Shape> deductions;

    public PaintJob(String name) {
        this.name = name;
        this.surfaces = new ArrayList<>();
        this.deductions = new ArrayList<>();
    }

    //Tilføj overflade
    public void addSurface(Shape s) {
        surfaces.add(s);
    }

    //Tilføj fradrag
    public void addDeduction(Shape s) {
        deductions.add(s);
    }

    //Summer areal af overflader
    public double getTotalSurface() {
        double total = 0;
        for (Shape s : surfaces) {
            total += s.getArea();
        }
        return total;
    }

    //Summer areal af fradrag
    public double getTotalDeductions() {
        double total = 0;
        for (Shape s : deductions) {
            total += s.getArea();
        }
        return total;
    }

    //Malbart areal
    public double getPaintableArea() {
        return getTotalSurface() - getTotalDeductions();
    }

    //Udskriv oversigt
    public void printSummary() {
        System.out.println("=== Malerberegner: " + name + " ===");
        System.out.printf("Skal males: %.2f m²%n", getPaintableArea());
    }
}

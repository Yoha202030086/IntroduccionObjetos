package src;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double lado1, lado2;
        System.out.println("Ingresar un lado:");
        lado1 = ent.nextDouble();
        System.out.println("Ingresar otro lado:");
        lado2 = ent.nextDouble();
        Rectangulo rec = new Rectangulo(lado1, lado2);
        System.out.println("Area es: " + rec.getArea());
        System.out.println("Perimetro es: " + rec.getPerimetro());

    }

    private double lado1;
    private double lado2;
    private double area;
    private double perimetro;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        if (lado1 == lado2) {
            System.out.println("Lados iguales");
        }

    }

    public double getArea() {
        area = lado1 * lado2;
        return area;
    }

    public double getPerimetro() {
        perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

}

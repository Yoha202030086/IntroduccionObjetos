package src;

import java.util.Scanner;

public class cuadrado {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int lado1;
        System.out.println("Ingresar un lado para calcular el area y perimetro de un cuadrado;");
        lado1 = ent.nextInt();
        cuadrado c = new cuadrado(lado1);
        System.out.println("Area del cuadrado: " + c.getArea());
        System.out.println("Perimetro del cuadrado: " + c.getPerimetro());

    }

    private int lado1;
    private int area;
    private int perimetro;

    public cuadrado(int lado1) {
        this.lado1 = lado1;

    }

    public int getArea() {
        area = this.lado1 * this.lado1;
        return area;
    }

    public int getPerimetro() {
        perimetro = 4 * this.lado1;
        return perimetro;
    }

}
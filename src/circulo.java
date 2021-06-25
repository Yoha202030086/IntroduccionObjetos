package src;

import java.util.Scanner;

public class circulo {

    Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double radio;
        System.out.println("Ingresar radio");
        radio = ent.nextInt();
        circulo cir1 = new circulo(radio);
        System.out.println("Resultado del area: " + cir1.getArea());
        System.out.println("Resultado del perimetro: " + cir1.getPerimetri());

    }

    private double radio1;
    private double area;
    private double perimetro;

    public circulo(double radio1) {
        this.radio1 = radio1;
    }

    public double getArea() {
        area = Math.PI * radio1 * radio1;
        return area;

    }

    public double getPerimetri() {
        perimetro = 2 * Math.PI * radio1;
        return perimetro;

    }

}

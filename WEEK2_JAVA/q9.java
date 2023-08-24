//write a program that generates a random integer base (b),height (h) and a side (a) for a
//parallelogram in the range 10 to 30, inclusive and then computes the area and perimeter of the
//parallelogram .
//Area = base * height
//Perimeter = 2*(a+b)

import java.util.Random;

class Parallelogram {
    int base;
    int height;
    int side;

    public Parallelogram() {
        Random rand = new Random();
        base = rand.nextInt(21) + 10;  // Range: 10 to 30
        height = rand.nextInt(21) + 10;
        side = rand.nextInt(21) + 10;
    }

    public int calculateArea() {
        return base * height;
    }

    public int calculatePerimeter() {
        return 2 * (side + base);
    }
}

public class q9 {
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram();

        System.out.println("Generated values:");
        System.out.println("Base: " + parallelogram.base);
        System.out.println("Height: " + parallelogram.height);
        System.out.println("Side: " + parallelogram.side);

        int area = parallelogram.calculateArea();
        int perimeter = parallelogram.calculatePerimeter();

        System.out.println("\nArea of the parallelogram: " + area);
        System.out.println("Perimeter of the parallelogram: " + perimeter);
    }
}


public class Circles {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        c1.setRadius(2.2);
        System.out.println("после: " + c1);
        System.out.println("радиус: " + c1.getRadius());

        System.out.printf("площадь: %.2f%n", c1.area());
        System.out.printf("окружность: %.2f%n", c1.circumference());
    }
}

// вспомогательный
class Circle {
    private double rad;

    public Circle() {
        this.rad = 1.0;
    }

    public Circle(double initial) {
        this.rad = initial;
    }

    public double getRadius() {
        return rad;
    }

    public void setRadius(double newRadius) {
        this.rad = newRadius;
    }

    public double area() {
        return Math.PI * rad * rad;
    }

    public double circumference() {
        return 2 * Math.PI * rad;
    }

    @Override
    public String toString() {
        return String.format("Circle{r=%.2f}", rad);
    }
}

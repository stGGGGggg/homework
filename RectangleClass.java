public class RectangleClass{
    public static void main(String[] args) {
        // проверка конструкторов и toString()
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);

        Rectangle r2 = new Rectangle();
        System.out.println(r2);

        // проверка сеттеров и геттеров
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);

        System.out.println("длина: " + r1.getLength());
        System.out.println("высота: " + r1.getWidth());

        // проверка методов площади и периметра
        System.out.printf("площадь: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }
}

// вспомогательный класс
class Rectangle {
    private float len;
    private float wid;

    // конструктор по умолчанию
    public Rectangle() {
        this.len = 1.0f;
        this.wid = 1.0f;
    }

    // конструктор с параметрами
    public Rectangle(float length, float width) {
        this.len = length;
        this.wid = width;
    }

    // геттеры
    public float getLength() {
        return len;
    }

    public float getWidth() {
        return wid;
    }

    // сеттеры
    public void setLength(float newLength) {
        this.len = newLength;
    }

    public void setWidth(float newWidth) {
        this.wid = newWidth;
    }

    // площадь
    public float getArea() {
        return len * wid;
    }

    // периметр
    public float getPerimeter() {
        return 2 * (len + wid);
    }

    @Override
    public String toString() {
        return String.format("Rectangle[length=%.1f,width=%.1f]", len, wid);
    }
}

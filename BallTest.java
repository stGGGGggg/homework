public class BallTest {
    public static void main(String[] args) {
        // Конструктор через полярные координаты (скорость + направление)
        Ball ball = new Ball(1.1f, 2.2f, 10, 5, 45); // speed=5, direction=45°
        System.out.println(ball);

        // Проверка сеттеров и геттеров
        ball.setX(80.0f);
        ball.setY(35.0f);
        ball.setRadius(5);
        ball.setXDelta(4.0f);
        ball.setYDelta(6.0f);
        System.out.println(ball);
        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("radius is: " + ball.getRadius());
        System.out.println("xDelta is: " + ball.getXDelta());
        System.out.println("yDelta is: " + ball.getYDelta());

        // Bounce the ball within boundaries
        float xMin = 0.0f, xMax = 100.0f, yMin = 0.0f, yMax = 50.0f;
        for (int i = 0; i < 15; i++) {
            ball.move();
            System.out.println(ball);
            float xNew = ball.getX();
            float yNew = ball.getY();
            int radius = ball.getRadius();
            if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
                ball.reflectHorizontal();
            }
            if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
                ball.reflectVertical();
            }
        }
    }
}

class Ball {
    private float x, y;      // координаты центра
    private int radius;      // радиус
    private float xDelta;    // скорость по X
    private float yDelta;    // скорость по Y

    // Конструктор через delta-x и delta-y
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // Новый конструктор: через скорость и направление (полярные координаты)
    public Ball(float x, float y, int radius, int speed, int directionInDegree) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        double rad = Math.toRadians(directionInDegree);
        this.xDelta = (float) (speed * Math.cos(rad));
        this.yDelta = (float) (speed * Math.sin(rad));
    }

    // Геттеры
    public float getX() { return x; }
    public float getY() { return y; }
    public int getRadius() { return radius; }
    public float getXDelta() { return xDelta; }
    public float getYDelta() { return yDelta; }

    // Сеттеры
    public void setX(float x) { this.x = x; }
    public void setY(float y) { this.y = y; }
    public void setRadius(int radius) { this.radius = radius; }
    public void setXDelta(float xDelta) { this.xDelta = xDelta; }
    public void setYDelta(float yDelta) { this.yDelta = yDelta; }

    // Двигаем мяч на один шаг
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Отражение по горизонтали
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // Отражение по вертикали
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return String.format("Ball[(%.1f,%.1f),speed=(%.1f,%.1f)]", x, y, xDelta, yDelta);
    }
}

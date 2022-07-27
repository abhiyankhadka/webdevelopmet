class Rectangle {
    double l;
    double b;
    Rectangle() {
    l = 1.0;
    b = 1.0;
    }
    Rectangle(double l, double b) {
    this.l = l;
    this.b = b;
    }
    double getVolume() {
    return l * b;
    }
    }
    public class ques {
    public static void main(String args[]) {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(1, 2);
    System.out.println(r1.getVolume());
    System.out.println(r2.getVolume());
    }
    }
package Day5.EX6_8;

public class Main {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(11, 10, 2003, 2264, 88);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
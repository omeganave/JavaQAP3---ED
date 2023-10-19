package Problem3;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1.0f, 2.0f);
        System.out.println(p);
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(Arrays.toString(p.getXY()));

        MovablePoint mp = new MovablePoint();
        System.out.println(mp);
        System.out.println(Arrays.toString(mp.getSpeed()));
        mp.move();
        System.out.println(mp);

        MovablePoint mp2 = new MovablePoint(1.0f, 3.0f);
        System.out.println(mp2);
        mp2.move();
        System.out.println(mp2);

        MovablePoint mp3 = new MovablePoint(2.0f, 4.0f, 4.3f, 5.1f);
        System.out.println(mp3);
        mp3.move(2);
        System.out.println(mp3);
    }
}

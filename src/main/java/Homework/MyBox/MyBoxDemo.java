package Homework.MyBox;

public class MyBoxDemo {
    public static void main(String[] args) {
        MyBox box1 = new MyBox(10,10,10);
        System.out.println("Volume is = "+ box1.getVolume());
        System.out.println();
        MyBox box2 = new MyBox(10,10);
        System.out.println("Volume is = "+ box2.getVolume());
        System.out.println();
        MyBox box3 = new MyBox(10);
        System.out.println("Volume is = "+ box3.getVolume());
        System.out.println();
        MyBox box4 = new MyBox();
        System.out.println("Volume is = "+ box4.getVolume());
    }
}

package Homework.MyBox;

public class MyBox {
    int width;
    int height;
    int depth;
     public MyBox () {
        width = 10;
        height = 10;
        depth = 10;
        print();
    }
    public MyBox(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        print();
    }

    public MyBox(int width, int height) {
        this.width = width;
        this.height = height;
        depth = 10;
        print();
    }

    public MyBox(int width) {
        this.width = width;
        height= 10;
        depth = 10;
        print();
    }
    int getVolume () {
        return width*height*depth;
    }
    public void print () {
        System.out.println("width=" + width + ", height=" + height + ",depth=" + depth);
    }
}

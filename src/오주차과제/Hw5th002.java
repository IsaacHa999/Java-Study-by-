package 오주차과제;

class Point{
    private int x,y;
    public Point(int x, int y) {this.x =x; this.y = y;}
    public int getX() {return x;}
    public int getY() {return y;}
    protected  void move(int x, int y) {this.x =x; this.y =y;}

}
class ColorPoint extends Point{
    String color;
    int X = getX();
    int Y = getY();
    ColorPoint(int x, int y, String color) {
        super(x,y);
        this.color = color;
    }
    public void setXY(int X, int Y) {this.X = X; this.Y=Y;}
    public void setColor(String color) {this.color = color;}

    public String toString() {return "Red색의(";}   // 모르겠다...........
}


public class Hw5th002 {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5,5,"Yellow");
        cp.setXY(10,20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
}

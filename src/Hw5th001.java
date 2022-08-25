class SharpPencil{
    int width, amount;


    SharpPencil(int width, int amount){
        this.width = width; this.amount = amount;

    }
    public int getAmount() {return this.amount;}
    public void setAmount(int amount) {this.amount = amount;}

}
class Ballpen extends SharpPencil{
    String color;
    Ballpen(int width, int amount, String color) {
        super(width, amount);
        this.color = color;
    }
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
}

class FountainPen extends Ballpen{

    FountainPen(int width, int amount, String color) {
        super(width, amount, color);
    }
    public void refill(int n) {amount = n;} //남은량 보충
}



public class Hw5th001 {
    public static void main(String[] args) {
        SharpPencil p = new SharpPencil(5,5);
        Ballpen p2 = new Ballpen(20,10, "blue");
        FountainPen p3 =new FountainPen(40, 50, "Red");

        System.out.println(p.getAmount()); //
        System.out.println(p2.getAmount()); //
        p.setAmount(30);
        System.out.println(p.getAmount()); //
        System.out.println(p2.getColor()); //


    }
}

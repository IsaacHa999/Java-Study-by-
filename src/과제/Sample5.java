package 과제;

public class Sample5 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String b = a.replaceAll(":", "#");
        System.out.println(b);  // a#b#c#d 출력
    }
}
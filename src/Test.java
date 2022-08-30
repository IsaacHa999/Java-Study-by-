class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
    public String getFood() {
        return "apple";
    }
}

class lion extends Animal implements Predator {
    public String getFood() {
        return "banana";
    }
}

class Zookeeper {
    public void feed(Predator predator) {
        System.out.println(predator.getFood());
    }
}

public class Test {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        zookeeper.feed(tiger);
    }
}

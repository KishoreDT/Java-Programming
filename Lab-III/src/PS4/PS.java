package PS4;

class Animal {
    public void move() {
       System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    public void move() {
       System.out.println("Dogs can walk and run");
    }
}

class Puppy extends Dog {
    public void move() {
       System.out.println("Puppy can move.");
    }
}

public class PS {
    public static void main(String args[]) {
       Animal a = new Animal();
       Animal b = new Puppy();
       a.move();
       b.move();
    }
}
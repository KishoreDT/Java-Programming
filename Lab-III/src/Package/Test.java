package Package;

class Add {
    int c;
    Add(int a,int b){
        c=a+b;
    }
    public void display() {
        System.out.println("Addition Answer : "+c);
    }
}

class Sub {
    int c;
    Sub(int a,int b){
        c=a-b;
    }
    public void display() {
        System.out.println("Subtraction Answer : "+c);
    }
}

class Mul {
    int c;
    Mul(int a,int b){
        c=a*b;
    }
    public void display() {
        System.out.println("Multiplication Answer : "+c);
    }
}

class Div {
    int c;
    Div(int a,int b){
        c=a/b;
    }
    public void display() {
        System.out.println("Division Answer : "+c);
    }
}

public class Test {

    public static void Add(int a, int b) {
    }
    
}
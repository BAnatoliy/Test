public class Main {
    public static void main(String[] args) {
        String b = "Hello Bro!!";
        SayHello sayHello = new SayHello(b);
        sayHello.sayHello(b);
        System.out.println(sayHello.a);

    }
}

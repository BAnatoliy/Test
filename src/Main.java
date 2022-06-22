public class Main {
    public static void main(String[] args) {
        String b = "Hello Bro!!";
        String c;
        c = "Hello Man yo!!";
        SayHello sayHello = new SayHello(b);
        sayHello.sayHello(c);
        System.out.println(sayHello.a);

    }
}

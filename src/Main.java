public class Main {
    public static void main(String[] args) {
        String b = "Hello Bro!!";
        String c = "Hello Man!!";
        c = "Hello Man yo!!"; // TODO: hjhgjgj
        SayHello sayHello = new SayHello(b);
        sayHello.sayHello(c);
        System.out.println(sayHello.a);

    }
}

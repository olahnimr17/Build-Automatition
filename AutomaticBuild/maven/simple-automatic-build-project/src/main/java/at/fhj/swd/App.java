package at.fhj.swd;

/**
 * Created by Michael Ulm 05.05.2017
 */
public class App {

    public static void main(String[] args)
    {
        App hello = new App();
        int number = hello.sayHello(args[0]);
        // System.out.println("Anzahl der ausgegebenen Zeichen: " + number);
    }

    public int sayHello(String name)
    {
        String msg = "Hello " + name + "!";
        System.out.println(msg);
        return msg.length();
    }
}

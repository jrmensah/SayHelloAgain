import java.util.Scanner;
public class SayHelloAgain {


    public static void main (String args[])
    {

        String name= "name";
        System.out.println("What is your name?");
        Scanner keyboard = new Scanner(System.in);
        name= keyboard.nextLine();

        System.out.println(helloName(name));
        System.out.println(helloFrench(name));
        System.out.println(helloTwi(name));
        System.out.println(helloAfaa(name));

    }

    public static String helloName(String name)
    {
        return "Hello," +name+ "!";
    }
    public static String helloFrench(String name)
    {
        return "Bonjour," +name+ "!";
    }

    public static String helloTwi(String name)
    {
        return "Mahai," +name+ "!";
    }

    public static String helloAfaa(String name)
    {
        return "Akam," +name+ "!";
    }

    }


public class Greeting {

    public String getGreeting(String name) {
        // Bug: Missing null check for the name parameter
        return "Hello, " + name.toUpperCase() + "!";
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        System.out.println(greeting.getGreeting(null)); // This will cause a NullPointerException
    }
}

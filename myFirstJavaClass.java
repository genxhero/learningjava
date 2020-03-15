public class myFirstJavaClass {
    public static void main (String arg) {
        assbutt(arg);
    }

    public static void assbutt (String name) {
        String output = String.format("Hello, %s!", name);
        System.out.println(output);
    }
}
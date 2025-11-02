public class StringOps {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(0,5));
        System.out.println(s.replace("World","Java"));
        System.out.println(s.contains("Hello"));
        System.out.println(s.startsWith("He"));
        System.out.println(s.endsWith("!"));
        System.out.println(s.trim());
    }
}
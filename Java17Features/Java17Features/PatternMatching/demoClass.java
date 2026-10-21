package Java17Features.PatternMatching;

public class demoClass {
    public static void main(String[] args) {
        Object obj = "Hello, World!";

        String result = switch (obj) {
            case String s when(s.length()>5) -> "Long String: " +s;
            case String s -> "Short String: " + s;
            case Integer i -> "Integer: "+i;
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}

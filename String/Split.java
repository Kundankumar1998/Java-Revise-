public class Split{
    public static void main(String[] args) {
        String str = "Hello, World!";
        String[] parts = str.split(", ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
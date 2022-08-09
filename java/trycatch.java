public class trycatch {
    public static void main(String[] args) {
        String s[] = { "cat", "dog", "ant" };
        try {
            System.out.println(s[5]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Next part of code..... :)");
    }
}

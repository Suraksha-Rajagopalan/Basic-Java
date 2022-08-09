public class StringMethods {
    public static void main(String[] args)
    {
        String a = "Hello";
        String b = "Welcome";
        String c = "Goodbye";
        System.out.println(a+b+c);
        System.out.println(a.charAt(3));
        System.out.println(a.contains("He"));
        System.out.println(b.contains("ne"));
        System.out.println(c.endsWith("ye"));
        System.out.println(c.endsWith("bb"));
        System.out.println(a.length());
        System.out.println(b.toLowerCase());
        System.out.println(c.toUpperCase());
        System.out.println(a.indexOf("l"));
        System.out.println(b.indexOf("ee"));
    }
    
}

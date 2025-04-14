public class Main {
    public static void main(String[] args) {
        Sign a = new Sign("hi how r u", 12);
        System.out.println(a.numberOfLines());
        System.out.println(a.getLines());
        Sign b = new Sign("1234567890", 3);
        System.out.println(b.numberOfLines());
        System.out.println(b.getLines());
        Sign c = new Sign("", 3);
        System.out.println(c.numberOfLines());
        System.out.println(c.getLines());
    }
}
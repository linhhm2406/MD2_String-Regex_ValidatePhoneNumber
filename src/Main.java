public class Main {
    public static void main(String[] args) {
        ValidateNumber vn = new ValidateNumber();

        String test1 = "(84)-(0978489648)";
        String test2 = "(a8)-(22222222)";

        System.out.println(vn.validateNumber(test1));
        System.out.println(vn.validateNumber(test2));
    }
}

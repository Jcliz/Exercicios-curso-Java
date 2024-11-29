public class DesafioAritmetico {
    public static void main(String[] args) {
        double a = (6 * (3 + 2));
        a = Math.pow(a, 2);
        a = a / 6;

        double b = (double) ((1 - 5) * (2 - 7)) / 2;
        b = Math.pow(b, 2);

        double ab = a - b;
        ab = Math.pow(ab, 3);

        double c = 10;
        c = Math.pow(c, 3);

        double total = ab / c;

        System.out.println(total);
    }
}
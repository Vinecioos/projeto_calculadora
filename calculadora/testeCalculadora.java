package calculadora;

public class testeCalculadora {

    public static void main(String[] args) {

        calculadora calc = new calculadora();

        // Testes rápidos
        System.out.println(calc.calc(2, 3, "+"));
        System.out.println(calc.calc(2, 3, "-"));
        System.out.println(calc.calc(2, 3, "*"));
        System.out.println(calc.calc(2, 3, "/"));

        try {
            System.out.println(calc.calc(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calc(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
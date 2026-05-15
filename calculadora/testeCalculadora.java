package calculadora;

/**
 * Classe responsável por testar as funcionalidades
 * da calculadora por meio de diferentes operações.
 */
public class testeCalculadora {

    /**
     * Método principal responsável pela execução do programa.
     * Realiza testes de operações válidas e tratamento de exceções.
     *
     * @param args Argumentos recebidos pela linha de comando
     */
    public static void main(String[] args){

        // Cria um objeto da classe calculadora
        calculadora calc = new calculadora();

        // Testes rápidos das operações válidas
        System.out.println(calc.calc(2, 3, "+"));
        System.out.println(calc.calc(2, 3, "-"));
        System.out.println(calc.calc(2, 3, "*"));
        System.out.println(calc.calc(2, 3, "/"));

        try {
            // Teste de divisão por zero
            System.out.println(calc.calc(8, 0, "/"));

        } catch(IllegalArgumentException e) {

            // Exibe mensagem da exceção
            System.out.println(e.getMessage());
        }

        try {
            // Teste de operador inválido
            System.out.println(calc.calc(5, 5, "x"));

        } catch(IllegalArgumentException e) {

            // Exibe mensagem da exceção
            System.out.println(e.getMessage());
        }
    }
}
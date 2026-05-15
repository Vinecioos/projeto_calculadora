package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 * Permite executar soma, subtração, multiplicação e divisão.
 */
public class calculadora {

    /**
     * Armazena o resultado da operação matemática realizada.
     */
    public int r = 0;

    /**
     * Realiza uma operação matemática entre dois números.
     *
     * @param a Primeiro número da operação
     * @param b Segundo número da operação
     * @param op Operador matemático a ser utilizado (+, -, *, /)
     * @return Resultado da operação matemática
     * @throws IllegalArgumentException Caso o operador seja inválido
     * ou ocorra divisão por zero
     */
    public int calc(int a, int b, String op){

        // Verifica se a operação é soma
        if(op.equals("+")){
            r = a + b;

        // Verifica se a operação é subtração
        } else if(op.equals("-")){
            r = a - b;

        // Verifica se a operação é multiplicação
        } else if(op.equals("*")){
            r = a * b;

        // Verifica se a operação é divisão
        } else if(op.equals("/")){

            // Verifica se o divisor é diferente de zero
            if(b != 0){
                r = a / b;

            } else {
                // Lança exceção para divisão por zero
                throw new IllegalArgumentException(
                    "ERRO: Divisão por zero, operação irregular"
                );
            }

        } else {
            // Lança exceção caso operador seja inválido
            throw new IllegalArgumentException(
                "Operação inválida"
            );
        }

        // Exibe o resultado da operação
        System.out.println("Resultado = " + r);

        // Retorna o valor calculado
        return r;
    }
}
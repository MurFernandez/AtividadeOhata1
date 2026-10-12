package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("--- INICIANDO TESTES ---\n");

        // Testando as operações matemáticas
        testar(calc, 15, 5, "+", "20");
        testar(calc, 10, 7, "-", "3");
        testar(calc, 4, 5, "*", "20");
        testar(calc, 20, 4, "/", "5.0");

        // Testando as regras de erro
        testar(calc, 10, 0, "/", "Erro: Não é possível dividir por zero.");
        testar(calc, 10, 5, "%", "Erro: Operação inválida.");
    }

    // Método auxiliar criado para não ter que repetir os "System.out.println" toda hora
    private static void testar(Calculadora calc, int a, int b, String op, String esperado) {
        String resultado = calc.calc(a, b, op);
        
        System.out.println("Conta    : " + a + " " + op + " " + b);
        System.out.println("Esperado : " + esperado);
        System.out.println("Obtido   : " + resultado);
        
        // Verifica se o resultado bate com o que a gente esperava
        if (resultado.equals(esperado)) {
            System.out.println("Status   : [OK!]\n");
        } else {
            System.out.println("Status   : [ERRO!]\n");
        }
    }
}
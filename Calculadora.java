package calculadora;

public class Calculadora {

    // Método principal: olha o operador e chama a função correta
    public String calc(int a, int b, String op) {
        switch (op) {
            case "+": 
                return somar(a, b);
            case "-": 
                return subtrair(a, b);
            case "*": 
                return multiplicar(a, b);
            case "/": 
                return dividir(a, b);
            default: 
                return "Erro: Operação inválida.";
        }
    }

    // --- MÉTODOS EXTRAÍDOS (Refatoração) ---

    private String somar(int a, int b) {
        return String.valueOf(a + b);
    }

    private String subtrair(int a, int b) {
        return String.valueOf(a - b);
    }

    private String multiplicar(int a, int b) {
        return String.valueOf(a * b);
    }

    private String dividir(int a, int b) {
        // Regra: Impedir divisão por zero
        if (b == 0) {
            return "Erro: Não é possível dividir por zero.";
        }
        // Calcula a divisão usando double para ter casas decimais
        return String.valueOf((double) a / b);
    }
}
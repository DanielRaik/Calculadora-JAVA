package calculadora;

public class Calculadora {

    // lógica simples de calculo
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b; 
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        } // tratamento de erro caso o usuario coloque a segunda opção como "0"
        return a / b;
    }
}

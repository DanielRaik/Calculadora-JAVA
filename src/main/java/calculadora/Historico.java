package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<String> operacoes = new ArrayList<>();

    public void adicionar(String operacao) {
        operacoes.add(operacao);
    }

    public void mostrar() {
        if (operacoes.isEmpty()) {
            System.out.println("Histórico vazio.");
            return;
        }

        System.out.println("\n=== Histórico ===");
        for (String op : operacoes) {
            System.out.println(op);
        } // print no console de todos os calculos feitos
    }
    public void limpar() {
        operacoes.clear();
        System.out.println("Histórico limpo com sucesso.");
    } // exclui os daados do histórico da calculadora
}
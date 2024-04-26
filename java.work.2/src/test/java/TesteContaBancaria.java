public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        try {
            conta.depositar(500.0);
            conta.sacar(700.0);
            conta.sacar(1000.0); // Esse saque irá lançar a exceção
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }
}

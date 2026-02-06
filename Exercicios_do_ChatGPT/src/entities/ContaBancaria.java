package entities;

public class ContaBancaria {
        private final int numeroConta;
        private String titular;
        private double saldo;
        private static final double TAXA_SAQUE = 5.00;

        public ContaBancaria(int numeroConta, String titular, double depositoInicial) {
            this.numeroConta = numeroConta;
            this.titular = titular;
            this.saldo = depositoInicial;
        }

        public ContaBancaria(int numeroConta, String titular) {
            this(numeroConta, titular, 0.0);
        }

        public int getNumeroConta() {
            return numeroConta;
        }

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double valor) {
            saldo += valor;
        }

        public void sacar(double valor) {
            saldo -= (valor + TAXA_SAQUE);
        }

        public String toString() {
            return "Conta Bancária:\n" +
                    "Número da conta: " + numeroConta + "\n" +
                    "Titular: " + titular + "\n" +
                    "Saldo: " + saldo;
        }
}

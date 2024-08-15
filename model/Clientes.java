package model;

public class Clientes
{
    private String nomeCliente;
    private String agencia;
    private int numero;
    private double saldo;

    public int getNumero() {    return numero;  }
    public double getSaldo() {  return saldo;   }
    public String getAgencia() {    return agencia;   }
    public String getNomeCliente() {    return nomeCliente; }

    public void setNumero(int numero) throws IllegalArgumentException{
        if (numero < 0)
            throw new IllegalArgumentException("não pode existir cliente com número de indentificação negativo.");
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null)
            throw new IllegalArgumentException("nomes não podem ser nulos");
        this.nomeCliente = nomeCliente;
    }

    public void setAgencia(String agencia) {
        if (agencia == null)
            throw new IllegalArgumentException("identificador de agencia não podem ser nulos");
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return String.format("Olá %s, obrigado por criar uma conta " +
                "em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", getNomeCliente(), getAgencia(),getNumero(), getSaldo());
    }
}

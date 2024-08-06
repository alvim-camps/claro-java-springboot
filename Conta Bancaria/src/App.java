import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner reader = new Scanner(System.in);

    System.out.print("Nome: ");
    String name = reader.nextLine();

    System.out.print("Saldo: ");
    double balance = reader.nextDouble();

    System.out.print("Número da conta: ");
    int number = reader.nextInt();

    reader.nextLine();

    System.out.print("Agência: ");
    String agency = reader.nextLine();

    Conta conta = new Conta(name, balance, number, agency);

    System.out.println("\n");
    System.out.println(
        "Olá "
            + conta.getName()
            + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + conta.getAgency()
            + ", conta "
            + conta.getNumber()
            + " e seu saldo, de R$ "
            + conta.getBalance()
            + ", já está disponível para saque");

    reader.close();
  }
}

class Conta {
  private String name;
  private double balance;
  private int number;
  private String agency;

  public Conta(String name, double balance, int number, String agency) {
    this.name = name;
    this.balance = balance;
    this.number = number;
    this.agency = agency;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getAgency() {
    return agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }
}

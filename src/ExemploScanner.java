import java.util.Scanner;

public class ExemploScanner {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite seu nome: ");
      String nome = scanner.nextLine();

      System.out.print("Digite sua Agência: ");
      String agencia = scanner.nextLine();

      System.out.print("Digite o número de sua Agência com o Dígito: ");
      int numeroAgencia = scanner.nextInt();

      System.out.print("Digite seu saldo: ");
      double saldo = scanner.nextDouble();

      System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo de " + saldo + " já está disponível para saque");
      scanner.close();
  }
}
package boletin4_4;

// @author Hallo
public class Boletin4_4 {

    public static void main(String[] args) {
        Conta conta1 = new Conta("Pedro", "0001", 1.5, 1000);
        conta1.amosar();
        conta1.ingreso(250);
        System.out.println("Saldo despois do ingreso: " + conta1.getSaldo());
        conta1.reintegro(100);
        System.out.println("Saldo despois do reintegro: " + conta1.getSaldo());

        Conta conta2 = new Conta("Juan", "0002", 1.5, 500);
        System.out.println("Saldo da conta1: " + conta1.getSaldo() + "\n Saldo da conta2: " + conta2.getSaldo());
        conta1.transferencia(conta2, 200);
        System.out.println("Saldo da conta1 despois da transferencia " + conta1.getSaldo()
                + "\nSaldo da conta2 despois da transferencia:  " + conta2.getSaldo());

    }

}

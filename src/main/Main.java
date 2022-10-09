package main;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        BankAccount Acc1 = new BankAccount(rand.nextLong(999999999));
        Acc1.deposit(500);
        System.out.println(Acc1.getBalance());
    }
}

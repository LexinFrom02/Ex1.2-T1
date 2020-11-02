public class Main {
    public static void main(String[] args) {
        int currentBalance = 2_000_000_000;
        int transferAmound = 500_000_000;
        int balanceAfterTransfer = currentBalance + transferAmound;
        System.out.println("На счету клиента " + balanceAfterTransfer);
    }
}

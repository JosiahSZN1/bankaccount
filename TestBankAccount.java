public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount siliconValleyBank = new BankAccount();
        // System.out.println(siliconValleyBank.numberOfAccounts);
        siliconValleyBank.deposit(250000,"checking");
        siliconValleyBank.deposit(200000.25, "savings");
        System.out.println(siliconValleyBank.getCheckingBalance());
        System.out.println(siliconValleyBank.getSavingsBalance());
        System.out.println(siliconValleyBank.getTotal());

        siliconValleyBank.withdraw(100,"checking");
        siliconValleyBank.withdraw(200100.25, "savings");
        System.out.println(siliconValleyBank.getCheckingBalance());
        System.out.println(siliconValleyBank.getSavingsBalance());
        System.out.println(siliconValleyBank.getTotal());
    }
}
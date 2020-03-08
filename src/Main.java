public class Main {
    public static void main(String[] args) throws InterruptedException {
        Action action;
        Account account = new Account(1000);

        for(int i = 0; i < 100; i++){
            action = new Action(account, 10);
            action.start();
        }

        Thread.sleep(1500);
        System.out.println(account.getMoney());
    }
}

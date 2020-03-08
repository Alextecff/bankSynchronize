public class Action extends Thread {
    Account acc;
    int howMoney;

    public Action(Account acc, int howMoney) {
        this.acc = acc;
        this.howMoney = howMoney;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(System.currentTimeMillis() % 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (acc) {
            if (howMoney <= acc.getMoney()) {
                acc.setMoney(acc.getMoney() - howMoney);
            }
        }
    }
}
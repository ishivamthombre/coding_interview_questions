public class OddEven {
  private int number = 1;
  private final int MAX = 10;
  private final Object lock = new Object();

  public static void main(String[] args) {
    OddEven oddEven = new OddEven();

    Thread oddThread = new Thread(() -> oddEven.printOdd());
    Thread evenThread = new Thread(() -> oddEven.printEven());

    oddThread.start();
    evenThread.start();
  }

  private void printEven() {
    while (number <= MAX) {
      synchronized (lock) {
        if (number % 2 == 0) {
          System.out.println("Even Number : " + number);
          number++;
          lock.notifyAll();
        } else {
          try {
            lock.wait();
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      }
    }
  }

  private void printOdd() {
    while (number <= MAX) {
      synchronized (lock) {
        if (number % 2 != 0) {
          System.out.println("Odd Number : " + number);
          number++;
          lock.notifyAll();
        } else {
          try {
            lock.wait();
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      }
    }
  }
}

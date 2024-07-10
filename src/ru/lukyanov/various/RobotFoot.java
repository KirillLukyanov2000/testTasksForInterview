package ru.lukyanov.various;

public class RobotFoot implements Runnable {

    private final String name;
    private final String lock = "Lock";
    private static volatile boolean currentLeg;

    public RobotFoot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                step();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void step() throws InterruptedException {
        synchronized (lock) {
            if (!currentLeg && this.name.equals("left") || currentLeg && this.name.equals("right")) {
                System.out.println("Step by " + name);
                currentLeg = !currentLeg;
                lock.notify();
            }
            else {
                lock.wait();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new RobotFoot("left")).start();
        new Thread(new RobotFoot("right")).start();
    }

}

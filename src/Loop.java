public class Loop {
    public static void main(String[] args) {
        for (int pointer = 0; pointer < 5; pointer++) {
            try {
                Thread.sleep(3000);
                System.out.println("current position of pointer is " + pointer);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e.getMessage());
            }
        }
    }

}

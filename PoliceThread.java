package HackerChase;

// police officer counts from 10 to 1 before catching hackers
public class PoliceThread extends Thread {
    @Override
    public void run(){
        // iterate from 10 to 1
        for (int i=10; i>0; i--){
            // pause for 1 second between iterations -- mimics a real clock
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }

            // show countdown
            System.out.println(i);
        }

        // when at 0, then hackers failed to guess
        System.out.println("Game over for the hackers.");
        // exit when done
        System.exit(0);
    }
}
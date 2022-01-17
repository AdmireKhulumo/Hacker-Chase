package HackerChase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static final int MAX_PASSWORD = 999;

    public static void main(String[] args) {
        // randomly generate a password
        Random random = new Random();

        // create a vault and set the password
        Vault vault = new Vault(random.nextInt(MAX_PASSWORD));

        // create the threads
        List<Thread> threads = new ArrayList<>();
        threads.add(new AscendingThread(vault));
        threads.add(new DescendingThread(vault));
        threads.add(new PoliceThread());

        // start all threads
        for (Thread thread: threads){
            thread.start();
        }
    }
}

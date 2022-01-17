package HackerChase;

// generic hacker thread
public abstract class HackerThread extends Thread {

    // vault from main program
    protected Vault vault;

    public HackerThread(Vault vault){
        this.vault = vault;
        // set the name of the thread to the class name (from actual hacker)
        this.setName(this.getClass().getSimpleName());
        this.setPriority(Thread.MAX_PRIORITY);
    }

    @Override
    public void start(){
        // show name when starting thread
        System.out.println("Starting thread " + this.getName());
        super.start();
    }

}
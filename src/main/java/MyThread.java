import java.util.Date;

public class MyThread extends Thread {
    public void run(){
        while (true){
            Date currentData = new Date();

            System.out.println("Data " + currentData);

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();

        thread.start();
    }
}

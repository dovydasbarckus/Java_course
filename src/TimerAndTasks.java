import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerAndTasks {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task complete");
            }
        };
        timer.schedule(task, 3000);

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2024);
        date.set(Calendar.MONTH,Calendar.OCTOBER);
        date.set(Calendar.DAY_OF_MONTH,21);
        date.set(Calendar.HOUR_OF_DAY,0);
        date.set(Calendar.MINUTE,0);
        date.set(Calendar.SECOND,0);
//        timer.schedule(task, date.getTime());

        TimerTask task2 = new TimerTask() {
            int counter = 3;
            @Override
            public void run() {
                if(counter>0){
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else{
                    System.out.println("Happy new year");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task2,0, 1000);
    }

}

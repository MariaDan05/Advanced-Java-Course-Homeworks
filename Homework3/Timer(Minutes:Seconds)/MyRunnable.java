public class MyRunnable implements Runnable{
    private int currentMin;
    private int currentSec;

    public MyRunnable(int currentMin, int currentSec) {
        if(currentMin >= 0 && currentMin <= 59) {
            this.currentMin = currentMin;
        } else {
            throw new InvalidInputException("Invalid Minutes, try again");
        }
        if(currentSec >= 0 && currentSec <= 59) {
            this.currentSec = currentSec;
        } else {
            throw new InvalidInputException("Invalid Seconds, try again");
        }
    }

    @Override
    public void run() {
        while (currentMin >= 0 && currentMin <= 59 && currentSec >= 0 && currentSec <= 59) {
            PrintValidator.minutesStyle(currentMin);
            PrintValidator.secondsStyle(currentSec);
            if(currentSec-- == 0){
                currentSec = 59;
                currentMin--;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

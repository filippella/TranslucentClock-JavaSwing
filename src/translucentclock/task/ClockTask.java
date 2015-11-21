/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translucentclock.task;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Filippo-TheAppExpert
 */
public class ClockTask extends Thread {

    private final ClockListener listener;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public ClockTask(ClockListener listener) {
        this.listener = listener;
    }

    @Override
    public void run() {
        while (true) {
            Date date = new Date();
            this.listener.onClockChanged(dateFormat.format(date));
            try {
                Thread.sleep(1000L);
            } catch (Exception e) {
            }
        }
    }

    public interface ClockListener {

        void onClockChanged(String clock);
    }
}

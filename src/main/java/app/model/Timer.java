package app.model;

import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
public class Timer {


    private Long nanoTime = System.nanoTime();
    private Time time;

    public Long getTime() {
        return nanoTime;
    }

}

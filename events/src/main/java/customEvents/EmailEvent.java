package customEvents;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailEvent extends ApplicationEvent {

   
    public EmailEvent(Object source) {
        super(source);
    }
}

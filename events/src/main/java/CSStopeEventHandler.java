import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CSStopeEventHandler implements ApplicationListener<ContextStoppedEvent> {
    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("Event stopped");
    }
}

import customEvents.CustomPublisher;
import customEvents.Email;
import customEvents.EmailEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        context.start();
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        /// Let us raise a stop event.
        context.stop();

        CustomPublisher customPublisher=(CustomPublisher) context.getBean("customPublisher");
        Email email=new Email();
        email.setBody("mail body");
        email.setFromMail("shreya.bhardwaj@tothenew.com");
        email.setSubject("events exercise");

        EmailEvent emailEvent=new EmailEvent(email);
        customPublisher.publish(emailEvent);
    }
}

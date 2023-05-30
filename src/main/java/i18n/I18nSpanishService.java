package i18n;

import com.blackops.ditutorial.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
//@Service("i18nService")
public class I18nSpanishService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola yo - ES";
    }
}

package contacts;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



/**
 * Без этого класса сгенерированный war не запускается на сервере Tomcat
 * ошибка 404.
 * Но прекрасно запускается на встроенном сервере Tomcat командой java jar
 */
public class ServletInitializer extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
	}

}

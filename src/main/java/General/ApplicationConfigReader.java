package General;

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;

/**
 * Created by VenD on 8/27/2018.
 */

@Resource.Classpath("ApplicationConfig.properties")
public class ApplicationConfigReader {


    public ApplicationConfigReader() {
        PropertyLoader.newInstance().populate(this);
    }

    @Property(value = "token")
    public static String token;

    public String getToken() {
        return token;
    }

    @Property(value = "baseURL")
    public static String baseURL;

    public String getBaseURL() {
        return baseURL;
    }
}

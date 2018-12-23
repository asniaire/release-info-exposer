package com.asniaire.releaseinfoexposer.control;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@ApplicationScoped
public class ReleaseInfoExposer {

    private static final String GIT_PROPERTIES_PATH = "/git.properties";

    private final Properties properties = new Properties();

    @PostConstruct
    public void init() {
        try (InputStream inputStream = getClass().getResourceAsStream(GIT_PROPERTIES_PATH)) {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new IllegalStateException("Could not init configuration", e);
        }
    }

    @Produces
    @ReleaseProperty("")
    public String exposeReleaseProperty(InjectionPoint injectionPoint) {
        ReleaseProperty releaseProperty = injectionPoint.getAnnotated().getAnnotation(ReleaseProperty.class);
        if (releaseProperty != null) {
            return properties.getProperty(releaseProperty.value());
        }
        return null;
    }

}

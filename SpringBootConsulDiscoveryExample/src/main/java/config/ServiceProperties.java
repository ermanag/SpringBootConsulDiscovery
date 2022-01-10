package config;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "service", ignoreUnknownFields = false)
public class ServiceProperties {
}

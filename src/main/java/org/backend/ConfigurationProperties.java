package org.backend;

import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties(prefix = "minio")
public class ConfigurationProperties {
    public String endpoint;
    public String username;
    public String password;
}

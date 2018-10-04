package com.nba.draft.drafttool.client.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nba.draft.drafttool.client")
public class ClientConfig {
    public ClientConfig() {
        super();
    }
}

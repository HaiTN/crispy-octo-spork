package com.nba.draft.drafttool.client;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import com.nba.draft.drafttool.domain.PlayerResource;
import lombok.SneakyThrows;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

@Service
public class PlayerClientImpl implements PlayerClient {

    @Autowired
    RestTemplate restTemplate;

    final String ROOT_URI = "https://api.mysportsfeeds.com/v1.2/pull/nba/upcoming/active_players.json";
    private static final String PLAYERS_FILE_NAME = "players.json";

    public PlayerResource fetchPlayers() {
        ResponseEntity<PlayerResource> response = restTemplate.exchange(ROOT_URI, HttpMethod.GET, null, PlayerResource.class);
        return response.getBody();
    }

    @SneakyThrows
    public String fetchNewPlayers() {
        final ClassPathResource classPathResource = new ClassPathResource(PLAYERS_FILE_NAME);
        InputStream inputStream = classPathResource.getInputStream();
        return CharStreams.toString(new InputStreamReader(inputStream, Charsets.UTF_8));
    }

    HttpHeaders createHeaders(String username, String password) {
        return new HttpHeaders() {{
            String auth = username + ":" + password;
            byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
            String authHeader = "Basic " + new String(encodedAuth);
            set("Authorization", authHeader);
        }};
    }
}

package com.nba.draft.drafttool.client;

import com.nba.draft.drafttool.domain.ActivePlayers;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

@Service
public class PlayerClientImpl implements PlayerClient {

    @Autowired
    RestTemplate restTemplate;

    final String ROOT_URI = "https://api.mysportsfeeds.com/v1.2/pull/nba/upcoming/active_players.json";

    public String fetchPlayers() {
        ResponseEntity<String> response = restTemplate.exchange(ROOT_URI, HttpMethod.GET, null, String.class);
        return response.getBody();
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

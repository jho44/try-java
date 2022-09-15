package com.company.app;

import com.lob.api.ApiClient;
import com.lob.api.Configuration;
import com.lob.api.ApiException;

import com.lob.api.auth.*;
import com.lob.model.*;
import com.lob.api.client.*;
import io.github.cdimascio.dotenv.Dotenv;

public class Hello
{
    public static void main( String[] args )
    {
        ApiClient lobClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) lobClient.getAuthentication("basicAuth");
        Dotenv dotenv = Dotenv.configure().directory("./").ignoreIfMalformed().ignoreIfMissing().load();
        basicAuth.setUsername(dotenv.get("LOB_API_TEST_KEY"));

        LettersApi letterApiInstance = new LettersApi(lobClient);

        try {
            Letter response = letterApiInstance.get("ltr_606b87fb00c2c4a6");
        } catch (ApiException e) {
            e.printStackTrace();
        }

        System.out.println("DONE");
    }
 }

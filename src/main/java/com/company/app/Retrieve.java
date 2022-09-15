package com.company.app;

import com.lob.api.ApiClient;
import com.lob.api.ApiException;
import com.lob.api.Configuration;
import com.lob.api.auth.*;
import com.lob.model.*;
import com.lob.api.client.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Retrieve
{
    public static void main( String[] args )
    {
        ApiClient lobClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) lobClient.getAuthentication("basicAuth");

        basicAuth.setUsername("test_62291d3cc85971719264edb12016561ed19");

        // AddressesApi addressApiInstance = new AddressesApi(lobClient);

        // try {
        //     Address response = addressApiInstance.get("adr_5dbb66f90f4f0b34");
        //     // System.out.println(response);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // PostcardsApi postcardApiInstance = new PostcardsApi(lobClient);

        // try {
        //     Postcard response = postcardApiInstance.get("psc_98e2d309e1f0ea16");
        //     // System.out.println(response);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // SelfMailersApi selfMailerApiInstance = new SelfMailersApi(lobClient);

        // try {
        //     SelfMailer response = selfMailerApiInstance.get("sfm_f44e4049c6afa7ee");
        //     System.out.println(response);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        LettersApi letterApiInstance = new LettersApi(lobClient);

        try {
            Letter response = letterApiInstance.get("ltr_606b87fb00c2c4a6");
        } catch (ApiException e) {
            e.printStackTrace();
        }

        // ChecksApi checkApiInstance = new ChecksApi(lobClient);

        // try {
        //     Check response = checkApiInstance.get("chk_3959092058428187");
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // BankAccountsApi bankAccountApiInstance = new BankAccountsApi(lobClient);

        // try {
        //     BankAccount response = bankAccountApiInstance.get("bank_65790c05a5d541b");
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        System.out.println("DONE");
    }
 }

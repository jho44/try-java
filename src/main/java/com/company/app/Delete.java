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

public class Delete
{
    public static void main( String[] args )
    {
        ApiClient lobClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) lobClient.getAuthentication("basicAuth");

        basicAuth.setUsername("test_62291d3cc85971719264edb12016561ed19");

        // AddressesApi apiInstance = new AddressesApi(lobClient);

        // try {
        //     AddressDeletion address = apiInstance.delete("adr_43769b47aed248c2");
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // PostcardsApi apiInstance = new PostcardsApi(lobClient);

        // try {
        //     PostcardDeletion address = apiInstance.cancel("psc_98e2d309e1f0ea16");
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // SelfMailersApi apiInstance = new SelfMailersApi(lobClient);

        // try {
        //     SelfMailerDeletion address = apiInstance.delete("sfm_8ffbe811dea49dcf");
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // LettersApi apiInstance = new LettersApi(lobClient);

        // try {
        //     LetterDeletion address = apiInstance.cancel("ltr_4868c3b754655f90");
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // ChecksApi apiInstance = new ChecksApi(lobClient);

        // try {
        //     CheckDeletion address = apiInstance.cancel("chk_534f10783683daa0");
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        BankAccountsApi apiInstance = new BankAccountsApi(lobClient);

        try {
            BankAccountDeletion address = apiInstance.delete("bank_3e64d9904356b20");
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
 }

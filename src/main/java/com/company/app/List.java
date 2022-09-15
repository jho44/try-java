package com.company.app;

import com.lob.api.ApiClient;
import com.lob.api.ApiException;
import com.lob.api.Configuration;
import com.lob.api.auth.*;
import com.lob.model.*;
import com.lob.api.client.*;

import java.util.HashMap;
import java.util.Map;

public class List
{
    public static void main( String[] args )
    {
        ApiClient lobClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) lobClient.getAuthentication("basicAuth");

        basicAuth.setUsername("test_62291d3cc85971719264edb12016561ed19");

        // AddressesApi apiInstance = new AddressesApi(lobClient);

        // try {
        // AddressList response = apiInstance.list(
        //     2, // limit
        //     null, // before
        //     null, // after
        //     null, // include
        //     null, // dateCreated
        //     null // metadata
        // );
        // } catch (ApiException e) {
        // e.printStackTrace();
        // }

        // PostcardsApi apiInstance = new PostcardsApi(lobClient);

        // try {
        // PostcardList response = apiInstance.list(
        //     2, // limit
        //     null, // before
        //     null, // after
        //     null, // include
        //     null, // dateCreated
        //     null, // metadata
        //     null, // size
        //     null, // scheduled
        //     null, // sendDate
        //     null, // mailType
        //     null // sortBy
        // );
        // } catch (ApiException e) {
        // e.printStackTrace();
        // }

BankAccountsApi apiInstance = new BankAccountsApi(lobClient);

try {
  BankAccountList response = apiInstance.list(
    2, // limit
    null, // before
    null, // after
    null, // include
    null, // dateCreated
    null // metadata
  );
} catch (ApiException e) {
  e.printStackTrace();
}

        System.out.println("DONE");
    }
 }

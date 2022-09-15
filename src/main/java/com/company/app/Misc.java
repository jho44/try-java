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

public class Misc
{
    public static void main( String[] args )
    {
        ApiClient config = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) config.getAuthentication("basicAuth");

        basicAuth.setUsername("test_62291d3cc85971719264edb12016561ed19");

        // BankAccountVerify verification = new BankAccountVerify();
        // verification.addAmountsItem(25);
        // verification.addAmountsItem(63);

        // BankAccountsApi apiInstance = new BankAccountsApi(lobClient);

        // try {
        //     apiInstance.verify("bank_71113a1488cfa38", verification);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // MultipleComponentsList bulkVerify = new MultipleComponentsList();
        // MultipleComponents bulkAddress0 = new MultipleComponents();
        // bulkAddress0.setPrimaryLine("210 King Street");
        // bulkAddress0.setCity("San Francisco");
        // bulkAddress0.setState("CA");
        // bulkAddress0.setZipCode("94017");
        // bulkVerify.addAddressesItem(bulkAddress0);

        // MultipleComponents bulkAddress1 = new MultipleComponents();
        // bulkAddress1.setPrimaryLine("185 BERRY ST STE 6600");
        // bulkAddress1.setCity("SAN FRANCISCO");
        // bulkAddress1.setState("CA");
        // bulkAddress1.setZipCode("94017");
        // bulkVerify.addAddressesItem(bulkAddress1);

        // UsVerificationsApi apiInstance = new UsVerificationsApi(lobClient);
        // try {
        //     UsVerifications response = apiInstance.verifyBulk(bulkVerify, null);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // UsVerificationsWritable singleVerify = new UsVerificationsWritable();
        // singleVerify.setPrimaryLine("210 King Street");
        // singleVerify.setCity("San Francisco");
        // singleVerify.setState("CA");
        // singleVerify.setZipCode("94017");

        // UsVerificationsApi apiInstance = new UsVerificationsApi(lobClient);
        // try {
        //     apiInstance.verifySingle(singleVerify, null);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // UsAutocompletionsApi apiInstance = new UsAutocompletionsApi(lobClient);
        // UsAutocompletionsWritable autoCompletionWritable = new UsAutocompletionsWritable();
        // autoCompletionWritable.setAddressPrefix("185 B");
        // autoCompletionWritable.setCity("San Francisco");
        // autoCompletionWritable.setState("CA");
        // autoCompletionWritable.setZipCode("94017");

        // try {
        //     UsAutocompletions usAutocompletion = apiInstance.autocomplete(autoCompletionWritable);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // ReverseGeocodeLookupsApi apiInstance = new ReverseGeocodeLookupsApi(lobClient);

        // Location location = new Location();
        // location.setLatitude(37.7749f);
        // location.setLongitude(122.4194f);

        // try {
        //     apiInstance.lookup(location, null);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // ZipEditable zipEditable = new ZipEditable();
        // zipEditable.setZipCode("94107");

        // ZipLookupsApi apiInstance = new ZipLookupsApi(lobClient);
        // try {
        //     Zip response = apiInstance.lookup(zipEditable);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        IntlAutocompletionsWritable intlAutocompletionsWritable = new IntlAutocompletionsWritable();
        intlAutocompletionsWritable.setAddressPrefix("340 Wat");
        intlAutocompletionsWritable.setCity("Summerside");
        intlAutocompletionsWritable.setState("Prince Edward Island");
        intlAutocompletionsWritable.setZipCode("C1N 1C4");
        intlAutocompletionsWritable.setCountry(CountryExtended.CA);
        IntlAutocompletionsApi apiInstance = new IntlAutocompletionsApi(config);

        try {
        apiInstance.autocomplete(intlAutocompletionsWritable, null);
        } catch (ApiException e) {
        e.printStackTrace();
        }

        System.out.println("DONE");
    }
 }

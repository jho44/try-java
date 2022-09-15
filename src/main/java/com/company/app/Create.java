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

public class Create
{
    public static void main( String[] args )
    {
        ApiClient lobClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) lobClient.getAuthentication("basicAuth");

        basicAuth.setUsername("test_62291d3cc85971719264edb12016561ed19");

        AddressesApi addressApiInstance = new AddressesApi(lobClient);

        try {
            AddressEditable addressEditable = new AddressEditable();
            addressEditable.setDescription("Harry - Office");
            addressEditable.setName("Harry Zhang");
            addressEditable.setCompany("Lob");
            addressEditable.setEmail("harry@lob.com");
            addressEditable.setPhone("5555555555");
            addressEditable.setAddressLine1("210 King St");
            addressEditable.setAddressLine2("# 6100");
            addressEditable.setAddressCity("San Francisco");
            addressEditable.setAddressState("CA");
            addressEditable.setAddressZip("94107");
            addressEditable.setAddressCountry(CountryExtended.US);

            Address result = addressApiInstance.create(addressEditable);
            System.out.println(result);
        } catch (ApiException e) {
            e.printStackTrace();
        }

        // Map<String, String> merge_variables = new HashMap<>();
        // merge_variables.put("name", "Harry");

        // PostcardsApi postcardApiInstance = new PostcardsApi(lobClient);

        // AddressEditable to = new AddressEditable();
        // to.setName("Harry Zhang");
        // to.setAddressLine1("210 King St");
        // to.setAddressLine2("# 6100");
        // to.setAddressCity("San Francisco");
        // to.setAddressState("CA");
        // to.setAddressZip("94107");

        // try {
        //     PostcardEditable postcardEditable = new PostcardEditable();
        //     postcardEditable.setDescription("Demo Postcard job");
        //     postcardEditable.setFrom("adr_9c38e242e8845702");
        //     postcardEditable.setFront("<html style='padding: 1in; font-size: 50;'>Front HTML for {{name}}</html>");
        //     postcardEditable.setBack("<html style='padding: 1in; font-size: 20;'>Back HTML for {{name}}</html>");
        //     postcardEditable.setTo(to);
        //     postcardEditable.setMergeVariables(merge_variables);

        //     Postcard result = postcardApiInstance.create(postcardEditable, null);
        //     System.out.println(result);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // Map<String, String> merge_variables = new HashMap<>();
        // merge_variables.put("name", "Harry");

        // SelfMailersApi selfMailerApiInstance = new SelfMailersApi(lobClient);

        // AddressEditable to = new AddressEditable();
        // to.setName("Harry Zhang");
        // to.setAddressLine1("210 King St");
        // to.setAddressLine2("# 6100");
        // to.setAddressCity("San Francisco");
        // to.setAddressState("CA");
        // to.setAddressZip("94107");

        // try {
        //     SelfMailerEditable selfMailerEditable = new SelfMailerEditable();
        //     selfMailerEditable.setDescription("Demo Self Mailer job");
        //     selfMailerEditable.setFrom("adr_9c38e242e8845702");
        //     selfMailerEditable.setInside("<html style='padding: 1in; font-size: 50;'>Inside HTML for {{name}}</html>");
        //     selfMailerEditable.setOutside("<html style='padding: 1in; font-size: 20;'>Outside HTML for {{name}}</html>");
        //     selfMailerEditable.setTo(to);
        //     selfMailerEditable.setMergeVariables(merge_variables);

        //     SelfMailer result = selfMailerApiInstance.create(selfMailerEditable, null);
        //     System.out.println(result);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // LettersApi letterApiInstance = new LettersApi(lobClient);

        // List<String> cards = new ArrayList<String>();
        // cards.add("card_716b1ffc58fac75");

        // try {
        //     LetterEditable letterEditable = new LetterEditable();
        //     letterEditable.setDescription("Demo Letter");
        //     letterEditable.setFrom("adr_9c38e242e8845702");
        //     letterEditable.setFile("<html style='padding-top: 3in; margin: .5in;'>HTML Letter for {{name}}</html>");
        //     letterEditable.setColor(true);
        //     letterEditable.setTo(to);
        //     letterEditable.setMergeVariables(merge_variables);
        //     letterEditable.setCards(cards);

        //     Letter result = letterApiInstance.create(letterEditable, null);
        //     System.out.println(result);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // ChecksApi checkApiInstance = new ChecksApi(lobClient);

        // try {
        //     CheckEditable checkEditable = new CheckEditable();
        //     checkEditable.setDescription("Demo Check");
        //     checkEditable.setBankAccount("bank_3bd49c2996d31d3");
        //     checkEditable.setAmount(22.5f);
        //     checkEditable.setMemo("rent");
        //     checkEditable.setLogo("https://s3-us-west-2.amazonaws.com/public.lob.com/assets/check_logo.png");
        //     checkEditable.setCheckBottom("<h1 style='padding-top:4in;'>Demo Check for {{name}}</h1>");
        //     checkEditable.setFrom("adr_9c38e242e8845702");
        //     checkEditable.setTo(to);
        //     checkEditable.setMergeVariables(merge_variables);

        //     Check result = checkApiInstance.create(checkEditable, null);
        //     System.out.println(result);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }

        // BankAccountsApi bankAccountApiInstance = new BankAccountsApi(lobClient);

        // try {
        //     BankAccountWritable bankAccountWritable = new BankAccountWritable();
        //     bankAccountWritable.setDescription("Test Bank Account");
        //     bankAccountWritable.setRoutingNumber("322271627");
        //     bankAccountWritable.setAccountNumber("123456789");
        //     bankAccountWritable.setSignatory("John Doe");
        //     bankAccountWritable.setAccountType(BankTypeEnum.COMPANY);

        //     BankAccount result = bankAccountApiInstance.create(bankAccountWritable);
        //     System.out.println(result);
        // } catch (ApiException e) {
        //     e.printStackTrace();
        // }
    }
 }

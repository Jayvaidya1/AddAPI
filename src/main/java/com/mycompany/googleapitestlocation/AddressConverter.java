/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.googleapitestlocation;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 *
 * @author Jay Vaidya
 *
 */
public class AddressConverter {

    /*
  * Geocode request URL. Here see we are passing "json" it means we will get
  * the output in JSON format. You can also pass "xml" instead of "json" for
  * XML output. For XML output URL will be
  * "http://maps.googleapis.com/maps/api/geocode/xml";
     */
    private static final String URL = "http://maps.googleapis.com/maps/api/geocode/json";

    /*
  * Here the fullAddress String is in format like
  * "address,city,state,zipcode". Here address means "street number + route"
  * .
     */
    public GoogleResponse convertToLatLong(String fullAddress) throws IOException {

        /*
   * Create an java.net.URL object by passing the request URL in
   * constructor. Here you can see I am converting the fullAddress String
   * in UTF-8 format. You will get Exception if you don't convert your
   * address in UTF-8 format. Perhaps google loves UTF-8 format. :) In
   * parameter we also need to pass "sensor" parameter. sensor (required
   * parameter) — Indicates whether or not the geocoding request comes
   * from a device with a location sensor. This value must be either true
   * or false.
         */
        URL url = new URL(URL + "?address="
                + URLEncoder.encode(fullAddress, "UTF-8") + "&sensor=false");
        // Open the Connection
        URLConnection conn = url.openConnection();

        InputStream in = conn.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        GoogleResponse response = (GoogleResponse) mapper.readValue(in, GoogleResponse.class);
        in.close();
        return response;

    }

    public GoogleResponse convertFromLatLong(String lat, String lang) throws IOException {
        /*
   * Create an java.net.URL object by passing the request URL in
   * constructor. Here you can see I am converting the fullAddress String
   * in UTF-8 format. You will get Exception if you don't convert your
   * address in UTF-8 format. Perhaps google loves UTF-8 format. :) In
   * parameter we also need to pass "sensor" parameter. sensor (required
   * parameter) — Indicates whether or not the geocoding request comes
   * from a device with a location sensor. This value must be either true
   * or false.
         */
        URL url = new URL(URL + "?latlng="
                + URLEncoder.encode(lat, "UTF-8") + "," + URLEncoder.encode(lang, "UTF-8") + "&sensor=false");
        // Open the Connection
        URLConnection conn = url.openConnection();

        InputStream in = conn.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        GoogleResponse response = (GoogleResponse) mapper.readValue(in, GoogleResponse.class);
        in.close();
        return response;

    }

    public static void main(String[] args) throws IOException {
        List<String[]> resList = new ArrayList<String[]>();
        GoogleResponse res = new AddressConverter().convertToLatLong("shifa hospital jamlpur road  ahmedabad");
        if (res.getStatus().equals("OK")) {
            for (Result result : res.getResults()) {
                resList.add(new String[]{result.getGeometry().getLocation().getLat(), result.getGeometry().getLocation().getLng()});
                System.out.println("Lattitude of address is :" + result.getGeometry().getLocation().getLat());
                System.out.println("Longitude of address is :" + result.getGeometry().getLocation().getLng());
                System.out.println("Location is " + result.getGeometry().getLocation_type());
                System.out.println("error_message" + result.getGeometry().getError_message());

                if (result.getAddress_components().size() > 0) {
                    for (AddressComponent add : result.getAddress_components()) {
                        if (Arrays.asList(add.getTypes()).contains("country")) {
                            System.out.println("country::" + add.getLong_name());
                        }
                        if (Arrays.asList(add.getTypes()).contains("postal_code")) {
                            System.out.println("postalcode::" + add.getLong_name());
                        }
                        if (Arrays.asList(add.getTypes()).contains("locality")) {
                            System.out.println("locality::::" + add.getLong_name());
                        }
                    }
                }
            }
        } else {
            System.out.println(res.getStatus());
        }

    }

}

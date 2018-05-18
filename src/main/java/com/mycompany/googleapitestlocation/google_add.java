/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.googleapitestlocation;

/**
 *
 * @author deck
 */
public class google_add {

//    public static void main(String[] args) {
//        try {
//            String[] res = getLatLongPositions("Amphitheatre");
//            for (String s : res) {
//                System.out.println("s::>" + s);
//            }
//        } catch (Exception e) {
//            System.out.println("e-->" + e);  
//        }
//    }
//
//    public static String[] getLatLongPositions(String address) throws Exception {
//        int responseCode = 0;
//        String api = "https://maps.googleapis.com/maps/api/geocode/xml?address=" + URLEncoder.encode(address, "UTF-8") + "&sensor=true";
//        URL url = new URL(api);
//        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
//        httpConnection.connect();
//        responseCode = httpConnection.getResponseCode();
//        if (responseCode == 200) {
//            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//            
//            org.w3c.dom.Document document = builder.parse(httpConnection.getInputStream());
//            
//            System.out.println("document->" + document);
//            
//            XPathFactory xPathfactory = XPathFactory.newInstance();
//            System.out.println("xPathfactory->" + xPathfactory);
//            
//            XPath xpath = xPathfactory.newXPath();
//             System.out.println("xpath->" + xpath);
//            XPathExpression expr = xpath.compile("/GeocodeResponse/status");
//           
//            
//            String status = (String) expr.evaluate(document, XPathConstants.STRING);
//            System.out.println("status->" + status);
//            
//            if (status.equals("OK")) {
//                expr = xpath.compile("//geometry/location/lat");
//                System.out.println("expr->" + expr);
//            
//                String latitude = (String) expr.evaluate(document, XPathConstants.STRING);
//                expr = xpath.compile("//geometry/location/lng");
//                
//                String longitude = (String) expr.evaluate(document, XPathConstants.STRING);
//                return new String[]{latitude, longitude};
//            } else {
//                System.out.println("error..");
//            }
//        }
//        return null;
//    }

}

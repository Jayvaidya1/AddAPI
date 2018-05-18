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
public class javaApiJson {

//    public static final Logger logger = Logger.getLogger(javaApiJson.class.getName());
//
//    public static String getVesselDataByIMONumber(String address) {
//
//        try {
//            URL url = new URL("https://maps.googleapis.com/maps/api/geocode/json?address=" + URLEncoder.encode(address, "UTF-8") + "&sensor=true");
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.setRequestProperty("Accept", "application/json");
//
//            if (conn.getResponseCode() != 200) {
//                throw new RuntimeException("Failed : HTTP error code : "
//                        + conn.getResponseCode());
//            }
//            BufferedReader br = new BufferedReader(new InputStreamReader(
//                    (conn.getInputStream())));
//            String output;
//            do {
//                if(br.readLine() == "geometry"){
//                    
//                }
//                System.out.println("output+++++++" + br.readLine());
//
//            } while (br.readLine() != null);
//            return br.readLine();
//
//        } catch (MalformedURLException e) {
//        } catch (IOException e) {
//        }
//        return null;
//    }
//
//    public static JSONObject getObjectFromVesselData(String jsonObj) {
//        JSONParser parser = new JSONParser();
//
//        try {
//            Object fullJSON = parser.parse(jsonObj);
//            JSONObject jsonObject = (JSONObject) fullJSON;
//            if (jsonObject.get("Vessels") != null) {
//                JSONArray msg = (JSONArray) jsonObject.get("Vessels");
//                if (msg.size() > 0) {
//                    Object vesselData = parser.parse(msg.get(0).toString());
//                    JSONObject vessel = (JSONObject) vesselData;
//
//                    logger.log(Level.INFO, "Name : [{0}]", vessel.get("Name"));
//                    logger.log(Level.INFO, "Ship_Id : [{0}]", vessel.get("Id"));
//                    logger.log(Level.INFO, "OfficialNo : [{0}]", vessel.get("OfficialNo"));
//                    logger.log(Level.INFO, "Flag : [{0}]", vessel.get("Flag"));
//                    logger.log(Level.INFO, "Register : [{0}]", vessel.get("Register"));
//                    logger.log(Level.INFO, "VesselType : [{0}]", vessel.get("VesselType"));
//                    logger.log(Level.INFO, "HomePort : [{0}]", vessel.get("HomePort"));
//
//                    return vessel;
//                }
//                return null;
//            }
//            return null;
//
//        } catch (ParseException e) {
//            return null;
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            String res = getVesselDataByIMONumber("sabarmati ahmedabad");
//
//            System.out.println("s::>" + res);
//        } catch (Exception e) {
//
//        }
//    }
}

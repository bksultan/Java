package tests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dasd {

    public static String method(String str1, String str2){
        String result ="";


        for(String  ss: str2.split("")){
            if(!str1.contains(ss)){
                return "false";
            }
        }

       // boolean result =  Arrays.stream(str2.split("")).map(a->a.contains(str2)).
        return result;

    }


    public static void getAge() throws IOException {
        HttpURLConnection connect = (HttpURLConnection) new URL("https://coderbyte.com/api/challenges/json/age-counting").openConnection();
        connect.setRequestMethod("GET");
        connect.setRequestProperty("Accept", "application/json");
        ObjectMapper objectMapper = new ObjectMapper();
        int statusCode= connect.getResponseCode();
        Assert.assertEquals(200, statusCode);
        Map<String,String> mapResponse = objectMapper.readValue(connect.getInputStream(),  new TypeReference<Map<String, String>>(){});
        String[] arrayOfKeyAndValue = mapResponse.get("data").split(",");
        Map<String,Integer> mapOfObjects = new HashMap<>();
        for(int i=0; i<arrayOfKeyAndValue.length-1; i += 2) {
            String key1 =arrayOfKeyAndValue[i].substring(arrayOfKeyAndValue[i].indexOf("=")+1);
            int value1 = Integer.parseInt(arrayOfKeyAndValue[i+1].replaceAll("[^0-9]", ""));
            mapOfObjects.put(key1,value1);
        }
        Map<String,Integer> finalMap = new HashMap<>();
        // mapOfObjects.keySet().stream().filter(k -> mapOfObjects.get(k) >= 50).forEach(k -> finalMap.put(k, mapOfObjects.get(k)));
        int result = (int)mapOfObjects.keySet().stream().filter(k -> mapOfObjects.get(k) >= 50).count();
        // mapOfObjects.keySet().stream().filter(k -> mapOfObjects.get(k) >= 50).forEach(a->System.out.println("key="+a+", age="+mapOfObjects.get(a)));
        System.out.println(result);
        System.out.println(finalMap);
    }
    public static void main(String[] args) throws Exception {

        System.out.println(method("cdore","coder"));
        //getAge();
    }
    // Task: Retrieve all products currently in the store
// Products categories => id, name, updated_at, price, manufacturer(only if containing manufacturer name)
// API URI http://127.0.01:8081
// only end point is http://127.0.0.1:8081/products
//end point should return JSON Array
    public static void getSolution() throws Exception{
        //long startTime = System.currentTimeMillis();
        // System.out.println("Executing GET call");
        HttpURLConnection connect = (HttpURLConnection) new URL("http://127.0.0.1:8081/products").openConnection();
        connect.setRequestMethod("GET");
        connect.setRequestProperty("Accept", "application/json");
        // long endTime = System.currentTimeMillis();
        //if(endTime-startTime>10000){
        //   Assert.fail();
        // }
        ObjectMapper objectMapper = new ObjectMapper();
        int statusCode= connect.getResponseCode();
        Assert.assertEquals(200, statusCode);
        //System.out.println("Parsing response");
        List<Map<String, Object>> listOfObjects = objectMapper.readValue(connect.getInputStream(),  new TypeReference<List<Map<String, Object>>>(){});
        for(int i = 0; i<listOfObjects.size(); i++){
            if(listOfObjects.get(i).get("manufacturer")==null){
                System.out.printf("Product %s has price %d and no manufacturer\n", listOfObjects.get(i).get("name"), listOfObjects.get(i).get("price"));       }else{
                System.out.printf("Product %s has price %d and manufacturer %s\n",listOfObjects.get(i).get("name"),listOfObjects.get(i).get("price"), listOfObjects.get(i).get("manufacturer"));
            }
        }
    }
}

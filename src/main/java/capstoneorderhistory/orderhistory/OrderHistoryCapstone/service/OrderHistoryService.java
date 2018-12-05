package capstoneorderhistory.orderhistory.OrderHistoryCapstone.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;



import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import capstoneorderhistory.orderhistory.OrderHistoryCapstone.model.Product;

public class OrderHistoryService {
	ExcelWriterService service = new ExcelWriterService();
	public List<Product> getOrderByCustomerName() {
        try {

               URL url = new URL("http://gcupalowski2018-env.umnhc26gyw.us-east-2.elasticbeanstalk.com/orders/customer");
               HttpURLConnection conn = (HttpURLConnection) url.openConnection();
               conn.setRequestMethod("GET");
               conn.setRequestProperty("Accept", "application/json");

               if (conn.getResponseCode() != 200) {
                   throw new RuntimeException("Failed : HTTP error code : "
                           + conn.getResponseCode());
               }

               BufferedReader br = new BufferedReader(new InputStreamReader(
                   (conn.getInputStream())));


               System.out.println("Output from Server .... \n");
               String line = br.readLine(); 
       			ObjectMapper o = new ObjectMapper();
       			List<Product> list = o.readValue(line, new TypeReference<ArrayList<Product>>() {});
       		  return list;
             
     

             } catch (MalformedURLException e) {

               e.printStackTrace();

             } catch (IOException e) {

               e.printStackTrace();

             }
        return null; 
   }
	
	
	public List<Product> getOrderDistrictName() {
		
      
		try {
               URL url = new URL("http://gcupalowski2018-env.umnhc26gyw.us-east-2.elasticbeanstalk.com/products");
               HttpURLConnection conn = (HttpURLConnection) url.openConnection();
               conn.setRequestMethod("GET");
               conn.setRequestProperty("Accept", "application/json");

               if (conn.getResponseCode() != 200) {
                   throw new RuntimeException("Failed : HTTP error code : "
                           + conn.getResponseCode());
               }

               BufferedReader br = new BufferedReader(new InputStreamReader(
                   (conn.getInputStream())));


               System.out.println("Output from Server .... \n");
               String line = br.readLine(); 
       			ObjectMapper o = new ObjectMapper();
       			List<Product> list = o.readValue(line, new TypeReference<ArrayList<Product>>() {});
       		  return list;
             
     

             } catch (MalformedURLException e) {

               e.printStackTrace();

             } catch (IOException e) {

               e.printStackTrace();

             }
        return null; 
   }
	public List<Product> getOrderByDonorName() {
        try {
                URL url = new URL("http://gcupalowski2018-env.umnhc26gyw.us-east-2.elasticbeanstalk.com/order/donor");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setRequestProperty("Accept", "application/json");

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : "
                            + conn.getResponseCode());
                }

                BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));


                System.out.println("Output from Server .... \n");
                String line = br.readLine(); 
        			ObjectMapper o = new ObjectMapper();
        			List<Product> list = o.readValue(line, new TypeReference<ArrayList<Product>>() {});
        		  return list;
             

              } catch (MalformedURLException e) {

                e.printStackTrace();

              } catch (IOException e) {

                e.printStackTrace();

              }
         return null; 
         
   }
	public List<Product> getOrderByProductName() {
        try {

               URL url = new URL("http://gcupalowski2018-env.umnhc26gyw.us-east-2.elasticbeanstalk.com/orders/product");
               HttpURLConnection conn = (HttpURLConnection) url.openConnection();
               conn.setRequestMethod("GET");
               conn.setRequestProperty("Accept", "application/json");

               if (conn.getResponseCode() != 200) {
                   throw new RuntimeException("Failed : HTTP error code : "
                           + conn.getResponseCode());
               }

               BufferedReader br = new BufferedReader(new InputStreamReader(
                   (conn.getInputStream())));


               System.out.println("Output from Server .... \n");
               String line = br.readLine(); 
       			ObjectMapper o = new ObjectMapper();
       			List<Product> list = o.readValue(line, new TypeReference<ArrayList<Product>>() {});
       		  return list;
             
     

             } catch (MalformedURLException e) {

               e.printStackTrace();

             } catch (IOException e) {

               e.printStackTrace();

             }
        return null; 
	}
}

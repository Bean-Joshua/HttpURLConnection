package assignment.HttpURLConnection;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
import java.io.*;

public class TryHttp {
	public static void main(String [] args){
	  
	    HttpURLConnection urlConn = null;
	    BufferedReader in;
	  
	    try{
	      System.out.println("Starting Attempt");
	      URL url = new URL("www.android.com");
	      urlConn = (HttpURLConnection)url.openConnection();
	      urlConn.setRequestMethod("GET");
	      urlConn.setDoInput (true);
	      urlConn.setDoOutput (true);
	      urlConn.setRequestProperty ("Content-Type","application/x-www-form-urlencoded");
	      
	      
	      in = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
	  
	      System.out.println("Done");
	  
	    }catch(MalformedURLException e){
	  
	    }catch(IOException e){
	   
	    }catch(Exception e){
	      System.out.println(e.getMessage());
	      System.out.println(e.getStackTrace());
    }
  }
}



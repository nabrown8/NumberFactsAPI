package NumberFactsAPI;

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NumberFactsAPI {
    
    //Get a number fact for a random number 0-100.  
    public static void getNumberFact() {
        //Generate a random number.
        int num = (int) (Math.random() * 101);
        String mainURL = "http://numbersapi.com/" + num + "?json";
        try {
            //Establish the connection with the given URL.
            URL url = new URL(mainURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            //Check the status of the connection and display an appropriate error if needed.
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.println("Error Detected--Fact not listed. (Status: "
                   + status);
            } else {
                //Convert input stream into a text stream.
                BufferedReader readIn = new BufferedReader(new 
                    InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = readIn.readLine()) != null){
                    content.append(inputLine);
                }
                //Close the connections.
                readIn.close();
                con.disconnect();
                //Output the text stream.
                System.out.println("Output: " + content.toString());
                //Convert the text stream to a JSON object.
                JSONObject obj = new JSONObject(content.toString());
                // Print out just the fact as plain text.
                String factText = obj.getString("text");
                System.out.println("Fact: " + factText);
            }
        } catch (Exception ex) {
            System.out.println("Error Detected: " + ex);
        }
    }
    
    //Generate a number fact about a specified number.
    public static void getNumberFact(int _num) { 
        String mainURL = "http://numbersapi.com/" + _num + "?json";
        try {
            //Establish the connection with the given URL.
            URL url = new URL(mainURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            //Check the status of the connection and display an appropriate error if needed.
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.println("Error Detected--Fact not listed. (Status: "
                   + status);
            } else {
                //Convert input stream into a text stream.
                BufferedReader readIn = new BufferedReader(new 
                    InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = readIn.readLine()) != null){
                    content.append(inputLine);
                }
                //Close the connections.
                readIn.close();
                con.disconnect();
                //Output the text stream.
                System.out.println("Output: " + content.toString());
                //Convert the text stream to a JSON object.
                JSONObject obj = new JSONObject(content.toString());
                // Print out just the fact as plain text.
                String factText = obj.getString("text");
                System.out.println("Fact: " + factText);
            }
        } catch (Exception ex) {
            System.out.println("Error Detected: " + ex);
        }
    }
}

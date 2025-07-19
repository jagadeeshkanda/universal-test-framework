package UniversalTestCore.universal_test_framework;

import com.fasterxml.jackson.databind.JsonNode;
import com.universaltestcore.utils.JsonFileHandler;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
    	
    	JsonNode jsonData = JsonFileHandler.readJsonFile("inputfileone.json");
    	 if (jsonData.has("error")) {
    	        System.out.println("Error: " + jsonData.get("error").asText());
    	    } else if (jsonData.has("Name")) {
    	        System.out.println("Hello World! " + jsonData.toPrettyString());
    	    } else {
    	        System.out.println("Key 'Name' not found in the JSON.");
    	    }
    }
}

package DDT;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.json.Json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FetchDataFromJasonfile {
	public static void main(String[] args) throws Throwable {
		File file = new File("./src/test/resources/JasonData.json");
		ObjectMapper jsonData = new ObjectMapper();
		JsonNode data = jsonData.readTree(file);
		String URL = data.get("url").asText();
		String USERNAME = data.get("username").asText();
		
		String PASSWORD = data.get("password").asText();
		

}
}
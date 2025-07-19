package com.universaltestcore.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * JsonFileHandler is a utility class that provides core functionalities
 * for interacting with JSON files in automation frameworks.
 *
 * This class supports:
 * - Reading values from a JSON file using keys or key paths.
 * - Writing data to a JSON file by adding or updating key-value pairs.
 * - Creating new JSON files with custom content if needed.
 *
 * Usage:
 * Designed for internal use in data-driven automation testing where
 * JSON files are used as input sources for test data or configuration.
 *
 * All methods are built to return results in string format for easy integration
 * with assertions, logs, and reporting tools.
 *
 * Package: com.universaltestcore.utils
 *
 * Example use cases:
 * - Retrieve a test value: getValueFromJson(filePath, key)
 * - Update a test config: updateJsonValue(filePath, key, newValue)
 * - Write new JSON structure: createJsonFile(filePath, jsonData)
 **/

public class JsonFileHandler {
    private static final String BASE_PATH = "src/test/resource/JsonData/";

	public static JsonNode readJsonFile(String fileName) {
		
		ObjectMapper mapper = new ObjectMapper();
        File file = new File(BASE_PATH + fileName);
        try {
			return mapper.readTree(file);
		} catch (IOException e) {
			ObjectNode errorNode = mapper.createObjectNode();
            errorNode.put("error", "Data is not there: " + e.getMessage());
            return errorNode;
		}		
	}
	
	
	public static JsonNode updateJsonValue(JsonNode jsonNode, String key, String newValue) {
	    if (jsonNode instanceof ObjectNode) {
	        ((ObjectNode) jsonNode).put(key, newValue);
	    } else {
	        System.out.println("Provided JsonNode is not an ObjectNode");
	    }
	    return jsonNode;
	}
	
	
	public static JsonNode addOrUpdateJsonValues(JsonNode jsonNode, Map<String, Object> updates) {
	    if (jsonNode instanceof ObjectNode) {
	        ObjectNode objectNode = (ObjectNode) jsonNode;
	        for (Map.Entry<String, Object> entry : updates.entrySet()) {
	            Object value = entry.getValue();
	            String key = entry.getKey();

	            if (value instanceof Integer) {
	                objectNode.put(key, (Integer) value);
	            } else if (value instanceof Boolean) {
	                objectNode.put(key, (Boolean) value);
	            } else if (value instanceof Double) {
	                objectNode.put(key, (Double) value);
	            } else if (value instanceof Long) {
	                objectNode.put(key, (Long) value);
	            } else if (value != null) {
	                objectNode.put(key, value.toString()); // default to string
	            } else {
	                objectNode.putNull(key); // handle nulls
	            }
	        }
	    }
	    return jsonNode;
	}
	
	 public static JsonNode addOrUpdateJsonListValue(JsonNode jsonNode, String key, List<JsonNode> newValues) {
	        if (jsonNode instanceof ObjectNode) {
	            ArrayNode arrayNode = JsonNodeFactory.instance.arrayNode();
	            arrayNode.addAll(newValues);
	            ((ObjectNode) jsonNode).set(key, arrayNode);
	        } else {
	            System.out.println("Provided JsonNode is not an ObjectNode");
	        }
	        return jsonNode;
	    }
	 
	 public static JsonNode addOrUpdateJsonValue(JsonNode jsonNode, String key, JsonNode newValue) {
		    if (jsonNode instanceof ObjectNode) {
		        ((ObjectNode) jsonNode).set(key, newValue);
		    } else {
		        System.out.println("Provided JsonNode is not an ObjectNode");
		    }
		    return jsonNode;
		}
	 
}

package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> map =new HashMap<String,String>(4,1.0f);
		map.put("a", "a");
		map.put("b", "a");
		map.put("c", "a");
		map.put("d", "a");
		map.put("d", "d");
	}

}

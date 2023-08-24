import java.util.HashMap;

public class Practice2 {

        public static void main(String[] args) {
            HashMap<String, String[]> map = new HashMap<>();
            map.put("key1", new String[] {"value1", "value2"});
            map.put("key2", new String[] {"value3", "value4"});

            for (String key : map.keySet()) {
                System.out.println(key + ": " + String.join(", ", map.get(key)));
            }
        }

}

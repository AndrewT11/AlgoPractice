import twosum.Solution;


import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {


        int[] array = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(solution2(array, target)));

    }

    public static int[] solution2(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            int difference = target - array[i];

            if(map.containsKey(difference)) {
                result[0] = i;
                result[1] = map.get(difference);
            }
            map.put(array[i], i);
        }
        return result;

    }



}

package ramustha;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
  private final Map<Integer, Integer> pairBucket = new HashMap<>();

  public Test1(Integer[] input) {
    if (input != null && input.length > 0) {

      Map<Integer, Integer> temp = new HashMap<>();
      for (int in : input) {
        temp.put(in, temp.getOrDefault(in, 0) + 1);
      }
      temp.forEach((aK, aV) -> pairBucket.put(aK, aV / 2));
      temp.clear();
    }
  }

  public Integer getTotalPair() {
    return pairBucket.values().stream().mapToInt(Integer::intValue).sum();
  }
}

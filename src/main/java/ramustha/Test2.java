package ramustha;

public class Test2 {
  private int max;

  public Test2(int n, Integer[] input) {
    if (input != null && input.length > 0) {

      for (int i = 0; i < input.length; i++) {
        int sum = input[i];
        int tempMax = 1;

        for (int x = i + 1; x < input.length; x++) {
          int factor = input[x];
          int next = sum + factor;
          if (next <= n) {
            tempMax++;
            sum += factor;
          }

          if (tempMax > max) {
            max = tempMax;
          }
        }
      }
    }
  }

  public int max() {
    return max;
  }
}

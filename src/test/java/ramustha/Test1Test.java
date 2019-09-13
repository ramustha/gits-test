package ramustha;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test1Test {
  @Test
  void test_1() {
    Test1 test1 = new Test1(new Integer[] {10, 20, 20, 10, 10, 30, 50, 10, 20});
    assertThat(test1.getTotalPair()).isEqualTo(3);
  }

  @Test
  void test_2() {
    Test1 test1 = new Test1(new Integer[0]);
    assertThat(test1.getTotalPair()).isEqualTo(0);
  }

  @Test
  void test_3() {
    Test1 test1 = new Test1(new Integer[] {1});
    assertThat(test1.getTotalPair()).isEqualTo(0);
  }
}
package ramustha;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test2Test {
  @Test
  void test_1() {
    Test2 test1 = new Test2(7, new Integer[] {1, 2, 3, 4});
    assertThat(test1.max()).isEqualTo(3);
  }

  @Test
  void test_2() {
    Test2 test1 = new Test2(0, new Integer[0]);
    assertThat(test1.max()).isEqualTo(0);
  }

  @Test
  void test_3() {
    Test2 test1 = new Test2(50, new Integer[] {1, 12, 5, 111, 200, 1000, 10});
    assertThat(test1.max()).isEqualTo(4);
  }

  @Test
  void test_4() {
    Test2 test1 = new Test2(4, new Integer[] {1, 2, 3, 4});
    assertThat(test1.max()).isEqualTo(2);
  }

  @Test
  void test_5() {
    Test2 test1 = new Test2(200, new Integer[] {1, 12, 5, 111, 200, 1000, 10});
    assertThat(test1.max()).isEqualTo(5);
  }
}
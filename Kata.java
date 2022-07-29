public class Kata{

  public static int grow(int[] x, int i) {
    int result = 1;
    for (int a : x) {
      result *= a;
    }
    return result;

  }
  public static void main(String[] args) {
    System.out.println(grow(new int[] { 1, 2, 3 },6));
    System.out.println(grow(new int[] { 1, 2, 3, 4 }, 24));
    System.out.println(grow(new int[] { 1, 2, 3, 4, 5 }, 0));
  }
}


// TODO: Replace examples and use TDD development by writing your own tests
//System.out.println(Kata.grow(new int[]{1,2,3}));
//System.out.println(Kata.grow(new int[]{1,2,3,4}),24);

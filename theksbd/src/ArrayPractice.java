public class ArrayPractice {
    public static void main(String[] args) {
        int A[] = new int[5];
        int B[] = { 1, 2, 3, 4, 5 };
        int C[];
        C = new int[5];
        int[] D = new int[5];

        B[2] = 15;
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }

        for (int i : B) {
            System.out.println(i);
        }
    }
}

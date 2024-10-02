import java.util.Scanner;

public class hashing {
    static int q;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n  = sc.nextInt(); //Size of array
            int[] a= new int[n];
            for(int i=0;i<n;i++){ //reading values of array
                a[i] =sc.nextInt();
            }
            int[] hash = new int[13];//initializing hash to the size of max-1
            for(int i=0;i<n;i++){
                hash[a[i]]++; // incrementing the count for each element of array
            }   

            int q = sc.nextInt(); // Number of queries
            for (int i = 0; i < q; i++) {
                int num = sc.nextInt();//reading each query number
                System.out.println(hash[num]);//If a[i] is 3, then hash[3] refers to the element at index 3 in the hash array.
            }
        }
    }
}

// Input Array: Suppose a = [2, 3, 2, 5, 3, 2]
// Determine max: The maximum value in a is 5.
// Initialize Hash Array: hash is initialized with size max + 1 = 6, so hash = [0, 0, 0, 0, 0, 0].
// Populate Hash Array:
// Iteration 1: i = 0, a[i] = 2, hash[2]++ → hash = [0, 0, 1, 0, 0, 0]
// Iteration 2: i = 1, a[i] = 3, hash[3]++ → hash = [0, 0, 1, 1, 0, 0]
// Iteration 3: i = 2, a[i] = 2, hash[2]++ → hash = [0, 0, 2, 1, 0, 0]
// Iteration 4: i = 3, a[i] = 5, hash[5]++ → hash = [0, 0, 2, 1, 0, 1]
// Iteration 5: i = 4, a[i] = 3, hash[3]++ → hash = [0, 0, 2, 2, 0, 1]
// Iteration 6: i = 5, a[i] = 2, hash[2]++ → hash = [0, 0, 3, 2, 0, 1]
// After all iterations, hash represents the count of each number from 0 to 5:
// hash[0] = 0 (0 appears 0 times)
// hash[1] = 0 (1 appears 0 times)
// hash[2] = 3 (2 appears 3 times)
// hash[3] = 2 (3 appears 2 times)
// hash[4] = 0 (4 appears 0 times)
// hash[5] = 1 (5 appears 1 time)

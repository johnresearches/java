import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;

import java.util.regex.*;

public class LoopingI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int product=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <=10; ++i){
            product = N*i;
            System.out.println(N +" x "+ i +" = "+ product );
        }
        scanner.close();
    }
}

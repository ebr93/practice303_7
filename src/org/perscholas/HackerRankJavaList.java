package org.perscholas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerRankJavaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        
        int N = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            numList.add(n);
        }
        
        int Q = scanner.nextInt();
        int i = 0;
        while (true) {
        	if (!(i < Q)) break;
            String q = scanner.nextLine();
            if (q.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                numList.add(x, y);
                i++;
            } else if (q.equals("Delete")) {
                int index = scanner.nextInt();
                numList.remove(index);
                i++;
            }
        }
        
        for (int j = 0; j < numList.size(); j++) {
            if (j == numList.size() - 1) {
                System.out.print(numList.get(j));
            } else {
                System.out.print(numList.get(j) + " ");
            }
        }
        scanner.close();
	}

}

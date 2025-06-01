package hackerrankArrayLeftRotation;

import java.io.*;
import java.util.*;

//Problem: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

public class Main {

    static List<Integer> rotLeft(List<Integer> a, int d){

        List<Integer> e = new ArrayList<>(Collections.nCopies(a.size(), 0));
        for(int i =0; i<a.size(); i++){
            e.set(i, a.get( (i +d)% a.size() ));
        }
//        Queue<Integer> b = new LinkedList<>(a);
//        for (int i = 0; i < d; i++) {
//            int number = b.poll();
//            b.offer(number);
//        }
//
//        return new ArrayList<>(b);
        return e;
    }

    //input:
    // 3
    // 6 5 4 3 2 2 1 1 9 8
    //output:
    // 3 2 2 1 1 9 8 6 5 4
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt( reader.readLine());

        String[] aItems = reader.readLine().split(" ");
        List<Integer> a = new ArrayList<>();
        for (String item : aItems) {
            a.add(Integer.parseInt(item));
        }

        List<Integer> result = rotLeft(a, d);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
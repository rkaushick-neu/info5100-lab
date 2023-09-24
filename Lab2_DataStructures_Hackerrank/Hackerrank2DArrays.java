/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author rishabhkaushick
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Hackerrank2DArrays {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        // initializing a variable for the largest sum
        int largestSum;
        
        // setting the largestSum of hourglass to the first hourglass
        largestSum =    arr.get(0).get(0)+arr.get(0).get(1)+arr.get(0).get(2)
                                +arr.get(1).get(1)
                        +arr.get(2).get(0)+arr.get(2).get(1)+arr.get(2).get(2);
        
        // iterating thru the rows of the 2d list
        for (int i=0; i<arr.size()-2; i++){
            // iterating thru the columns for the ith row
            for(int j=0; j<arr.get(i).size()-2; j++){
                // initilizing a temp variable for the iterative sum
                int currentSum;
                currentSum = arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)
                                        +arr.get(i+1).get(j+1)
                            +arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                if(currentSum > largestSum){
                    largestSum = currentSum;
                }
            }   
        }
        System.out.println(largestSum);
    }
}

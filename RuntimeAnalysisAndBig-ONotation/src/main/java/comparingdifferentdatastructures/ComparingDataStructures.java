package comparingdifferentdatastructures;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparingDataStructures {
    public static void main(String[] args) {
        compare();

    }
    public static double[] compare(){

        double ans[]=new double[3];
        int dataSet[]={1000,10000,100000};
        int target=9999999;

        for (int i=0;i<dataSet.length;i++){

            int arr[]=new int[dataSet[i]];
            HashSet<Integer>set=new HashSet<>();
            TreeSet<Integer>treeSet=new TreeSet<>();

            for (int j=1;j<=dataSet[i];j++){
                arr[j-1]=j;
                set.add(j);
                treeSet.add(j);
            }

            long startTime=System.nanoTime();
            for(int k=0;k<arr.length;k++){
                if (arr[k]==target)
                    break;
            }
            long endTime=System.nanoTime();
            ans[0]=(endTime-startTime)/100000.0;
            System.out.println("\nTime taken by Array for "+dataSet[i]+" data is "+ans[0]);

           startTime=System.nanoTime();
           set.contains(target);
           endTime=System.nanoTime();
            ans[1]=(endTime-startTime)/100000.0;
            System.out.println("Time taken by HashSet for "+dataSet[i]+" data is "+ans[1]);


            startTime=System.nanoTime();
            treeSet.contains(target);
            endTime=System.nanoTime();
            ans[2]=(endTime-startTime)/100000.0;
            System.out.println("Time taken by TreeSet for "+dataSet[i]+" data is "+ans[1]);


        }

        return ans;
    }
}

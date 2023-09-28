import java.util.ArrayList;
import java.util.Collections;

public class Lec_23_ArrayListVid {
    public static void arrayListBasics() {
        ArrayList<Integer>  list = new ArrayList<>();       // They are linear and inbuilt in nature
        list.add(4);        list.add(3);        list.add(6);        list.add(8);        list.add(7);
        System.out.println(list);
        // Reverse the ArrayList elements
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // Find the Maximum
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++) {
            // if (max < list.get(i)) {
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);    
        // swap two numbers with help of its indexes
        int idx1 = 2, idx2= 3;
        swap(list, idx1, idx2);
        // Sorting an ArrayList (ascending)
        Collections.sort(list);
        System.out.println(list);
        // descending
        Collections.sort(list, Collections.reverseOrder()); // Comparator - fnx logic
        System.out.println(list);
    }
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);
    }
    public static void multiDimentionalArrayList() {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer>  list1 = new ArrayList<>();       
        ArrayList<Integer>  list2 = new ArrayList<>();       
        for (int i=1; i<=5; i++) {
            list1.add(i*2); list2.add(i*3);
        }
        list2.remove(2);
        mainList.add(list1);    mainList.add(list2);
        System.out.println(mainList);
        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
    // Brute Force - O(n^2)
    public static int storeWaterContainer(ArrayList<Integer> height) {
        int maxWater = 0;
        
        for (int i=0; i<height.size(); i++) {
            for (int j=i+1; j<height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = width * ht;
                maxWater = Math.max(maxWater, currWater);

            }
        }
        return maxWater;
    }
    // 2 pointer approach - O(n)
    public static int storeWaterContainerOptimized(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0, rp = height.size()-1;
        while(lp<rp) {
            // calculate area of water
            int ht = Math.min(height.get(lp), height.get(rp));
                int width = rp-lp;
                int currWater = width * ht;
                maxWater = Math.max(maxWater, currWater);
            // update ptr
            if (height.get(lp)<height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
    // Condn - ArrayList Sorted
    // Brute Force
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
          for (int i=0; i<list.size(); i++) {
            for (int j=i+1; j<list.size(); j++) {
                if ((list.get(i) + list.get(j)) == target) {
                    return true;
                }
            }
          }
          return false;
    }
    // 2 pointer approach - O(n)
    public static boolean pairSum1Optimized(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size()-1;
        while(lp<rp) {
            int sum = (list.get(lp) + list.get(rp));
            if (sum == target) {
                return true;
            } else if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }
    // Condn - ArrayList Sorted and Rotated
    // 2 pointer approach - O(n)
    public static boolean pairSum2Optimized(ArrayList<Integer> list, int target) {
        int bp = -1;            // Finding pivot positn
        int n = list.size();
        for (int i=0; i<n; i++) {
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }
        int lp = bp+1, rp = bp;
        while (lp!=rp) {
            int sum = (list.get(lp) + list.get(rp));
            // case 1
            if (sum == target) {
                return true;
            } 
            // case 2
            else if (sum < target) {
                lp = (lp+1)%n;
            } else {
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
    
}

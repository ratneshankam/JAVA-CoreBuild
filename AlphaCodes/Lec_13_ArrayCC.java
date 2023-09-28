import java.util.*;
public class Lec_13_ArrayCC {
    public static int linearSearch(int numbers[], int key) {
        for (int i=1; i<=numbers.length; i++) {
            if (numbers[i] == key){
            System.out.println(numbers[i]);
            return i;}
        }
        return -1;
    }

    public static void update(int marks[], int unchangable) {
        unchangable = 15;
        for (int i=0; i<marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static String menu(String menu[]) {
        for (int i = 0; i<menu.length; i++) {
            if( menu[i]== "kachori") {
                return "gotTheItem";
            }
        }
        return "limitedMenu";
    }

    public static int largestSmallestValue(int numbers[]) {
        int largest = Integer.MIN_VALUE;    int smallest = Integer.MAX_VALUE;
        for (int i=0; i<numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        for (int i=0; i<numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.print("smallest: " + smallest + " largest: ");
        return largest;
    }
    
    public static int binarySearch(int numbers[], int key) {
        int start = 0; int end = numbers.length - 1;
        while (start <= end) {
        int mid = ((start + end)/2);
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void reverseArrayByAnotherArray(int numbers[]) {
        int iter=0; int anotherNum[] = new int[numbers.length]; 
        for (int i = numbers.length-1; i>=0; i--) {
            anotherNum[iter] = numbers[i];
            iter++;
        }
        for (int i=0; i<anotherNum.length; i++) {
            System.out.print(anotherNum[i] + " ");
        }
    }
    public static void reverseArrayOptimal(int numbers[]) {
        int start = 0; int end = numbers.length-1;
        while (start<end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        // for (int i=0; i<end; i++) {
        //     int temp = numbers[end];
        //     numbers[end] = numbers[start];
        //     numbers[start] = temp;
        //     start++;
        //     end--;
        // }
        for (int i = 0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void printArrayPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i<numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i+1; j<numbers.length; j++) {
                System.out.print("("+curr+","+numbers[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs: " + tp);
    }
    
    public static void subArrays(int numbers[]) {
        int ts = 0; int s = 0;
        int arrSum[] = new int[((numbers.length * (numbers.length+1)) / 2)];
        for (int i=0; i<numbers.length; i++) {
            for ( int j=i; j<numbers.length; j++) {
                int sum = 0;
                for (int k = i; k<=j; k++) {
                    sum += numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                arrSum[s] = sum;
                s++;
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subArrays: " + ts);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i<arrSum.length; i++) {
            System.out.print(arrSum[i] + " ");
            if (largest<arrSum[i]) {
                largest = arrSum[i];
            }
            if (smallest>arrSum[i]) {
                smallest = arrSum[i];
            }
        }
        System.out.println();
        System.out.println(smallest);
        System.out.println(largest);
    }

    public static void subArraysSelfMade(int numbers[]) {
        for (int i=0; i<numbers.length; i++) {
            for (int j=i; j<numbers.length; j++) {
                for (int k=i; k<=j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void prefixSumArray(int numbers[]) {
        int currSum = 0; int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for (int i=0; i<numbers.length; i++) {
            for (int j=i; j<numbers.length; j++) {
                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                System.out.print(currSum + " ");
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is " + maxSum);
    }

    public static void maxSumArray(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++) {
            for (int j=i; j<numbers.length; j++) {
                int currSum = 0;
                for (int k=i; k<=j; k++) {
                    currSum += numbers[k];
                }
                System.out.print(currSum + " ");
                maxSum = Math.max(maxSum, currSum);

            }
            System.out.println();
        }
        System.out.println(maxSum);
    }

    public static void prefixSumArraySelfMade(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for (int i=0; i<numbers.length; i++) {
            int currSum = 0;
            for (int j=i; j<numbers.length; j++) {
                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }

    public static void kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for (int i=0; i<numbers.length; i++) {
            currSum += numbers[i];
            if(currSum < 0) { currSum = 0;}
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max sum through kadane's algorithm is " + maxSum);

        // Extra -> make at starting part of function
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] < 0) {
                // return 1;
                maxSum = -1;

            } else {
                maxSum = Integer.MIN_VALUE;
                break;
            }
        }
        System.out.println("If all the numbers are negative maxsum is -1 let's verify -> " + maxSum);
    }

    // ---------< IMPORTANT >------------
    public static int trappedRainWater(int height[]) { //O(n)
        int n = height.length;
        // calculate left max boundary -> array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i=1; i<n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // calculate right max boundary -> array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        // Loop
        int trappedRainWater = 0;
        for (int i=0; i<n; i++) {
            // waterlevel = min(leftMaxbound - rightMaxbound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedRainWater += waterLevel - height[i];
        }
        System.out.println(trappedRainWater);
        return trappedRainWater;

    }
    // DSA Sheet #11
    public static int trappedRainWater1(int[] height) {
        int n = height.length;
        int res = 0, l = 0, r = n - 1;
        int rMax = height[r], lMax = height[l];

        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                res += rMax - height[r];
            }
        }
        return res;
    }

    public static int buyAndSellStocks(int prices[]){
        // You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize you profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
        int  buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;      // You can even write the Integer.MIN_VALUE but 0 is good rather than this because stock neither be negative;

        for (int i=0; i<prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                System.out.println("selling price: " +prices[i]+ " buyprice: " +buyPrice+ " profit= " +profit);
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    // DSA sheet #6
    public static int search(int[] nums, int target) {
        // min will have index of minimum element of nums
        int min = minSearch(nums);
        // find in sorted left
        if(nums[min] <= target && target <= nums[nums.length-1]){
            return search(nums, min, nums.length-1, target);
        } else {                                                    // find in sorted right
            return search(nums, 0, min, target);
        }
    }

    public static int search(int[] nums, int left, int right, int target) {
        int l = left;
        int r = right;
        // System.out.println(left+" "+right);
        while(1 <= r) {
            int mid = 1 + (r - 1)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
    // smallest element index
    public static int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (mid > 0 && nums[mid-1] > nums[mid]) {
                return mid;
            } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    // DSA Sheet #4
    public static boolean containsDuplicate(int nums[]) {
        boolean isrepeat = false;
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    isrepeat = true;
                }
            }
        }
        return isrepeat;
    }
    public static boolean containsDuplicate1(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length;){
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
    // DSA Sheet #8
    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for (int i=0; i<prices.length; i++) {
            if (buy < prices[i]) {
                profit = Math.max(profit, prices[i]-buy);
            } else {
                buy = prices[i];
            }
        }
        return profit;
    }
    // DSA Sheet #16
    public static List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);                   
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>>(result));
        return result;
    }
    public static void main(String args[]) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

        int[] heights = {2,5,0,5,0,2,4,0,3,0,1};
        System.out.println(trappedRainWater(heights));
    }
    
}
    // return new int[]{-1,-1};                         ...... Notable Property


        // int numbers[] = {2,4,6,8,10,12,14,16,18};
        // int key = 10;
        // int index = linearSearch(numbers, key);
        // System.out.println(index);
        // int marks[] = {95,97,98};
        // int unchangable = 5;
        // update(marks, unchangable);
        // System.out.println(unchangable);
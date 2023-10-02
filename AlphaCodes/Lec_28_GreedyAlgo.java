import java.util.*;
class GreedyAlgo {
    public static void ActivSelection() {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        int maxAct = 0;

        ArrayList<Integer> ans = new ArrayList<>();
        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 0; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // Activity Selection
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println(maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }

    public static void ActivSelectionSorting() {
        int start[] = { 0, 1, 3, 5, 8, 8 };
        int end[] = { 6, 2, 4, 7, 9, 9 };
        int maxAct = 0;

        // Sorting --> If the Activities is not end basis sorted
        int activities[][] = new int[end.length][3];
        for (int i = 0; i < activities.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // In Java, Comparator is an interface for sorting java objects // Lambda
        // Function -> shortform of a big function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = activities[0][0];
        // System.out.println(lastEnd);
        for (int i = 0; i < end.length; i++) {
            if (activities[i][0] >= lastEnd) {
                // Activity Select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println(maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }

    public static void knapsackProb() {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / weight[i];
        }

        // It's sorts in ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w, maxPrice = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                maxPrice += val[idx];
                capacity -= weight[idx];
            } else {
                // Fractional involvement
                maxPrice += (ratio[i][1] * capacity);
                break;
            }
        }
        System.out.println("Total price is " + maxPrice);
    }

    public static void minSumAbsDiff() { // TC -> O(n)
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minSum = 0;
        for (int i = 0; i < A.length; i++) {
            minSum += Math.abs((A[i] - B[i]));
        }
        System.out.println("The Minimum absolute difference: " + minSum);
    }

    public static void chainPairs() {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 29 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // end basis sorting

        int chainLen = 1;
        int chainEnd = pairs[0][1]; // Last selected pair end //chain end

        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Max length of chain: " + chainLen);
        System.out.println(chainEnd);
    }

    public static void indianCoins() {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();

        int countOfCoins = 0;
        int val = 590;

        for (int i = 0; i < coins.length; i++) {
            if (val >= coins[i]) {
                while (val >= coins[i]) {
                    countOfCoins++;
                    val -= coins[i];
                    ans.add(coins[i]);
                }
            }
        }

        System.out.println(countOfCoins);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }

    static class Job {
        int profit;
        int deadline;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void jobSequencing() {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i=0; i<jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);                  // descending order of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i=0; i<jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        // print seq
        System.out.println("max jobs = " + seq.size());
        int maxProfit = 0;
        for (int i=0; i<seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
            // maxProfit += jobsInfo[seq.get(i)][1];
        }
        System.out.println();
        System.out.println(maxProfit);
    }

    public static void chocolaProblem() {
        // int n = 4; int m = 6;
        Integer costVer[] = {3,1,4,1,2};
        Integer costHor[] = {4,1,2};                        

        Arrays.sort(costHor,  Comparator.reverseOrder());                       
        //shouldn't use primitive datatype of object for using collections or comparator
        Arrays.sort(costVer,  Collections.reverseOrder());

        int h=0, v=0, hp=1, vp=1, cost=0;
        while(h<costHor.length && v<costVer.length) {
            if (costHor[h] >= costVer[v]) {
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h<costHor.length) {
            cost += (costHor[h] * vp);
                hp++;
                h++;
        }
        while(v<costVer.length) {
            cost += (costVer[v] * hp);
                vp++;
                v++;
        }
        System.out.println("Max cost of cut is " + cost);
    }
    public static void main(String[] args) {
          chocolaProblem();
    }
}

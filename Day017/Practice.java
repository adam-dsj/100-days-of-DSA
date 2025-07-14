class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });
        for (int i = 0; i<intervals.length-1; i++) {
            if (intervals[i][1] > intervals[i+1][0]) {
                intervals[i+1][1] = intervals[i][1];
                res++;
            }
        }
    return res;
    }
}
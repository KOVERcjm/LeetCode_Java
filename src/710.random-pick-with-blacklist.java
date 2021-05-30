/*
 * @lc app=leetcode id=710 lang=java
 *
 * [710] Random Pick with Blacklist
 */

// @lc code=start
class Solution {
    private Map<Integer, Integer> map;
    private int size;

    public Solution(int n, int[] blacklist) {
        size = n - blacklist.length;
        map = new HashMap<>(blacklist.length);

        for (int i = 0; i < blacklist.length; i++)
            if (blacklist[i] < size)
                map.put(blacklist[i], -1);
            else
                map.put(blacklist[i], -2);

        int index = size;

        for (int i : map.keySet()) {
            while (map.containsKey(index)) {
                index++;
            }
            if (i < size)
                map.put(i, index++);
        }
    }

    public int pick() {
        Random random = new Random();
        int index = random.nextInt(size);

        return map.containsKey(index) ? map.get(index) : index;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n, blacklist);
 * int param_1 = obj.pick();
 */
// @lc code=end

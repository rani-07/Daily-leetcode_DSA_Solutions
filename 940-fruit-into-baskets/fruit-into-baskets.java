class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int max = 0;
        int k = 2;

        while (r < fruits.length) {

            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            if (map.size() > k) {
                map.put(fruits[l], map.get(fruits[l]) - 1);

                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }

                l++;
            }

            if (map.size() <= k) {
                max = Math.max(max, r - l + 1);
            }

            r++;
        }

        return max;
    }
}
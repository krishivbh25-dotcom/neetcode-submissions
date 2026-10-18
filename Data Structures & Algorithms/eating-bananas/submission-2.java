class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canFinish(piles, mid, h)) {
                high = mid;        // mid works, but a smaller k might too
            } else {
                low = mid + 1;     // mid is too slow
            }
        }
        return low;                // first feasible speed
    }

    private boolean canFinish(int[] piles, int k, int h) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;   // ceil(pile / k)
            if (hours > h) return false;   // early exit
        }
        return true;
    }
}
class Solution {
    public int numRollsToTarget(int n, int k, int target) {
		int MOD = 1000_000_000 + 7;
		int[] dp1 = new int[target + 1];
		int[] dp2 = new int[target + 1];
		dp1[0] = 1;
		for (int i = 1; i <= n; i++) {
			int prev = dp1[0];
			for (int j = 1; j <= target; j++) {
				dp2[j] = prev;
				prev = (prev + dp1[j]) % MOD;
				if (j >= k) {
					prev = (prev - dp1[j - k] + MOD) % MOD;
				}
			}
			int[] temp = dp1;
			dp1 = dp2;
			dp2 = temp;
			dp2[0] = 0;
		}
		return dp1[target];
	}
}


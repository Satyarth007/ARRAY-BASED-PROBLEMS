class Solution {
    public int leastInterval(char[] tasks, int n) {
       int f[]=new int[26];
		for(char e:tasks) f[e-'A']++;
		Arrays.sort(f);
		int chunk = f[25]-1;
		int idleSpot=chunk * n;
		for( int i=24;i>=0;i--) idleSpot -= Math.min(chunk, f[i]);
        return idleSpot<0 ? tasks.length : idleSpot+tasks.length;
		
    }
}

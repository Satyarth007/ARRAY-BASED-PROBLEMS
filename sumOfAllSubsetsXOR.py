class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        n = len(nums)
        l = [[]]
        for i in range(n):
            size = len(l)
            for j in range(size):
               subset = l[j].copy()
               subset.append(nums[i])
               l.append(subset)
        sum=0
        for i in range(1,len(l)):
            xor=0
            for j in range(0,len(l[i])):
                xor= xor ^ l[i][j]
            sum+=xor
        return sum 

class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        n=0
        for i in num: n=n*10+i
        ans=[]
        for i in str(n+k): ans.append(int(i))    
        return ans

class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        m=-1
        n=len(arr)
        for i in range(n-1, -1, -1):
            temp=arr[i]
            arr[i]=m
            m=max(m, temp)
        return arr           

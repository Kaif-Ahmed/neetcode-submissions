class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        leftProduct, rightProduct = 1, 1
        result = [1] * len(nums)
        for i in range(len(nums)):
            result[i] = leftProduct
            leftProduct *= nums[i]
        
        for i in range(len(nums)-1, -1, -1):
            result[i] *= rightProduct
            rightProduct *= nums[i]
        
        return result
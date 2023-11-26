class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numIndices = HashMap<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (numIndices.containsKey(complement)) {
                return intArrayOf(numIndices[complement]!!, i)
            }
            numIndices[nums[i]] = i
        }
        return intArrayOf()
    }
}

fun main() {
    val solution = Solution()
    val nums = intArrayOf(11, 15, 2, 9)
    val target = 9
    val result = solution.twoSum(nums, target)
    println(result.contentToString())
}
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numIndices = HashMap<Int, Int>()
        for (i in nums.indices) {
            val indikator=nums[i]
            val complement = target - nums[i]
            val indikator3 = numIndices.containsKey(complement)
            if (numIndices.containsKey(complement)) {
                val indikator2 = intArrayOf(numIndices[complement]!!, i)
                return intArrayOf(numIndices[complement]!!, i)
            }
            numIndices[nums[i]] = i
        }
        return intArrayOf()
    }
}

fun main() {
    val solution = Solution()
    val nums = intArrayOf(11, 15, 2, 7)
    val target = 9
    val result = solution.twoSum(nums, target)
    println(result.contentToString())
}
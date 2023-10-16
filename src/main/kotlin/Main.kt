class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
                for (i in 0 until nums.size - 1) {
                        for (j in i + 1 until nums.size) {
                                if (nums[i] + nums[j] == target) {
                                        return intArrayOf(i, j)
                                }
                        }
                }
                // Если не найдено совпадение, вернуть пустой массив или бросить исключение, в зависимости от требований задачи.
                return intArrayOf()
        }
}

fun main() {
        val solution = Solution()
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val result = solution.twoSum(nums, target)
        println(result.contentToString())
}
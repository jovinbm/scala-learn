def containsNeg(nums: List[Int]): Boolean = {
  var exists = false;
  for (num <- nums)
    if (num < 0)
        exists = true
  exists
}

containsNeg(List(1,2,3,4))
containsNeg(List(1,2,-3,4))

def containsNeg2(nums: List[Int]): Boolean = nums.exists(_ < 0)

containsNeg(Nil)
containsNeg(List(0, -1, -2))
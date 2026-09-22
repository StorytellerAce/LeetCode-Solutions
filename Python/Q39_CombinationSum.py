def combinationSum(self, candidates, target):
    """
    :type candidates: List[int]
    :type target: int
    :rtype: List[List[int]]
    """
    allResults = []
    self.combinationHelper(candidates, target, [], allResults, 0)
    return allResults

def combinationHelper(self, candidates, target, currentResult, allResults, startIndex):
    if (target == 0):
        allResults.append(currentResult[:])
        return
    
    if (target < 0):
        return None
    
    for i in range(startIndex,len(candidates)):
        currentResult.append(candidates[i])
        self.combinationHelper(candidates, target - candidates[i], currentResult, allResults, i)
        currentResult.pop()
    
    
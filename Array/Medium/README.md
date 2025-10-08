# 🧩 Array – Medium Level Problems
---

## 🔥 Problem List

### 1. 2 Sum Problem  
**Approach:** Use a hashmap to store complement values (`target - nums[i]`).  
**Trick:** When complement exists, you’ve found the pair in O(n).  
**Pattern:** Hashmap / Two Pointer  

---

### 2. Sort an array of 0’s 1’s and 2’s  
**Approach:** Dutch National Flag Algorithm — use three pointers (`low`, `mid`, `high`). 
**Revision:** low to maintain 0 , mid to traverse and high to maintain 2 apperances  
**Trick:** Swap elements in-place to partition 0s, 1s, and 2s.  
**Pattern:** Three Pointer / Partitioning  

---

### 3. Majority Element (> n/2 times)  
**Approach:** Moore’s Voting Algorithm Play with count.  
**Trick:** Cancel out different elements, remaining is majority.  
**Pattern:** Counting / Greedy  

---

### 4. Kadane’s Algorithm – Maximum Subarray Sum  
**Approach:** Keep track of current sum and max sum; reset if sum < 0 put the sum back to zero.  
**Trick:** Dynamic tracking — reset when sum turns negative.  
**Pattern:** Kadane’s / Dynamic Programming  

---

### 5. Print Subarray with Maximum Subarray Sum (Extended Kadane)  
**Approach:** Use Kadane’s but also store start and end indices.  
**Trick:** Capture subarray boundaries while computing max sum.  
**Pattern:** Kadane’s with Index Tracking  

---

### 6. Stock Buy and Sell  
**Approach:** Track minimum price so far and compute max profit.  
**Trick:** Update min price dynamically; profit = price - min.  
**Pattern:** Greedy / One Pass  

---

### 7. Rearrange Array in Alternating Positive and Negative Items  
**Approach:** Separate positives and negatives, then merge alternately track k for positive , k=k+2 , and j for negative j=j+2 .  
**Trick:** Maintain two lists and interleave their elements.  
**Pattern:** Two Pointer / Reordering  

---

### 8. Next Permutation  
**Approach:** Find first decreasing element from right, swap with just greater, reverse suffix.  
**Trick:** Reverse the right part to get smallest lexicographic arrangement.  
**Pattern:** Lexicographical Ordering / Math  

---

### 9. Leaders in an Array  
**Approach:** Traverse from right; keep track of max so far.  
**Trick:** Every element greater than maxRight is a leader.  
**Pattern:** Reverse Traversal / Greedy  

---

### 10. Longest Consecutive Sequence in an Array  
**Approach:** Use HashSet; start only from sequence beginnings.  
**Trick:** If (num-1) not in set, it’s start of a new sequence.  
**Pattern:** Hashing / Sequence Detection  

---

### 11. Set Matrix Zeros  
**Approach:** Mark rows and columns first, then update to zero.  
**Trick:** Use dummy arrays or first row/col as markers for O(1) space.  
**Pattern:** Matrix Manipulation  

---

### 12. Rotate Matrix by 90 Degrees  
**Approach:** Transpose the matrix, then reverse each row.  
**Trick:** In-place rotation using simple transformations.  
**Pattern:** Matrix Rotation / Transpose  

---

### 13. Print the Matrix in Spiral Manner  
**Approach:** Maintain four pointers (top, bottom, left, right). Traverse layer by layer.  
**Trick:** Shrink the boundaries after each direction traversal.  
**Pattern:** Boundary Traversal / Simulation  

---

### 14. Count Subarrays with Given Sum (Subarray Sum = K)  
**Approach:** Use prefix sum + hashmap to count frequency of sums.  
**Trick:** If (sum - k) exists, subarray with target sum found.  
**Pattern:** Prefix Sum / Hashmap  

---

## ⚙️ Common Patterns in Medium Array Problems

| Pattern | Used In | Core Idea |
|----------|----------|-----------|
| **Two / Three Pointer** | 2 Sum, Sort 0-1-2, Rearrange ± | Efficient traversal or partitioning using relative pointers. |
| **Kadane’s Algorithm** | Maximum Subarray, Print Max Subarray | Dynamic approach for continuous sum problems. |
| **Prefix Sum + Hashmap** | Subarray Sum = K | O(n) detection of subarrays with target sum. |
| **Matrix Traversal** | Rotate, Spiral, Set Matrix Zeros | Layered or in-place transformations. |
| **Greedy** | Stock Buy & Sell, Leaders in Array | Make locally optimal choices for global results. |
| **HashSet / HashMap** | Longest Consecutive Sequence, 2 Sum | Constant time lookups for relationship-based problems. |
| **Lexicographical Manipulation** | Next Permutation | Swap and reverse logic to get next order. |

---

## 💡 Quick Recognition Tips

| If question says... | Think of... |
|----------------------|-------------|
| “Find pair/subarray with sum = k” | Hashmap or Prefix Sum |
| “Arrange / Partition / Segregate elements” | Two or Three Pointer |
| “Matrix traversal / rotation” | Simulation or Transpose-Reverse |
| “Maximum sum / subarray” | Kadane’s Algorithm |
| “Profit or maximum difference” | Greedy / One-pass |
| “Next greater / rearrange sequence” | Lexicographical pattern |

---

## 🧠 Pro Tip  
Before coding, always **identify the pattern** —  
> “What known concept does this resemble?”  
Recognizing the pattern early saves half your solving time!

---


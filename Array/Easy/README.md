# 🚀 Array Problem Tricks & Approaches

A quick revision guide covering common array problems 
---

## 🟢 Easy Level

### 1. Largest Element in an Array

💡 **Approach:** Traverse once, track `max`.

🧠 **Intuition:** Compare each element with current max and update.

⚙️ `max = Math.max(max, arr[i])`

---

### 2. Second Largest Element (Without Sorting)

💡 **Approach:** Keep two variables — `largest` and `secondLargest`.

🔗 **Key concept:** Before updating arr[i] as largest , update secondlargest=largest 

🧠 **Intuition:** Update both as you traverse — when a new max appears, shift the old max down.

⚙️ Handle edge cases (all same values).

---

### 3. Check if Array is Sorted

💡 **Approach:** Compare each element with the next.

🧠 **Intuition:** If any `arr[i] > arr[i+1]`, not sorted.

🔗 **Advancement Question:** If the array is both sorted and rotated : Keep count of 
nums[i]>nums[i+1] if count = 1 its sorted and rotated as well, 

⚙️ Works for ascending/descending check with simple change.

---

### 4. Remove Duplicates from Sorted Array

💡 **Approach:** Two-pointer technique (`i` for result, `j` for scan).

🔗 **Trick:** Maintain two pointer one for normal tranversal and one with duplicates second apperance

🧠 **Intuition:** Place unique elements towards front as we scan sorted array.

⚙️ In-place operation — O(1) space.

---

### 5. Left Rotate Array by One Place

💡 **Approach:** Store first element, shift all left by 1, put stored element at end.

🧠 **Intuition:** Think of it as a circular queue.

---

### 6. Left Rotate Array by D Places

💡 **Approach 1:** Use temp array for first D elements.

💡 **Approach 2 (Optimized):** **Reverse algorithm**  
   - Reverse first,D
   - Reverse last N-D  
   - Reverse whole array
     
🧠 **Intuition:** Reversal rearranges order effectively in-place.

---

### 7. Move Zeros to End

💡 **Approach:** Two-pointer swap.

🧠 **Intuition:** Keep track of position to place next non-zero; swap when found.

⚙️ In-place, stable.

---

### 8. Linear Search

💡 **Approach:** Iterate through array, match target.

🧠 **Intuition:** Direct search — O(N).

⚙️ Base for binary search comparison.

---

### 9. Find the Union of Two Arrays

💡 **Approach:** Use **Set** (unique elements) or Use **two pointer Approach**.  

🧠 **Intuition:** Union = all distinct elements from both arrays.

⚙️ Time: O(n + m)

---

### 10. Find Missing Number in an Array

💡 **Approach 1:** Use **Sum formula** — `n*(n+1)/2 - actual_sum`.

💡 **Approach 2:** Use **XOR** — `1^2^...^n ^ arr[0]^arr[1]^...` Remember that xor will keep only non duplicate in final array 

🧠 **Intuition:** XOR cancels duplicates automatically.

---

### 11. Maximum Consecutive Ones

💡 **Approach:** Count consecutive 1s using simple loop.

🧠 **Intuition:** If `num == 1` → `count++`, else reset count back to `0` and track `max`.

---

### 12. Find the Number Appearing Once (Others Twice)

💡 **Approach:** Use **XOR of all elements**.

🧠 **Intuition:** `a^a=0`, so pairs vanish, leaving unique element.

--- 

Learn to **recognize problem types**:
- *Search / Max / Count* → Linear traversal  
- *Remove / Shift / Rotate* → Two pointers  
- *Sum / Subarray* → Prefix sum or sliding window  

---


🧠 *"Don’t just solve problems — extract patterns."*  
That’s how you build real DSA intuition 

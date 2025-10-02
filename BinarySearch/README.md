# 🔎 Binary Search Revision and Cheat Sheet for Patterns  

Binary Search is not just about searching elements in sorted arrays.  
In placements and interviews, it appears in many tricky variations.  
Here’s a cheat sheet of **Binary Search patterns & how to recognize them.**

---

## 1. Classic Binary Search
- 👉 Used when the array is sorted and you need to find an element.  
- ✅ Condition: array sorted ascending/descending.  
- ⏱ Time Complexity: **O(log n)**  
- 📌 Example: **Search element in sorted array** (LeetCode 704).  

---

## 2. Boundary Binary Search (First/Last Occurrence)
- 👉 Used when asked to find **first/last occurrence, floor/ceil, leftmost/rightmost index**.  
- ✅ Trick: Move search boundaries when equal found (don’t stop immediately).  
- 📌 Example: **First and Last Position in Sorted Array** (LeetCode 34).  

---

## 3. Binary Search on Answer
- 👉 When the search space is not an array but a **possible range of answers**.  
- ✅ Idea: Guess an answer (`mid`), check feasibility → move range accordingly.  
- ⚡ Common in **optimization problems**.  
- 📌 Examples:  
  - Aggressive Cows (SPOJ)  
  - Book Allocation Problem  
  - Split Array Largest Sum (LeetCode 410)  

---

## 4. Rotated / Modified Binary Search
- 👉 Used when the array is **sorted but rotated (shifted)**.  
- ✅ Trick: One half is always sorted → check which half to move.  
- 📌 Examples:  
  - Search in Rotated Sorted Array (LeetCode 33)  
  - Find Minimum in Rotated Sorted Array (LeetCode 153)  

---

## 5. Binary Search in 2D / Matrix
- 👉 Used when **matrix rows/columns are sorted**.  
- ✅ Trick: Treat matrix as 1D (index conversion) OR start from top-right corner.  
- 📌 Examples:  
  - Search a 2D Matrix I (LeetCode 74)  
  - Search a 2D Matrix II (LeetCode 240)  

---

## 6. Binary Search with Condition Check (Predicate)
- 👉 General form:  
  ```java
  while (low < high) {
      int mid = (low + high) / 2;
      if (predicate(mid)) 
          high = mid;   // condition true → move left
      else 
          low = mid + 1; // condition false → move right
  }


<h2>How to Recognize Which Binary Search to Use</h2>

- Is the array sorted? → Classic Binary Search

- Do we need first/last/floor/ceil? → Boundary Binary Search

- Is the problem optimization (min/max value)? → Binary Search on Answer

- Is the array rotated? → Modified Binary Search

- Is it a matrix with sorted rows/cols? → Matrix Binary Search

- Does the problem ask for minimum x or maximum x satisfying condition? → Predicate Binary Search

<h1>Basics of Striver Sheet</h1>


<h2> Time Complexity </h2>

The rate at which the time, required to run a code, changes with respect to the input size, is considered the time complexity. Basically, the time complexity of a particular code depends on the given input size, not on the machine used to run the code.

<h2> Space Complexity </h2>

Space complexity generally represents the summation of auxiliary space and the input space. Auxiliary space refers to the space that we use additionally to solve a problem. And input space refers to the space that we use to store the inputs


# Quick Revision Sheet — Basic Number Problems 

Tiny shortcuts & formulas to recall logic — not full code.

---

### 1️⃣ Count Digits

* Loop / log10 / convert to string.
* `while(n>0){n/=10;count++;}`
* Edge: `0 → 1 digit`

### 2️⃣ Reverse a Number

* Extract digit → `rev = rev*10 + n%10`
* Divide by 10 each step.
* Edge: check for overflow (Java)

### 3️⃣ Check Palindrome

* Compare number with its reverse or string == reversed string.
* Negative → false.

### 4️⃣ GCD / HCF

* Euclid algo → `gcd(a,b)=gcd(b,a%b)` until `b==0`.
* Complexity → O(log(min(a,b)))

### 5️⃣ Armstrong Number

* Count digits `d` → sum of each digit^d == number.
* Example → 153 → 1³+5³+3³=153.

### 6️⃣ Print All Divisors

* Loop i=1→√n; if `n%i==0` add i and n/i.
* Edge: avoid duplicate for perfect square.

### 7️⃣ Check Prime

* n ≤ 1 → not prime.
* Check divisibility till √n.
* Optimize using 6k ± 1 steps.

---

# Recursion 

Tiny logic recalls for recursion-based problems — short & to the point.

---

### 1️⃣ Print Something N Times

* Base: if i>n → return.
* Print → call next.
* `print(i); recurse(i+1, n)`

### 2️⃣ Print Name N Times

* Same as above → just print name instead of i.
* `if(i>n) return; print("Name"); recurse(i+1, n)`

### 3️⃣ Print 1 to N

* Base: if i>n return.
* Print i → call next.
* Output in increasing order.

### 4️⃣ Print N to 1

* Base: if n<1 return.
* Print → recurse(n-1)
* Output in decreasing order.

### 5️⃣ Sum of First N Numbers

* Base: if n==0 return 0.
* Return n + sum(n-1).
* Or use formula: n*(n+1)/2 (iterative shortcut).

### 6️⃣ Factorial of N

* Base: if n==0 or n==1 → return 1.
* Return n * fact(n-1).

### 7️⃣ Reverse an Array (Recursively)

* Swap arr[i], arr[n-i-1].
* Base: if i>=n/2 return.
* Recurse with i+1.

### 8️⃣ Check if String is Palindrome

* Base: if l>=r → true.
* If s[l]!=s[r] → false.
* Recurse(l+1, r-1).

### 9️⃣ Fibonacci Number

* Base: fib(0)=0, fib(1)=1.
* Return fib(n-1)+fib(n-2).
* Exponential O(2ⁿ) → optimize with DP (memoization).

---

### ⚡ Key Recursion Tips

* Always define **base case** clearly.
* Work towards base → avoid infinite recursion.
* Use stack flow logic: function calls push & pop.
* Tail recursion → last call is the recursive one.

---




# 🧩 Java Collection Framework – Complete Notes

This repository contains my detailed notes and explanations of the **Java Collection Framework**, one of the most important topics for Java interviews and backend development.  
It covers core concepts, internal working, and differences between various collection classes and interfaces.

---

## 🚀 Introduction

**Collection Framework** in Java is a unified architecture that provides a set of classes and interfaces in the `java.util` package to **store, manipulate, and process groups of objects** efficiently.

It includes:
- **Interfaces** – Define abstract data types (List, Set, Queue, Map, etc.)
- **Classes** – Provide concrete implementations (ArrayList, HashSet, HashMap, etc.)
- **Algorithms** – Utility methods for sorting, searching, reversing, etc. (via `Collections` class)

---

## 🧠 Why Collection Framework?

- Arrays are **fixed in size**, and do not provide built-in methods for searching, sorting, etc.  
- Collection Framework provides **dynamic data structures** and **ready-to-use algorithms**.  
- It reduces development time, increases performance, and standardizes data manipulation.

---

## 🏗️ Core Interfaces

| Interface | Description | Allows Duplicates | Maintains Order |
|------------|--------------|-------------------|----------------|
| **List** | Ordered collection of elements. | ✅ Yes | ✅ Yes |
| **Set** | Unordered collection of unique elements. | ❌ No | ❌ (except LinkedHashSet, TreeSet) |
| **Queue** | Used for elements in a FIFO (First-In-First-Out) order. | ✅ Yes | ✅ Yes |
| **Map** | Key-value pairs. Keys are unique. | ❌ (for keys) | Depends on implementation |

---

## 🧩 Key Interfaces and Classes

### 1. **List Interface**
- **Implements**: ArrayList, LinkedList, Vector (Stack)
- **Allows duplicates**
- **Maintains insertion order**

#### 🔹 ArrayList
- Elements stored **contiguously** (like arrays)
- **Dynamic in size** (default capacity = 10, grows by 1.5x)
- **Fast** for random access (`O(1)`), **slow** for insertion/deletion (`O(n)`)

#### 🔹 LinkedList
- Elements stored as **nodes** (data + reference)
- **Fast** for insertion/deletion (`O(1)`), **slow** for random access (`O(n)`)

#### 🔹 Vector
- Synchronized version of ArrayList (thread-safe)
- Grows by **2x** when full

#### 🔹 Stack
- Extends Vector
- Follows **LIFO** (Last-In-First-Out)
- Methods: `push()`, `pop()`, `peek()`

---

### 2. **Set Interface**
- **Does not allow duplicates**
- **No defined order** (depends on implementation)

#### 🔹 HashSet
- Based on **HashMap**
- **Does not maintain order**
- **Allows one null** element
- **Time complexity:** O(1) for insertion, deletion, lookup

#### 🔹 LinkedHashSet
- Maintains **insertion order**
- Based on **LinkedHashMap**

#### 🔹 TreeSet
- Based on **Red-Black Tree**
- Stores elements in **sorted order**
- **Does not allow null values**

---

### 3. **Queue Interface**
- Used for elements that follow **FIFO** order
- Implementations: **PriorityQueue**, **ArrayDeque**

#### 🔹 PriorityQueue
- Elements ordered based on **priority (natural ordering or custom comparator)**
- **Null elements not allowed**

#### 🔹 ArrayDeque
- Supports both **stack** and **queue** operations
- Faster than Stack and LinkedList

---

### 4. **Map Interface**
- Stores data as **key-value pairs**
- **Keys are unique**, **values can be duplicated**
- **Does not extend Collection interface**

#### 🔹 HashMap
- Based on **hashing**
- **Allows one null key**, multiple null values
- **Not synchronized** (not thread-safe)
- **Time complexity:** O(1) average for CRUD operations

#### 🔹 LinkedHashMap
- Maintains **insertion order**
- Slightly slower than HashMap

#### 🔹 TreeMap
- Based on **Red-Black Tree**
- **Sorted** according to keys (natural/comparator)
- **Does not allow null keys**

#### 🔹 Hashtable
- Synchronized version of HashMap
- **No null key or value allowed**
- Thread-safe but slower

---

## ⚙️ Iteration Methods

| Method | Interface | Direction | Notes |
|---------|------------|------------|-------|
| **Iterator** | All Collection classes | Forward only | Supports `remove()` |
| **ListIterator** | List only | Forward & backward | Supports modification during iteration |
| **Enumeration** | Legacy classes like Vector | Forward only | Read-only traversal |

---

## 🧩 Difference Between Collection and Collections

| Collection | Collections |
|-------------|--------------|
| Interface (root of the hierarchy) | Utility class (helper methods) |
| Found in `java.util.Collection` | Found in `java.util.Collections` |
| Defines behavior of data structures | Provides static methods like `sort()`, `reverse()`, `min()`, `max()` |

---

## ⚡ Internal Working of HashMap (Simplified)

1. HashMap uses an **array of buckets** where each bucket stores a **LinkedList (or TreeNode)** of key-value pairs.
2. When a key is inserted:
   - Its **hash code** is calculated.
   - The **index** is determined as `hash % capacity`.
   - If a collision occurs (same index), it is stored as a linked list or converted to a tree if collisions > 8.
3. From Java 8 onwards, HashMap switches from LinkedList to **Balanced Tree (Red-Black Tree)** when buckets become too large.

---

## 📊 Performance Summary

| Collection Type | Best For | Not Good For | Time Complexity (avg) |
|------------------|----------|---------------|----------------|
| **ArrayList** | Random access | Frequent insert/delete | O(1) |
| **LinkedList** | Insert/delete | Random access | O(1) |
| **HashSet** | Unique items | Maintaining order | O(1) |
| **TreeSet** | Sorted data | Random access | O(log n) |
| **HashMap** | Key-value access | Thread safety | O(1) |
| **TreeMap** | Sorted map | Frequent rebalancing | O(log n) |

---

## 💡 Common Interview Questions

1. What is the Collection Framework in Java?  
2. Difference between Collection and Collections?  
3. Difference between List, Set, Queue, and Map?  
4. How does HashMap work internally?  
5. Why HashMap allows one null key but multiple null values?  
6. Difference between HashMap and Hashtable?  
7. Difference between ArrayList and LinkedList?  
8. How does TreeSet maintain order?  
9. Difference between HashSet and TreeSet?  
10. What are fail-fast and fail-safe iterators?

---


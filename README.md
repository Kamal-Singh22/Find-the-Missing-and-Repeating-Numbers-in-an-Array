# Find-the-Missing-and-Repeating-Numbers-in-an-Array
You are given an unsorted array of size n containing integers in the range 1 to n. One number is repeated, and one number is missing. Your task is to find both the missing and repeating numbers.
Example:
Input:
arr = [4, 3, 6, 2, 1, 1]
Output:
Missing: 5, Repeating: 1
Input:
arr = [3, 1, 2, 3]
Output:
Missing: 4, Repeating: 3

Explanation of the Approach:
Count Frequencies:

Use an array to count how many times each number from 1 to n appears in the input.
Detect Missing and Repeating:

If a number is missing, its frequency will be 0.
If a number is repeated, its frequency will be 2.
Efficiency:

Time Complexity: O(n)
Space Complexity: O(n)

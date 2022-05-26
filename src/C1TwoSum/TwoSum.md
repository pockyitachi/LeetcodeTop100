# Two Sum
## Question
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
## Brute Force
Use a nested for loop, i = 0 -> selected ele, j = i + 1 -> select the target remain.

Return i, j as the result.
TC: O(n^2) -> Time consuming
SC: O(1)

## Hashmap
Implement a Hashmap, key -> the ele val, value -> the index

Search in a for loop, pick from the first ele, check if the target remain inside the map 


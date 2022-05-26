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
HashMap<key, value>, both key and value are Integer type.
target remain -> casting to Integer

TC: O(n) SC: O(n)
### One - Pass
Implement a Hashmap, key -> the ele val, value -> the index

Search in a for loop, pick from the first ele, check if the target remain inside the map

if yes -> return the value(index) and current i.

if not -> add array[i] as key, index as value.

### Two - Pass
Add all the elements from the array into the Hashmap

Search inside a for loop, pick one and check if the target remain is inside the map

if yes -> return the value(index) and current i.

if not -> do nothing.
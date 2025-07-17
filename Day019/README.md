
## Day 19 - July 16, 2025

**Today's Progress**: Solved [Spiral Matrix] problem

**Thoughts**: I applied a greedy algorithm by first sorting the intervals based on their end times. This made it easier to select non-overlapping intervals while minimizing removals. As I iterated through the list, I compared the start of the current interval with the end of the last selected one. If they overlapped, I skipped the current interval and increased the removal count. This approach ensures that I always keep the interval that ends the earliest, leaving more room for subsequent ones. While the time complexity is already efficient at O(n log n) due to sorting, there's still room for optimization in implementation or edge case handling.

**Link to problem**: https://leetcode.com/problems/spiral-matrix




/*Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle. In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
 

Constraints:

0 <= rowIndex <= 33
 

Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?

*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        // Initialize the row with 1
        row.add(1);
        
        // Calculate each value in the row
        for (int i = 1; i <= rowIndex; i++) {
            // Add the new element by calculating from the back to avoid overwriting
            row.add((int)((long) row.get(i - 1) * (rowIndex - i + 1) / i));
        }
        
        return row;
    }
}

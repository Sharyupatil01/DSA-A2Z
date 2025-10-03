package Stack;

import java.util.Stack;

public class LargestRectangleinHistogram {
    
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            // If i == n, treat height as 0 to clear stack at the end
            int currHeight = (i == n) ? 0 : heights[i];

            // If current bar is smaller than top of stack, calculate area
            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i; // whole range till current i
                } else {
                    width = i - stack.peek() - 1; 
                }
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights));
    }
}

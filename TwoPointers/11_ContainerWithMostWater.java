package TwoPointers;

class Solution {
    public int maxArea(int[] height) {
        int tower1 = 0;
        int tower2 = height.length - 1;
        int area = 0;
        while(tower1 < tower2){
            int width = tower2 - tower1;
            int currArea = Math.min(height[tower1], height[tower2]) * width;
            area = Math.max(currArea,area);
            if(height[tower1] < height[tower2]){
                tower1++;
            }
            else{
                tower2--;
            }
        }
        return area;
    }
}
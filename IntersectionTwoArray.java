package com.miu;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionTwoArray {
        public static int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map = new HashMap<>();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i : nums1){
                int freq = map.getOrDefault(i, 0);
                map.put(i, freq + 1);
            }

            for(int i : nums2){
                if(map.get(i) != null && map.get(i) > 0){
                    arr.add(i);
                    map.put(i, map.get(i) - 1);
                }
            }
            int[] result = new int[arr.size()];
            for(int i=0; i<arr.size(); i++){
                result[i]=arr.get(i);
            }

            return result;
        }

    public static void main(String[] args) {
        System.out.println(intersect(new int[]{1,2,2,1},new int[]{2,2}));
    }
}

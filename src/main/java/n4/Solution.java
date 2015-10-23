package n4;

public class Solution { //NG

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        if (totalLength % 2 == 0) {
            return (findKthIn(nums1, 0, nums1.length, nums2, 0, nums2.length, totalLength / 2).value + findKthIn
                    (nums1, 0, nums1.length, nums2, 0, nums2.length, totalLength / 2 + 1).value) / 2;
        } else {
            return findKthIn(nums1, 0, nums1.length, nums2, 0, nums2.length, totalLength / 2 + 1).value;
        }

    }

    private Entry findKthIn(int[] nums1, int nums1Begin, int nums1End, int[] nums2, int nums2Begin, int nums2End, int
            k) {
        if (nums1Begin >= nums1End) {
            return new Entry(false, 0);
        }
        if (nums2Begin >= nums2End) {
            return new Entry(false, 0);
        }
        int middleIndex1 = (nums1Begin + nums1End) / 2;

        int nearestIndexIn2 = findNearestIndex(nums2, nums2Begin, nums2End, nums1[middleIndex1]);
        int rankIn2 = -1;
        if (nearestIndexIn2 < nums2Begin) {
            rankIn2 = 0;
        } else if (nearestIndexIn2 == nums2End) {
            rankIn2 = nums2End - nums2Begin;
        } else {
            if (nums2[nearestIndexIn2] == nums1[middleIndex1]) {
                rankIn2 = nearestIndexIn2 - nums2Begin;
            } else {
                rankIn2 = nearestIndexIn2 - nums2Begin + 1;
            }

        }
        int totalRank = middleIndex1 + 1 + rankIn2;

        if (totalRank == k) {
            return new Entry(true, nums1[middleIndex1]);
        }

        if (totalRank < k) {
//            findKthIn(nums1, middleIndex1, nums1End, num2, )
        }


        return new Entry(false, 0);
    }

    public int findNearestIndex(int[] nums, int from, int to, int num) {
        int beg = from;
        int end = to;
        while (end - beg >= 2) {
            int mid = (beg + end) / 2;
            if (nums[mid] == num) {
                return mid;
            }
            if (nums[mid] < num) {
                beg = mid + 1;
            } else {
                end = mid;
            }
        }
        if (beg >= to) {
            return to;
        }
        if (end < from) {
            return from - 1;
        }
        if (num < nums[beg]) {
            return beg - 1;
        }
        if (num > nums[end]) {
            return end;
        }
        return beg;
    }


    // [1, 3, 4, 5]
    //  find 1 return 0
    //  find 2 return 0
    // find 3 return 1
    // find 0 return 0
    // find 6 return 4

    private static class Entry {
        boolean found;
        int value;
        Entry(boolean found, int value) {
            this.found = found;
            this.value = value;
        }
    }
}
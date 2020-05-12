package com.benonshi.sort;

/**
 * 冒泡排序
 *
 * @author BenOniShi
 * @date 2020/3/8 16:40
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 9, 4, 1, 7, 3, 8};
        int n = arr.length;

        // sorted 为 false  sorted 置为 true  为真   n --
        for (boolean sorted = false; sorted = !sorted; n--) {
            // 内层循环从 1 开始  i < 数组长度  i ++
            for (int i = 1; i < n; i++) {
                // 如果 i -1 位置 大于  i  交换  并且将 sorted 置为 false
                if (arr[i - 1] > arr[i]) {
                    SortUtils.swap(arr, i, i - 1);
                    sorted = false;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


//        for (int i = arr.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] > arr[i]) {
//                    SortUtils.swap(arr, i, j);
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[i]) {
//                    SortUtils.swap(arr, i, i - 1);
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}

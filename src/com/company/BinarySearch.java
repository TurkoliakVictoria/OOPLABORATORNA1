package com.company;

public class BinarySearch {
    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        int min = 0, max = data.length - 1;

        while (true)
        {
            int mid = min + (max - min) / 2;
            if (data[mid] > numberToFind)

                max = mid - 1;

            else if (data[mid] < numberToFind)

                min = mid + 1;

            else
            {
                System.out.println(mid);
                break;
            }

            if (max == min)
            {
                if (data[max] == numberToFind)

                    System.out.println(max);

                else

                    System.out.println(-1);

                break;
            }
        }
    }
}

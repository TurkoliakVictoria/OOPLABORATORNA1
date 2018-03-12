package com.company;

public class MatrixPrint {
    public static void main(String args[]){
        int size = 5;

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {

                if (j == i || j == size - (1 +i))
                {
                    System.out.print(' ');
                    System.out.print('*');
                }
                else
                {
                    if ((size * i + j + 1)< 10)
                        System.out.print(' ');
                    System.out.print(size * i + j +1);
                }

                System.out.print(' ');
            }
            System.out.println();
        }
    }
}

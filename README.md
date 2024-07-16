2D Arrays in Java
Welcome to the 2D Arrays in Java repository! This project contains Java programs and examples related to 2D arrays, including common operations and problems such as transposing a matrix and printing a matrix in spiral order.

Table of Contents
Introduction
Setup
Examples
Creating a 2D Array
Transposing a Matrix
Printing a Matrix in Spiral Order
Contributing
License
Introduction
This repository provides a comprehensive guide to working with 2D arrays in Java. It covers the basics of creating and manipulating 2D arrays and includes solutions to common problems.

Setup
To run the examples in this repository, you need to have Java installed on your machine. Follow these steps to set up your environment:

Download and install Java.
Clone this repository:
bash
Copy code
git clone https://github.com/yourusername/2d-arrays-in-java.git
Navigate to the project directory:
bash
Copy code
cd 2d-arrays-in-java
Compile the Java files:
bash
Copy code
javac src/*.java
Run the examples:
bash
Copy code
java src.Main
Examples
Creating a 2D Array
Here's how to create a 2D array in Java:

java
Copy code
public class Main {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Printing the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
Transposing a Matrix
Transposing a matrix involves swapping the rows and columns of the matrix. Here's a Java program to transpose a matrix:

java
Copy code
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transposed = transpose(matrix);

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
Printing a Matrix in Spiral Order
Printing a matrix in spiral order involves traversing the matrix in a spiral pattern. Here's a Java program to print a matrix in spiral order:

java
Copy code
public class SpiralOrder {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Spiral Order:");
        printSpiralOrder(matrix);
    }

    public static void printSpiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
Contributing
Contributions are welcome! Please open an issue or submit a pull request if you have any improvements or new examples to add.

License
This project is licensed under the MIT License. See the LICENSE file for details.


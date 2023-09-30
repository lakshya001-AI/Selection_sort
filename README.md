# Selection Sort in Java

This repository contains a simple Java implementation of the Selection Sort algorithm. Selection Sort is a basic sorting algorithm that works by repeatedly selecting the minimum element from an unsorted part of the array and putting it at the beginning. This process is repeated until the entire array is sorted.

## Table of Contents

- [Algorithm Description](#algorithm-description)
- [Usage](#usage)
- [Example](#example)
- [Contributing](#contributing)
- [License](#license)

## Algorithm Description

Selection Sort works by dividing the input array into two parts: the sorted part and the unsorted part. Initially, the sorted part is empty, and the unsorted part contains all the elements. The algorithm repeatedly selects the minimum (or maximum, depending on the order) element from the unsorted part and moves it to the end of the sorted part. This process continues until the unsorted part becomes empty, and the entire array is sorted.

The key steps of the Selection Sort algorithm are as follows:

1. Find the minimum element in the unsorted part of the array.
2. Swap the minimum element with the first element of the unsorted part.
3. Expand the sorted part by one element.
4. Repeat the above steps for the remaining unsorted part.

Selection Sort has a time complexity of O(n^2), making it inefficient for large arrays, but it is straightforward to understand and implement.

## Usage

To use the Selection Sort algorithm in your Java project, follow these steps:

1. Clone this repository or download the `SelectionSort.java` file.
2. Include the `SelectionSort.java` file in your project.
3. Import the `SelectionSort` class into your Java code.
4. Create an array of comparable elements (e.g., integers, strings) that you want to sort.
5. Call the `SelectionSort.sort()` method, passing your array as an argument. This method will sort the array in ascending order.

```java
import com.example.SelectionSort;

public class Main {
    public static void main(String[] args) {
        // Create an array to be sorted
        Integer[] arrayToSort = {64, 25, 12, 22, 11};

        // Sort the array using Selection Sort
        SelectionSort.sort(arrayToSort);

        // Print the sorted array
        for (int element : arrayToSort) {
            System.out.print(element + " ");
        }
    }
}
```

## Example

You can find an example of using the Selection Sort algorithm in the `Example.java` file within this repository. It demonstrates how to sort an array of integers using the Selection Sort algorithm.

## Contributing

Contributions to this project are welcome. If you have suggestions for improvements, bug fixes, or additional features, please create an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

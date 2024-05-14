package ru.lukyanov.sorting.improvedselectionsort;

public class App {

    public static void selectionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j; // выбираем минимальный элемент в текущем числовом отрезке
                }
            }
            int temp = arr[min]; // меняем местами минимальный элемент с элементом под индексом i
            arr[min] = arr[i]; // так как отрезок постоянно уменьшается
            arr[i] = temp; // и выпадающие из него числа будут минимальными в текущем отрезке
        } // и как итог - числа оставшиеся вне текущей итерации отсортированы от самого наименьшего к большему
    }

    public static void improvedSelectionSorting(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) { // рассматриваемый отрезок с каждой итерацией
            // будет уменьшаться с ДВУХ сторон по одному элементу
            int min = arr[i];
            int max = arr[i];
            int minIndex = i;
            int maxIndex = i;
            for (int n = i; n <= j; n++) { // выбираем min и max на текущем отрезке
                if (arr[n] > max) {
                    max = arr[n];
                    maxIndex = n;
                } else if (arr[n] < min) {
                    min = arr[n];
                    minIndex = n;
                }
            }
            // меняем найденный минимальный элемент с позиции с индексом min на позицию с индексом i
            swap(arr, i, minIndex);

            if (arr[minIndex] == max) {// срабатывает, если элемент max оказался смещен предыдущей перестановкой -
                swap(arr, j, minIndex); // на старое место min, поэтому с позиции с индексом min смещаем его на позицию j
            } else {
                swap(arr, j, maxIndex); // простое обмен местами элементов с индексами max и j
            }
        }
    }

    static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void main(String[] args) {
        long firstDifference = 0;
        long secondDifference = 0;
        long primaryTime;
        int countOfApplying = 10000;
        for (int i = 0; i < countOfApplying; i++) {
            int[] arr1 = {234, 33, 123, 4, 5342, 76, 3, 65,
                    3, 5, 35, 75, 255, 4, 46, 48, 4658, 44, 22,
                    678, 324, 66, 151, 268, 433, 76, 372, 45, 13,
                    9484, 499959, 567, 774, 473, 3, 32, 865, 67, 43,
                    63, 332, 24, 1};
            primaryTime = System.nanoTime();
            selectionSorting(arr1);
            firstDifference += System.nanoTime() - primaryTime;

            int[] arr2 = {234, 33, 123, 4, 5342, 76, 3, 65,
                    3, 5, 35, 75, 255, 4, 46, 48, 4658, 44, 22,
                    678, 324, 66, 151, 268, 433, 76, 372, 45, 13,
                    9484, 499959, 567, 774, 473, 3, 32, 865, 67, 43,
                    63, 332, 24, 1};
            primaryTime = System.nanoTime();
            improvedSelectionSorting(arr2);
            secondDifference += System.nanoTime() - primaryTime;
        }

        System.out.println(((double) firstDifference / (double) secondDifference - 1) * 100 + "%");
    }
}

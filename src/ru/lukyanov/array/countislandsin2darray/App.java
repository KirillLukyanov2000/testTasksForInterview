package ru.lukyanov.array.countislandsin2darray;

public class App {

    public static void main(String[] args) {

        char[][] map1 = {
                {'1', '0', '0'},
                {'0', '0', '0'},
                {'1', '1', '1'}
        };

        char[][] map2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '0', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };

        System.out.println(countIslands(map1));
        System.out.println(countIslands(map2));
    }

    public static int countIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    check(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void check(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        check(grid, i + 1, j);
        check(grid, i - 1, j);
        check(grid, i, j + 1);
        check(grid, i, j - 1);
    }

}

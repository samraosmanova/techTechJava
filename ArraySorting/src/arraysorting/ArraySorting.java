package arraysorting;

public class ArraySorting {

    public static void main(String[] args) {
        
        //Creating instance for MinMax class;
        MinMax object = new MinMax();
        object.Homework01();
        object.Homework02();
        object.HomeWork03();
    }
}

class MinMax {
    
    //Common method for finding min and max in the given array
    public void findMinMaxInArray(int[] arr) {
        int min = arr[0];
        int max = arr[arr.length - 1];
        int indexMin = 0;
        int indexMax = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                indexMin = j;
            }
            if (arr[j] > max) {
                max = arr[j];
                indexMax = j;
            }
        }
        System.out.println("\nMinimum: " + indexMin + "-ci element => " + min + "\nMaksimum: " + indexMax + "-ci element => " + max);
    }
    
    //First homework: in one dimensional random array prints minimum, maximum value and their index 
    public void Homework01() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        this.findMinMaxInArray(arr);
    }

    //Second homework: in 2D random array prints min, max for whole array and for its rows as well
    public void Homework02() {
        int[][] arr2d = new int[3][5];
        int[] newArr = new int[15];
        int a = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = (int) (Math.random() * 100);
                System.out.print(arr2d[i][j] + "  ");
                newArr[a] = arr2d[i][j];
                a++;
            }
            System.out.println("");
        }

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
            }
            System.out.print(i + "-setir:");
            this.findMinMaxInArray(arr2d[i]);
            System.out.println("");
        }
        System.out.print("butun array-da");
        this.findMinMaxInArray(newArr);
    }

    
    //Third homework: in one dimensional array swaps the places of min and max
    public void HomeWork03() {
        int[] yerdeyishme = new int[10];
        int thirdvar;
        int min;
        int max;
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < yerdeyishme.length; i++) {
            yerdeyishme[i] = (int) (Math.random() * 100);
            System.out.print(yerdeyishme[i] + "  ");
        }

        min = yerdeyishme[0];
        max = yerdeyishme[yerdeyishme.length - 1];

        for (int j = 0; j < yerdeyishme.length; j++) {
            if (yerdeyishme[j] < min) {
                min = yerdeyishme[j];
                minIndex = j;

            }
            if (yerdeyishme[j] > max) {
                max = yerdeyishme[j];
                maxIndex = j;
            }
        }
        System.out.println("");
        thirdvar = yerdeyishme[minIndex];
        yerdeyishme[minIndex] = yerdeyishme[maxIndex];
        yerdeyishme[maxIndex] = thirdvar;
        for (int i = 0; i < yerdeyishme.length; i++) {

            System.out.print(yerdeyishme[i] + "  ");
        }

    }
}

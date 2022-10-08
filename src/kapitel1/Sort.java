package kapitel1;

public class Sort {
    public static void main(String[] args) {
        int[] sort = {12, 14, 125, 1, 9, 28, 3};
        System.out.println("Unsorted: " + getArrayContent(sort));

        System.out.println("Sorted ascending with Bubblesort: " + getArrayContent(bubbleSort(sort)));

        System.out.println("Sorted descending with SelectionSort: " + getArrayContent(selectionSort(sort)));

        System.out.println("Sorted ascending with InsertSort: " + getArrayContent(insertSort(sort)));
    }

    static int[] bubbleSort(int[] array) {
        // Go through every item
        for (int i = 0; i < array.length; i++) {
            // Compare to the following items
            for (int j = i + 1; j < array.length; j++) {
                // Check whether the following number is bigger
                if(array[j] < array[i]) {
                    // Switch
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int highest = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > highest) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        return array;
    }

    static int[] insertSort(int[] array) {
        // Go trough every item
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int pos = i;
            while(pos > 0 && array[pos - 1] > tmp) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = tmp;
        }
        return array;
    }

    static String getArrayContent(int[] array) {
        StringBuilder builder = new StringBuilder();
        String s = "[";
        for (int i : array) {
            builder.append(i).append(", ");
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return s + builder.toString();
    }
}

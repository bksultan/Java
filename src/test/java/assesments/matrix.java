package assesments;

public class matrix {
    public static void main(String[] args) {
        char[][] arr = {
                {'c', 'a', 'k', 'e', 'w'},
                {'b', 'd', 'e', 'y', 'e'},
                {'b', 'd', 'e', 'e', 'e'},
                {'b', 'd', 'e', 's', 'e'},
                {'b', 'd', 'e', 'm', 'e'}
        };

        System.out.println(findWord(arr, "cake"));
        System.out.println(findWord(arr, "eyes"));
    }

    public static boolean findWord(char[][] arr, String word) {
        String horizontal = "";
        String vertical = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                horizontal += "" + arr[i][j];
                vertical += "" + arr[j][i]; // if second element contains exit then print it?
            }
            horizontal = horizontal + " ";
            vertical = vertical + " ";
        }

        return (horizontal.contains(word) || vertical.contains(word));
    }
}

















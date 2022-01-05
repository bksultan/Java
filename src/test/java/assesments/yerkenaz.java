package assesments;

public class yerkenaz {
    public static int maximumChars(String str)
    {
        int n = str.length();
        int res = -1;

        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (str.charAt(i) == str.charAt(j))
                    res = Math.max(res,
                            Math.abs(j - i - 1));

        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "abcsdsdqweaa";

        System.out.println(maximumChars(str));
    }
}

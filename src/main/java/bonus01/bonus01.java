package bonus01;

public class bonus01 {
    public static int findLSL(String str) {
        int len = str.length();
        int ret = 1;

        for (int i = 0; i < len; i++) {
            int cnt = 1;
            for (int j = i+1; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    ++cnt;
                } else if (cnt > ret)
                    ret = cnt;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        String str = "abababazzzccccc";

        int len = findLSL(str);

        System.out.println("가장 긴 반복 문자열의 길이: " + len);
    }
}

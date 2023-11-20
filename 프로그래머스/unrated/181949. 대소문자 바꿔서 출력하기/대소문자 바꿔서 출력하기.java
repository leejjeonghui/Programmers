import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c;
            if (Character.isLowerCase(str.charAt(i))) {
                // 소문자면?
                c = Character.toUpperCase(str.charAt(i));
            } else {
                c = Character.toLowerCase(str.charAt(i));
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}
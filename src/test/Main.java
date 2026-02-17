package test;

public class Main {

    public static void main(String[] args) {
        String text = "abc";
        permute(text, "");
    }

    static void permute(String remaining, String result) {

        if (remaining.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {

            char ch = remaining.charAt(i);

            String newRemaining =
                    remaining.substring(0, i) +
                    remaining.substring(i + 1);

            permute(newRemaining, result + ch);
        }
    }
}

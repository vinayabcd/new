package myjava.src;

public class Oddpo {
    public static void main(String[] args) {
        String text = "type here to search";
        System.out.println(text);
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(text.charAt(i));
            }
        }

    }

}

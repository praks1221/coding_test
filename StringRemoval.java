package prakriti;

public class StringRemoval {
    public static void main(String[] args) {
        //**
        // * Given two string arguments s1, s2
        // * return a string removing s2 from s1 ignoreCase
        // * return "N/A" if s2 is not found in s1
        // *
        // * eg. s1 = "HelloWorld", s2 = "World" => "Hello"
        // *  s1 = "JustDoIt", s2 = "do" => "JustIt"
        // *  s1 = "DoesntContain", s2 = "this" => "N/A"
        // *

        String S1 = "Hello";
        String S2 = "World";

        if (S1.toLowerCase().contains(S2.toLowerCase())) {
            for (int i = 0; i < S1.length(); i++) {
                for (int j = i; j < S2.length(); j++) {
                    if (S1.charAt(i) != S2.charAt(j)) {
                        System.out.print(S1.charAt(i));
                        break;
                    }
                }
            }

        } else {
            System.out.println("N/A");
        }
    }

}

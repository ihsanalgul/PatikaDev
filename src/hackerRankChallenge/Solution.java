package hackerRankChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    static boolean flagByte, flagShort, flagInt, flagLong;
    static List<String> resultList = new ArrayList<>();

    public static void main(String[] args) {
//        String[] arr = {"123", "5", "433", "-1", "2222222", "213333333333333333333333333333333333", "-100000000000000"};

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.next();
        }

        for (String s : arr) {
            checkTheGivenNumber("Byte", s);
            checkTheGivenNumber("Short", s);
            checkTheGivenNumber("Integer", s);
            checkTheGivenNumber("Long", s);

            if (resultList != null && resultList.size() != 0) {
                System.out.println(s + "" + " can be fitted in:");
                for (String dataType : resultList) {
                    System.out.println(dataType);
                }
                resultList.clear();

            } else {
                System.out.println(s + " can't be fitted anywhere.");
            }
        }

    }

    private static void checkTheGivenNumber(String key, String s) {

        switch (key) {
            case "Byte":
                try {
                    if (Byte.parseByte(s) > Byte.MIN_VALUE && Byte.parseByte(s) < Byte.MAX_VALUE) {
                        resultList.add("* byte");
                    }
                } catch (Exception e) {
                    flagByte = false;
                }
                break;
            case "Short":
                try {
                    if (Short.parseShort(s) > Short.MIN_VALUE && Short.parseShort(s) < Short.MAX_VALUE) {
                        resultList.add("* short");
                    }
                } catch (Exception e) {
                    flagShort = false;
                }
                break;
            case "Integer":
                try {
                    if (Integer.parseInt(s) > Integer.MIN_VALUE && Integer.parseInt(s) < Integer.MAX_VALUE) {
                        resultList.add("* int");
                    }

                } catch (Exception e) {
                    flagInt = false;
                }
                break;
            case "Long":
                try {
                    if (Long.parseLong(s) > Long.MIN_VALUE && Long.parseLong(s) < Long.MAX_VALUE) {
                        resultList.add("* long");
                    }
                } catch (Exception e) {
                    flagLong = false;
                }
                break;
        }
    }

}


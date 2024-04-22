package home_work_5.utils;

import java.util.Random;

public class RandomGeneratorsUtils {

    private static final String randomLettersAndSymbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[{]};:'\",<.>/?";
    private static final String russianSymbols = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String englishSymbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";



    public static String generateRandomString() {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        return genFromCharacterSet(length, randomLettersAndSymbols);
    }



    public static String generateRandomRussianString() {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        return genFromCharacterSet(length, russianSymbols);
    }


    public static String generateRandomEnglishString() {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        return genFromCharacterSet(length, englishSymbols);
    }

    public static String genFromCharacterSet(int length, String characters) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    public static int ageGenerator(){
        Random random = new Random();
        int minValue = 1;
        int maxValue = 15;
        int randomNumber = random.nextInt(maxValue - minValue + 1) + minValue;
        return randomNumber;
    }

    public static String passwordGenerator(){
        Random random = new Random();
        int minLength = 5;
        int maxLength = 10;
        int passwordLength = random.nextInt(maxLength - minLength + 1) + minLength;
        return genFromCharacterSet(passwordLength, randomLettersAndSymbols);
    }

}
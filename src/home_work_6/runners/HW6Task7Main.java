package home_work_6.runners;

import java.io.File;
import java.util.Scanner;

public class HW6Task7Main {
    public static void main(String[] args) {

        String folderPath = "HomeWork\\src\\home_work_6\\txt_files\\";
        File folder = new File(folderPath);

        System.out.println(folder.isDirectory());
        System.out.println(folder.exists());

        System.out.println(HW6Task7Main.listTxtFilesInFolder(folder));


        Scanner console = new Scanner(System.in);
        System.out.println("Выбран файл: " + HW6Task7Main.fileExistenceCheck(console, folder));


    }

    public static String listTxtFilesInFolder(File folder){
        StringBuilder builder = new StringBuilder();

        if (folder.exists() && folder.isDirectory()) {

            File[] files = folder.listFiles();

            if (files != null) {
                System.out.println("Список файлов формата txt в папке:");

                boolean newLine = false;

                for (File file : files) {
                    if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {

                        if (newLine){
                            builder.append("\n");
                        } else {
                            newLine = true;
                        }
                        builder.append(file.getName());
                    }
                }

            } else {
                System.out.println("В указанной папке отсутствуют файлы.");
            }
        } else {
            System.out.println("Папка не существует или не является папкой");
        }
        return builder.toString();
    }

    public static String fileExistenceCheck(Scanner console, File folderPath){
        String userChoice;
        String message;

        while (true) {
            System.out.println("Укажите название файла, с которым вы будете работать:");
            userChoice = console.nextLine();

            File selectedFilePath = new File(folderPath + "\\" + userChoice);
            if (selectedFilePath.exists() && selectedFilePath.isFile()) {
                break;
            } else {
                System.out.println("Файл не найден. Пожалуйста, укажите существующий файл.");
            }
        }

        return userChoice;
    }
}
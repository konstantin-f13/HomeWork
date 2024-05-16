package home_work_6.runners;

import home_work_6.search.decorators.CaseInsensitiveDecorator;
import home_work_6.search.RegExSearch;
import home_work_6.Task2_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW6Task7Main {
    public static void main(String[] args) {

        String folderPath = "HomeWork/src/home_work_6/txt_books/many_txt_files";
        File folder = new File(folderPath);
        StringBuilder resultRecorder = new StringBuilder();

        Scanner console = new Scanner(System.in);
        String selectedFileName = "";
        String searchedWord;
        System.out.println(listTxtFilesInFolder(folder));

        while (true) {
            if (selectedFileName.isEmpty()) {
                selectedFileName = fileSelectionWithCheck(console, folder);

                if (selectedFileName.equalsIgnoreCase("exit")) {
                    break;
                }

            } else {
                System.out.println("Введите слово для поиска (или 'exit' для выхода, 'back' для возврата к выбору файла):");
                searchedWord = console.nextLine();

                if (searchedWord.equalsIgnoreCase("exit")) {
                    break;
                } else if (searchedWord.equalsIgnoreCase("back")) {
                    selectedFileName = "";
                    System.out.println(listTxtFilesInFolder(folder));
                } else {
                    searchInFile(folder, selectedFileName, searchedWord, resultRecorder);
                }
            }
        }
        recordingResultsIntoFile(folder, resultRecorder, "results.txt");

    }

    public static String listTxtFilesInFolder(File folder) {
        StringBuilder builder = new StringBuilder();

        if (folder.exists() && folder.isDirectory()) {

            File[] files = folder.listFiles();

            if (files != null) {
                System.out.println("Список файлов формата txt в папке:");

                boolean newLine = false;

                for (File file : files) {
                    if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {

                        if (newLine) {
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

    public static String fileSelectionWithCheck(Scanner console, File folderPath) {
        String userChoice;

        while (true) {
            System.out.println("Укажите название файла, с которым вы будете работать, или укажите 'exit' для выхода из программы:");
            userChoice = console.nextLine();

            if (userChoice.equalsIgnoreCase("exit")) {
                return "exit";
            }

            File selectedFilePath = new File(folderPath + "/" + userChoice);
            if (selectedFilePath.exists() && selectedFilePath.isFile()) {
                break;
            } else {
                System.out.println("Файл не найден. Пожалуйста, укажите существующий файл.");
            }
        }
        return userChoice;
    }

    public static void searchInFile(File folderPath, String selectedFileName, String searchedWord, StringBuilder
            resultRecorder) {
        File file = new File(folderPath + "\\" + selectedFileName);
        long count = new CaseInsensitiveDecorator(new RegExSearch()).search(Task2_1.stringBuilderFromFile(file), searchedWord);
        resultRecorder.append(selectedFileName).append(" - ").append(searchedWord).append(" - ").append(count).append("\n");
        System.out.println("Слово '" + searchedWord + "' найдено в файле '" + selectedFileName + "' " + count + " раз(а).");
    }

    public static void recordingResultsIntoFile(File folderPath, StringBuilder resultRecorder, String
            desiredFileName) {
        String resultFileName = folderPath + "\\" + desiredFileName;
        try (FileWriter writer = new FileWriter(resultFileName)) {
            writer.write(resultRecorder.toString());
            System.out.println("Результаты поиска сохранены в файле '" + resultFileName + "'.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл '" + resultFileName + "'.");
        }
    }
}
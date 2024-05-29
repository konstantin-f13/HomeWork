package home_work_6.runners;

import home_work_6.search.decorators.CaseInsensitiveDecorator;
import home_work_6.search.RegExSearch;
import home_work_6.Task2_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class HW6Task8_Threads {
    public static void main(String[] args) {
        String folderPath = "HomeWork/src/home_work_6/txt_books/many_txt_files";
        File folder = new File(folderPath);
        StringBuilder resultRecorder = new StringBuilder();

        Scanner console = new Scanner(System.in);

        System.out.println(listTxtFilesInFolder(folder));

        while (true) {
            System.out.println("Введите слово для поиска во всех файлах (или 'exit' для выхода):");
            String searchedWord = console.nextLine();

            if (searchedWord.equalsIgnoreCase("exit")) {
                break;
            }

            ExecutorService executorService = Executors.newFixedThreadPool(10); // Указываем количество потоков
            File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

            if (files != null) {
                for (File file : files) {
                    executorService.execute(() -> searchInFile(folder, file.getName(), searchedWord, resultRecorder));
                }
            }

            executorService.shutdown();
            try {
                executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
                //Ожидание завершения всех задач - awaitTermination используется для
                // ожидания завершения всех задач перед записью результатов в файл.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            recordingResultsIntoFile(folder, resultRecorder, "results_with_threads.txt");
        }
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

    public static void searchInFile(File folderPath, String selectedFileName, String searchedWord, StringBuilder resultRecorder) {
        File file = new File(folderPath + "\\" + selectedFileName);
        long count = new CaseInsensitiveDecorator(new RegExSearch()).search(Task2_1.stringBuilderFromFile(file), searchedWord);
        /**
         * Синхронизация доступа к resultRecorder: Используется блокировка
         * для синхронизации доступа к resultRecorder, чтобы избежать
         * проблем с многопоточностью.
         */
        synchronized (resultRecorder) {
            resultRecorder.append(selectedFileName).append(" - ").append(searchedWord).append(" - ").append(count).append("\n");
        }
        System.out.println("Слово '" + searchedWord + "' найдено в файле '" + selectedFileName + "' " + count + " раз(а).");
    }

    public static void recordingResultsIntoFile(File folderPath, StringBuilder resultRecorder, String desiredFileName) {
        String resultFileName = folderPath + File.separator + "result_folder" + File.separator + desiredFileName;
        try (FileWriter writer = new FileWriter(resultFileName)) {
            writer.write(resultRecorder.toString());
            System.out.println("Результаты поиска сохранены в файле '" + resultFileName + "'.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл '" + resultFileName + "'.");
        }
    }
}

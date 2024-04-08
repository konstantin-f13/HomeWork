package home_work_1;

public class SleepInOrNotMain {
    public static void main(String[] args) {
        System.out.println("Спать ли дальше, вот в чём вопрос.");
        if (sleepIn(false, false)) {
            System.out.println("Спим дальше, у нас выхи или отпуск.");
        } else {
            System.out.println("Пора вставать и идти на работу!");
        }
    }
    public static boolean sleepIn(boolean weekday, boolean vacation){
        if (!weekday || vacation){
            return true;
        } else {
            return false;
        }
    }
}

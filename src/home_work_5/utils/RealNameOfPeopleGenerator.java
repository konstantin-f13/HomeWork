package home_work_5.utils;

import java.util.Random;

public class RealNameOfPeopleGenerator extends RealNameGenerator {

    private static final String[] REAL_NAMES = {"Петя", "Вася", "Гриша", "Маша", "Даша", "Рита", "Илья", "Дима", "Полина", "Влад", "Нина"};


    @Override
    public String generateRandomRealName() {
        Random random = new Random();
        int index = random.nextInt(REAL_NAMES.length);
        return REAL_NAMES[index];
    }
}

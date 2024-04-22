package home_work_5.utils;

import java.util.Random;

public class RealNameOfAnimalGenerator extends RealNameGenerator {

    private static final String[] REAL_NICKNAMES = {"Барсик", "Рекс","Астон", "Арни", "Флойд", "Морис", "Криста", "Кукки", "Кира", "Белль"};

    @Override
    public String generateRandomRealName() {
        Random random = new Random();
        int index = random.nextInt(REAL_NICKNAMES.length);
        return REAL_NICKNAMES[index];
    }
}

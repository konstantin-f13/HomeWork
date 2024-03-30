package home_work_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] stringArr;

        /**
         * задание 4.1.1
         */
        stringArr = new String[]{"1", "2", "3", null, null, null};
        DataContainer<String> container = new DataContainer<>(stringArr);
        int index1 = container.add("777");
        System.out.println(index1);//3

        /**
         * задание 4.1.2
         */
        stringArr = new String[]{"1", "2", "3", null, null, null};
        container = new DataContainer<>(stringArr);
        int index2 = container.add(null);
        System.out.println(index2);//-1

        /**
         * задание 4.1.3
         */
        stringArr = new String[]{"1", null, "3", null, null, null};
        container = new DataContainer<>(stringArr);
        int index3 = container.add("777");
        System.out.println(index3);//1

        /**
         * задание 4.2
         */
        stringArr = new String[]{"1", "2", "3"};
        container = new DataContainer<>(stringArr);
        int index4 = container.add("777");
        System.out.println(index4);//3

        /**
         * задание 4.2.2
         */
        stringArr = new String[]{};
        container = new DataContainer<>(stringArr);
        int index5 = container.add("777");
        System.out.println(index5);//0

        /**
         * задание 5.1
         */
        stringArr = new String[]{};
        container = new DataContainer<>(stringArr);
        int index6 = container.add("9999");
        System.out.println(index6);//0
        System.out.println(container.get(index6));//9999

        /**
         * задание 5.2
         */
        stringArr = new String[]{"9999"};
        container = new DataContainer<>(stringArr);
        System.out.println(container.get(1));//null

        /**
         * задание 7.1.1
         */
        stringArr = new String[]{"1", "2", "3", "777"};
        container = new DataContainer<>(stringArr);
        System.out.println(container.delete(3));
        System.out.println(Arrays.toString(container.getItems()));

        /**
         * задание 7.2.1
         */
        stringArr = new String[]{"1", "2", "3", "777"};
        container = new DataContainer<>(stringArr);
        System.out.println(container.delete(9));
        System.out.println(Arrays.toString(container.getItems()));

        /**
         * задание 7.3.1
         */
        stringArr = new String[]{"1", "2", "3", "777"};
        container = new DataContainer<>(stringArr);
        System.out.println(container.delete(2));
        System.out.println(Arrays.toString(container.getItems()));












    }

}

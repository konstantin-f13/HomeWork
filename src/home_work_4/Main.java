package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Integer[] integerArr;

        /**
         * задание 4.1.1
         */
        integerArr = new Integer[]{1, 2, 3, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        int index1 = container.add(777);
        System.out.println(index1);//3

        /**
         * задание 4.1.2
         */
        integerArr = new Integer[]{1, 2, 3, null, null, null};
        container = new DataContainer<>(integerArr);
        int index2 = container.add(null);
        System.out.println(index2);//-1

        /**
         * задание 4.1.3
         */
        integerArr = new Integer[]{1, null, 3, null, null, null};
        container = new DataContainer<>(integerArr);
        int index3 = container.add(777);
        System.out.println(index3);//1

        /**
         * задание 4.2
         */
        integerArr = new Integer[]{1, 2, 3};
        container = new DataContainer<>(integerArr);
        int index4 = container.add(777);
        System.out.println(index4);//3

        /**
         * задание 4.2.2
         */
        integerArr = new Integer[]{};
        container = new DataContainer<>(integerArr);
        int index5 = container.add(777);
        System.out.println(index5);//0

        /**
         * задание 5.1
         */
        integerArr = new Integer[]{};
        container = new DataContainer<>(integerArr);
        int index6 = container.add(9999);
        System.out.println(index6);//0
        System.out.println(container.get(index6));//9999

        /**
         * задание 5.2
         */
        integerArr = new Integer[]{9999};
        container = new DataContainer<>(integerArr);
        System.out.println(container.get(1));//null

        /**
         * задание 7.1.1
         */
        integerArr = new Integer[]{1, 2, 3, 777};
        container = new DataContainer<>(integerArr);
        System.out.println(container.delete(3));//true
        System.out.println(Arrays.toString(container.getItems()));//[1, 2, 3]

        /**
         * задание 7.2.1
         */
        integerArr = new Integer[]{1, 2, 3, 777};
        container = new DataContainer<>(integerArr);
        System.out.println(container.delete(9));//false
        System.out.println(Arrays.toString(container.getItems()));//[1, 2, 3, 777]

        /**
         * задание 7.3.1
         */
        integerArr = new Integer[]{1, 2, 3, 777};
        container = new DataContainer<>(integerArr);
        System.out.println(container.delete(2));//true
        System.out.println(Arrays.toString(container.getItems()));//[1, 2, 777]

        /**
         * задание 8.1.1
         */
        integerArr = new Integer[]{1, 2, 3, 777};
        container = new DataContainer<>(integerArr);
        System.out.println(container.delete(null));//false
        System.out.println(Arrays.toString(container.getItems()));//[1, 2, 3, 777]

        /**
         * задание 8.1.2
         */
        integerArr = new Integer[]{1, 2, 3, 777, null};
        container = new DataContainer<>(integerArr);
        System.out.println(container.delete(null));//false
        System.out.println(Arrays.toString(container.getItems()));//[1, 2, 3, 777, null]

        /**
         * задание 8.2.1
         */
        integerArr = new Integer[]{1, 2, 3, 777};
        container = new DataContainer<>(integerArr);
        System.out.println(container.delete((Integer)777));//true
        System.out.println(Arrays.toString(container.getItems()));//[1, 2, 3]

        /**
         * задание 8.3.1
         */
        integerArr = new Integer[]{1, 2, 3, 777};
        container = new DataContainer<>(integerArr);
        System.out.println(container.delete((Integer)111));//false
        System.out.println(Arrays.toString(container.getItems()));//[1, 2, 3, 777]

        /**
         * задание 8.4.1
         */
        integerArr = new Integer[]{1, 2, 3, 777, 3};
        container = new DataContainer<>(integerArr);
        System.out.println(container.delete((Integer)3));//true
        System.out.println(Arrays.toString(container.getItems()));//[1, 2, 777, 3]


        /**
         * задание 9.1
         */
        integerArr = new Integer[]{3, 1, 3, 777};
        container = new DataContainer<>(integerArr);
        container.sort(new ComparatorIntegerBySize());
        System.out.println(Arrays.toString(container.getItems()));//[1, 3, 3, 777]

        /**
         * задание 9.2
         */
        String[] stringArr;
        stringArr = new String[]{"i", "hello", "1", "Как домашка"};
        DataContainer<String> containerStr = new DataContainer<>(stringArr);
        containerStr.sort(new ComparatorStringByLength());
        System.out.println(Arrays.toString(containerStr.getItems()));//[i, 1, hello, Как домашка]


        /**
         * задание 10.1
         */
        integerArr = new Integer[]{1, 2, 3, 777, 3};
        container = new DataContainer<>(integerArr);
        System.out.println(container.toString());//[1, 2, 3, 777, 3]
        System.out.println(Arrays.toString(container.getItems()));//[1, 2, 3, 777, 3]

        /**
         * задание 10.2
         */
        integerArr = new Integer[]{1, 2, 3, null};
        container = new DataContainer<>(integerArr);
        System.out.println(container.toString());//[1, 2, 3]
        System.out.println(Arrays.toString(container.getItems()));//[1, 2, 3, null]


        /**
         * задание 10.3
         */
        integerArr = new Integer[]{};
        container = new DataContainer<>(integerArr);
        System.out.println(container.toString());//[]
        System.out.println(Arrays.toString(container.getItems()));//[]

    }

}

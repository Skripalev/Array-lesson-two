import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] monday = new int[5];
        monday[0] = 5000;
        monday[1] = 4500;
        monday[2] = 3900;
        monday[3] = 6700;
        monday[4] = 5500;
        int sum = Arrays.stream(monday).sum();
        System.out.println("Сумма " + sum + " рублей.");

        System.out.println("Task 2");

        int minimalSpend = monday[0];
        for (int i = 1; i < monday.length; i++) {
            if (monday[i] < minimalSpend) {
                minimalSpend = monday[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minimalSpend + " рублей.");


        int maximumSpend = -1;
        for (int i = 0; i < monday.length; i++) {
            if (monday[i] > maximumSpend) {
                maximumSpend = monday[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maximumSpend + " рублей.");

        System.out.println("Task 3");

        float averageSpend = sum / 5f;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpend + " рублей.");

        System.out.println("Task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int left = 0;
        int right = reverseFullName.length - 1;
        while (left < right) {
            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }


    }
}
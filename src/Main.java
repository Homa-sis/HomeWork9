import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int [] wastes = {576,585,955,999,400};
        int totalExpenses = 0;
        for (int i = 0; i<wastes.length; i++){
            totalExpenses = totalExpenses + wastes[i];
        }
        System.out.println("Сумма трат за месяц " + totalExpenses + " рублей");

        System.out.println("Задача 2");

        int maxWaste = -1;
        for (final int max : wastes){
            if(max>maxWaste){
                maxWaste=max;
            }
        }
        int minWaste = 1000;
        for (final int min : wastes){
            if (min < minWaste){
                minWaste=min;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWaste + " рублей. Максимальная сумма трат за неделю составила " + maxWaste + " рублей");

        System.out.println("Задача 3");
        int total = 0;
        for (int expense : wastes) {
            total += expense;
        }
        double average = total / (double)wastes.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int left = 0;
        int right = reverseFullName.length - 1;
        while (left<right){
            char pace = reverseFullName[left];
            reverseFullName[left]=reverseFullName[right];
            reverseFullName[right] = pace;
            left++;
            right--;
        } for (char name : reverseFullName) {
            System.out.print(name);
        }

    }
}
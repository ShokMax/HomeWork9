public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int totalSalary = 0;
        int[] salaryArray = {1021, 3041, 1500, 5067, 7000};
        for (int salary : salaryArray) {
            totalSalary += salary;
        }
        System.out.println(" Сумма трат за месяц составила " + totalSalary + " рублей");
        System.out.println(" Задача 2");
        int[] budget = {1200, 3564, 2453, 8143, 15041};
        int min = budget[0];
        int max = budget[0];
        for (int element : budget) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println(" Минимальные затраты за неделю " + min + " рублей");
        System.out.println(" Максимальные затраты за неделю " + max + " рублей");
        System.out.println(" Задача 3");
        System.out.println(" Средняя сумма трат за месяц составила " + totalSalary / salaryArray.length);
        System.out.println(" Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


        }
    }
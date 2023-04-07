import java.util.Scanner;
import java.util.Stack;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        
        while (true) {
            System.out.print("Введите команду или строку: ");
            String input = scanner.nextLine();

            if (input.equals("print")) {
                System.out.println("Предыдущие строки в обратном порядке:");
                while (!stack.isEmpty()) {
                    System.out.println(stack.pop());
                }
            } else if (input.equals("revert")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                    System.out.println("Последняя введенная строка удалена");
                } else {
                    System.out.println("Стек пуст");
                }
            } else if (input.equals("exit")) {
                System.out.println("Программа завершена");
                break;
            } else {
                stack.push(input);
            }
        }
    }
}
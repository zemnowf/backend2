import lombok.*;

import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

class CalculatorOfLeastCommonMultiple {
    private int firstNumber;
    private int secondNumber;

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        firstNumber =in.nextInt();
        System.out.println("Введите второе число: ");
        secondNumber = in.nextInt();
    }


    public int calculateLCM (CalculatorOfLeastCommonMultiple calculator) {
        int lcm = whichNumberIsBigger(calculator);

        while (true) {
            if (lcm % calculator.firstNumber == 0 && lcm % calculator.secondNumber == 0) {
                System.out.println("НОК этих чисел: " + lcm);
                break;
            } else lcm++;
        }
        return lcm;
    }

    public int whichNumberIsBigger (CalculatorOfLeastCommonMultiple calculator) {
        return Math.max(calculator.firstNumber, calculator.secondNumber);
    }

}

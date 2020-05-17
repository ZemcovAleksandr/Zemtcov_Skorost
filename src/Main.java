
//Напишите функцию, на входе которой расстояние до места назначения (S, м) и время в пути (T, мин).
// Вычислить скорость (км/ч). Напишите тесты.

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("ВВедите расстояние в метрах");
        int S  = in.nextInt();
        System.out.print("ВВедите время в минутах");
        int t  = in.nextInt();
        double u =Skorost(S,t);
        System.out.print("Скорость = "+ u + " км/ч");
    }
public static Double Skorost(int S, int t){ //Функция вычисления скорости
        double u = 0;
        u = (S/t)*0.06;
    return u;
}
}

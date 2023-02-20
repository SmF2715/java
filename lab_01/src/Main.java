public class Main {
    public static void first(int x1, int x2, int x3, int y1, int y2, int y3){
        System.out.println("Лабораторная работа №1 \nВариант 4 \nЗадание №1");
        double a = Math.sqrt((Math.pow(x2-x1,2)+ Math.pow(y2-y1,2)));
        double b = Math.sqrt((Math.pow(x3-x2,2)+ Math.pow(y3-y2,2)));
        double c = Math.sqrt((Math.pow(x1-x3,2)+ Math.pow(y1-y3,2)));
        double p = (a+b+c)/2;
        double s = .5* Math.abs(x1-x3 * (y2-y3) - (x2-x3)*(y1-y3));
        System.out.println("Периметр треугольника = " + p);
        System.out.println("Площадь треугольника = " + s);
    }

    public static void second_var_4(double L){
        System.out.println("Вариант №4 \nЗадание №2");
        double R = L / Math.PI;
        double S = Math.PI * R;
        System.out.println("Радиус окружности: " + R);
        System.out.println("Площадь окружности: " + S);
    }
    public static void second_var_19(double R, double L){
        System.out.println("Вариант 19 \nЗадание №2");
        double H = Math.sqrt(L*L - R * R);
        double S = 0.5 * (2*R) * H;
        System.out.println("Площадь осевого сечения конуса равна: " + S);
    }

    public static void main(String[] args) {
        first(1,2,4,5,7,2);
        second_var_4(12);
        second_var_19(20,25);
    }
}
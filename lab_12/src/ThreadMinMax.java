public class ThreadMinMax implements java.lang.Runnable {
    private Thread thr; // ссылка на дочерний поток
    private int[] AI; //массив значений
    private int maximum; // максимальное значение
    private int minimum; // минимальное значение

    // Конструктор - получает массив целых чисел
    public ThreadMinMax(int[] AI) {
        // Инициализация массива
        this.AI = AI;
        // Создать поток
        thr = new Thread(this, "Thread1.");
        // Запустить поток выполнения
        thr.start();
    }
    // Метод, в котором вписывается код выполнения потока
    // В нашем случае вписывается код поиска минимального значения
    // и заполнение переменной maximum.
    public void run() {
        int max = AI[0];
        int min = AI[0];
        for (int i=1; i<AI.length; i++) {
            if (max<AI[i]) max = AI[i];
            if (min>AI[i]) min = AI[i];
        }
        maximum = max;
        minimum = min;
    }

    public Thread getThread (){ return thr; }
    public int getMaximum(){ return maximum; }
    public int getMinimum(){ return minimum; }
}

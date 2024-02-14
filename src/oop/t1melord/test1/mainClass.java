package oop.t1melord.test1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.Comparator;
import java.time.LocalDateTime;
import java.util.SortedMap;
import java.util.HashMap; /** это путь к классу HashMap в пакете java.util. HashMap используется для хранения пар “ключ-значение”.*/
import java.util.Map; /**это путь к интерфейсу Map в пакете java.util. Map представляет собой объект, который отображает ключи на значения.*/

public class mainClass {


    public static void chislaAtLine(){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int b = Integer.parseInt(line);
        System.out.println(b);
        int g = b+5;
        System.out.println(g);
    }
    public static void charAtI(){
        String str = "Это пример строки";
        char ch = 'р';
        int frequency = 0;
        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Частота символа '" + ch + "' в строке: " + frequency);
    }


    public static void withoutSpacesInString(String line){
        String zamena = line.replace(" ", "");
        System.out.println(zamena);
    }
    public static void train(){
        String txt ="Ya bog";
        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
        String txt2 = "Silnii";
        System.out.println(txt.concat(txt2));
        System.out.println(txt2.indexOf("i"));
        int x = 5;
        int y = 10;
        System.out.println(Math.max(x,y));
        int x2 = 16;
        System.out.println(Math.sqrt(x2));
        System.out.println(Math.random());
    }

    /**public: модификатор доступа, который делает класс/метод доступным из любого другого класса.
     class: ключевое слово для объявления класса.
     Main: имя класса.
     public static void main(String[] args): основной метод, который является точкой входа в любую Java-программу. Ключевое слово static позволяет методу main() вызываться без необходимости создания экземпляра класса.
     String str = "Hello, World!";: объявление строки с именем str и присвоение ей значения “Hello, World!”.
     Map<Character, Integer> charCountMap = getCharCount(str);: создание объекта Map с именем charCountMap и вызов метода getCharCount с аргументом str для инициализации этого объекта.
     System.out.println(charCountMap);: вывод содержимого charCountMap на консоль.
     public static Map<Character, Integer> getCharCount(String str): объявление статического метода с именем getCharCount, который принимает строку в качестве аргумента и возвращает Map.
     Map<Character, Integer> charCountMap = new HashMap<>();: создание нового объекта HashMap и присвоение его переменной charCountMap.
     for (char c : str.toCharArray()): цикл for-each, который проходит по каждому символу в массиве символов, полученном из строки str.
     charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);: добавление символа в charCountMap или увеличение его счетчика на 1, если он уже есть в charCountMap.
     return charCountMap;: возврат charCountMap как результата метода.*/

    public static void game(){
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false) {
            System.out.println("Угадайте число от 1 до 100:");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Слишком маленькое!");
            } else if (guess > numberToGuess) {
                System.out.println("Слишком большое!");
            }
        }

        System.out.println("Вы выиграли!");
        System.out.println("Число было " + numberToGuess);
        System.out.println("Вам понадобилось " + numberOfTries + " попыток");
    }


    public static void symbolsInString(String text){

        Map<Character, Integer> charCountMap = getCharCount(text);
        System.out.println(charCountMap);

    }
    public static Map<Character, Integer> getCharCount(String text){
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        return charCountMap;
    }

    public static void dublicatesInArray(int massLength){
        int[] mass = new int[massLength];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < massLength ; i++) {
            mass[i] = scanner.nextInt();
        }
        int del = 0;
        for (int i = 0; i < massLength - 1 ; i++) {
            if (mass[i] == mass[i+1]){
                System.out.println("Дубликат в массиве, введите новое значение ");
                mass[i] = scanner.nextInt();
        }
        }
        System.out.println(Arrays.toString(mass));
    }
    public static void averageInArray(int averageLength){
        int[] mass = new int[averageLength];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < averageLength ; i++) {
            mass[i] = scanner.nextInt();
        }
        double sum = 0;
        double average = 0;
        for (int i = 0; i < averageLength ; i++) {
        sum += mass[i];
        }
        average = sum / averageLength;
        System.out.println(average);
    }

    public static void minInArray(int massLength){
        int [] mass = new int[massLength];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < massLength ; i++) {
        mass[i] = scanner.nextInt();
        }
        int min = mass[0];
        for (int i = 1; i < massLength ; i++) {
            if(mass[i] < min){
                min = mass[i];
            }
        }
        System.out.println(min + "test");
    }
    public static void FizzBuzz(){
        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0 & i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0 ){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else  {
                System.out.println(i);
            }
        }
    }
    public static void currentDate(){
        LocalDateTime data = LocalDateTime.now();
        System.out.println(data);
    }
    public static void reversLine(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любой текст ");
        String line = scanner.nextLine();
        System.out.println(line);
        String reversed = new StringBuilder(line).reverse().toString();
        System.out.println(reversed);
    }
    public static void maxInArray(int lengthMass) {
        Scanner scanner = new Scanner(System.in);
        int[] mass = new int[lengthMass];
        System.out.println("Введите числа массива ");
        for (int i = 0; i < lengthMass; i++) {
            mass[i] = scanner.nextInt();
        }
        int max = mass[0];
        for (int i = 0; i < lengthMass ; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println(max);
        System.out.println(Arrays.toString(mass));
    }
    //        sumChisla(number,number2);
    //        fibonach();
    public static double temperature(double cels, double far) {
        double first = ((far-32)*5)/9;
        double second = (cels*9/5)+32;
        System.out.println(second);
        System.out.println(first);
        return first;
    }
    public static void chet(int chisl) {

        if (chisl % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
    }
    public static void tabl() {
        int chisl = 5;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + " * " + " 5 = "  + chisl*i);


        }
    }

    public static void palindrom(String line) {
        String reversed = new StringBuilder(line).reverse().toString();
        if (line.equals(reversed)){
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }
    }

    public static void fibonach(){
        int first = 0;
        int second = 1;
        int sum = 0;
        int number = 10;
        for (int i = 0; i < number ; i++) {
            sum = first + second;
            first = second;
            second = sum;
            System.out.println(sum);
        }
    }
    public static void sumChisla(int a, int b) {
//        factorial(15);
        Scanner chisla = new Scanner(System.in);

        int sum = a + b;
        System.out.println("Сумма ваших двух чисел = " + sum);
    }

    public static void massivSort2() {
        Scanner chisl = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = chisl.nextInt();
        int[] mass = new int[size];
        System.out.println("Заполните массив размерностью " + size + " любыми цифрами или числами");
        for (int i = 0; i < size; i++) {
            mass[i] = chisl.nextInt();
        }
//        По возрастанию
        Arrays.sort(mass);
        for (int i : mass) {
            System.out.println(i);
        }
        Integer[] boxedArray = Arrays.stream(mass).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, Comparator.reverseOrder());

        System.out.println("По убыванию");
        for (Integer i : boxedArray) {
            System.out.println(i);
        }
    }
    private static void massivSort() {
        Scanner chisl = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = chisl.nextInt();
        int [] mass = new int[size];
        System.out.println("Заполните массив размерностью " + size + " числами");
        for (int i = 0; i < size; i++) {
            mass[i] = chisl.nextInt();
        }
        for (int i = 0; i < size - 1 ; i++) {
            for (int j = 0; j < size - i - 1; j++) {

                if (mass[j] < mass[j+1]) {
                    int temp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(mass[i]);
        }
    }


    private static void prost() {
        System.out.print("Введите число которое вы хотите проверить на простоту");
        Scanner chisl = new Scanner(System.in);
        int prost = chisl.nextInt();
        boolean isPrime = true;
        if (prost <= 0) {
            isPrime = false;
            System.out.println("Вы ввели отрицательное число ");
        } else {
            for (int i = 2; i < prost; i++) {
                if (prost % i == 0) {
                    isPrime = false;
                    break;

                }
            }
        }
        if (isPrime) {
            System.out.println("Число является простым");
        }
        else{
            System.out.println("Число не простое");
        }
    }
    public static void factorial(int a) {
        int sum = 1;
        System.out.println("Введите факториал какого числа необходимо найти");
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        System.out.println("Факториал необходимого числа равен " + sum);
    }
    private static int sumOneHundred() {
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

}


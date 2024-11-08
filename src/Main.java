import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> a = new ArrayList<>();
        System.out.println("Введите 5 строк для списка А");
        for (int i = 0; i < 5; i++) {
            a.add(scanner.nextLine());
        }
        System.out.println("Список А");
        for (String s : a) {
            System.out.println(s);
        }

        ArrayList<String> b = new ArrayList<>();
        System.out.println("Введите 5 строк для списка Б");
        for (int i = 0; i < 5; i++) {
            b.add(scanner.nextLine());
        }
        System.out.println("Список Б");
        for (String x : b) {
            System.out.println(x);
        }

        List<String> c = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            c.add(a.get(i));
            c.add(b.get(4-i));
        }
        System.out.println("Список С");
        for (String d : c){
            System.out.println(d);
        }

        Collections.sort(c, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        System.out.println("Отсортированный список С по длине строки");
        for (String str : c){
            System.out.println(str);
        }
    }
}
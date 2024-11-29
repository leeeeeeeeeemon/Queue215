import java.util.ArrayDeque;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayDeque<String> cities = new ArrayDeque<String>();

        cities.add("Kazan"); // стандартное добавление
        cities.addFirst("Moscow"); // добавляем в самое начало
        cities.push("EKB"); // добавляем в самое начало
        cities.addLast("SPB"); //добавляем в самый конец


        String sFirst = cities.getFirst(); // первый элемент без удаления
        System.out.println(sFirst);
        String sFirstDel = cities.pop(); // первый элемент с удалением
        System.out.println(sFirstDel);
        String sLast = cities.getLast(); // последний элемент без удаления
        System.out.println(sLast);
        System.out.println();

        System.out.println(cities.size());




        //перебор без удаления
        for (String str : cities){
            System.out.println(str);
        }

        System.out.println();
        while(cities.peek()!=null){
            System.out.println(cities.pop());
        }

    }
}
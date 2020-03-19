import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteIntChar {
    public static void main(String[] args) {
        try (OutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\Documents\\Text\\new.txt")) {
            int num = 10122;
            char a = 'ю';
            for (int i = 3; i >= 0; i--) {
                fileOutputStream.write(num >> i * 8);
            }
            for (int i = 1; i >=0; i--) {
                fileOutputStream.write(a >> i * 8);
            }
        } catch (IOException e) {
            System.err.println("Err");
        }
    }
}

/*ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Барков", "Ибрагимова", "Евсикова", "Разувалова", "Файзуллин", "Романов",
                "Горшенина", "Камалеев", "Будревич", "Сафиуллин", "Мажник", "Амирова", "Романчук", "Федорова",
                "Тухватуллин", "Багманов", "Шагалиев", "Шакиржанов", "Максимов", "Гумерова", "Акчурина",
                "Нурмухаметов", "Хасанов", "Зинатуллин", "Аликиличова", "Цаплин", "Ширманов"));
        Collection engcl = arrayList;
        NaviSet<String> eng = new NaviSet<String>(engcl, c1);
        System.out.println(eng.toString());
        System.out.println("remove: " + eng.remove("Ширманов") + " " + eng.toString());
        System.out.println("contains: " + eng.contains("Акчурина"));
        System.out.println("isEmpty: " + eng.isEmpty());
        System.out.println();*/
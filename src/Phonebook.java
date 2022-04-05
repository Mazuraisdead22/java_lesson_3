import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Phonebook {

    public HashMap<String, List<String>> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (book.containsKey(name)) {
            List<String> numbers = book.get(name);
            if (!numbers.contains(phone)) {
                numbers.add(phone);
                System.out.println(phone + " | добавляем телефон к | " + name);
            } else {
                System.out.println(phone + " | нельзя добавить к | " + name);
            }
        }
    }
        public List<String> get(String name){
            if (book.containsKey(name)) {
                book.get(name);
            }
            return new ArrayList<>();
    }
}







public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Jein", "000000");
        phonebook.add("Nuna", "111111");
        phonebook.add("leon", "222222");
        phonebook.add("Staisy", "333333");
        phonebook.add("Falck", "444444");
        phonebook.add("Nuna", "555555");
        phonebook.add("Nuna", "666666");
        phonebook.add("Falck", "777777");
        phonebook.add("Jein", "888888");

        System.out.println(phonebook.get("Jein"));
        System.out.println(phonebook.get("Nuna"));
        System.out.println(phonebook.get("leon"));
        System.out.println(phonebook.get("Falck"));
    }
}

package ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
    Author pushkin = new Author("Александр", "Пушкин");
    Book collectionOfPushkinSPoems = new Book("Сборник стихов Пушкина",pushkin , 1820);
    collectionOfPushkinSPoems.setTitleOfTheBook("Сборник стихов Пушкина");
    System.out.println(collectionOfPushkinSPoems);

    Author gogol = new Author("Николай", "Гоголь");
    Book deadSouls = new Book("Мёртвые души", gogol, 1835);
    deadSouls.setTitleOfTheBook("Мёртвые души");
    System.out.println(deadSouls);

    deadSouls.setYearOfPublication(1999);
    System.out.println(deadSouls);

    System.out.println(pushkin.equals(gogol));

        System.out.println(pushkin.hashCode());
        System.out.println(gogol.hashCode());
        System.out.println(collectionOfPushkinSPoems.hashCode());
        System.out.println(deadSouls.hashCode());


}

}

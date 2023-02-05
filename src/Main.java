import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Book collectionOfPushkinSPoems = new Book("Сборник стихов Пушкина",pushkin , 1820);
        collectionOfPushkinSPoems.setTitleOfTheBook("Сборник стихов Пушкина");
        System.out.println("Название книги - " + collectionOfPushkinSPoems.getTitleOfTheBook() + ", Автор - " + pushkin.getName() + " " + pushkin.getSurname() + ", Год издания - " + collectionOfPushkinSPoems.getYearOfPublication() + " год.");

        Author gogol = new Author("Николай", "Гоголь");
        Book deadSouls = new Book("Мёртвые души", gogol, 1835);
        deadSouls.setTitleOfTheBook("Мёртвые души");
        System.out.println("Название книги - " + deadSouls.getTitleOfTheBook() + ", Автор - " + gogol.getName() + " " + gogol.getSurname() + ", Год издания - " + deadSouls.getYearOfPublication() +" год.");

        deadSouls.setYearOfPublication(1999);
        System.out.println("Название книги - " + deadSouls.getTitleOfTheBook() + ", Автор - " + gogol.getName() + " " + gogol.getSurname() + ", Год издания - " + deadSouls.getYearOfPublication() +" год.");
    }
}
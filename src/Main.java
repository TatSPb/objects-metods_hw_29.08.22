public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Ivan", "Petrov");
        Author secondAuthor = new Author("Ivan", "Sidorov");

        Book firstBook = new Book("Pro 2000th", firstAuthor, 2000);
        Book secondBook = new Book("Pro 2010th", secondAuthor, 2010);

        System.out.println("Author: " + firstAuthor.getFullName() + ". Book: " + firstBook.getBookName() + ". " + " Year: "
                + firstBook.getYear() + ".");
        System.out.println("Author: " + secondAuthor.getFullName() + ". Book: " + secondBook.getBookName() + ". " +
                " Year: " + secondBook.getYear() + ".");

        System.out.println(firstBook);
        System.out.println(secondBook);
        System.out.println(firstBook.hashCode());
    }
}
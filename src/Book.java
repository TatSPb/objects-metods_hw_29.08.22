import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private final int year;

    public Book(String bookName, Author author, int year) {
        this.bookName = bookName; //здесь this. обязательный
        this.author = author;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int hashCode() { // сравнивает hashcode объектов
        return Objects.hash(bookName, author, year);
    }

    @Override //сравнение  - одинаковые объекты или нет
    public boolean equals(Object o) { // o - объект, можно любое название поставить
        if (this == o) return true; //если объекты одинаковые, то дальше сравнивать не нужно, возвращай true
        //this подразумевает this.book (название класса). Конкретный объект, у которого мы хотим вызвать метод.
        if (o == null || getClass() != o.getClass())
            return false; //если пришедший объект пустой, или они не равны классом, возвращай false
        Book book = (Book) o; //приводим тип объекта к Book
        return year == book.year && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author); // сравниваем по полям
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", year=" + year +
                '}';
    }


}

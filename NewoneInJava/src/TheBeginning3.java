public class TheBeginning3 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\tTitle | Author\t\t\t Year  Pages  How long ro read?!");
        Book book1 = new Book("Great Mountain", "Scott Wilkins", 1974, 354);
        Book book2 = new Book("Jeffery's Life", "Helen Brooks", 2017, 154);
        Book book3 = new Book();

        book3.setTitle("1917: How They Are Gone");
        book3.setAuthor("Richard Bower");
        book3.setYearOfPublication(1953);
        book3.setNumberOfPages((421));

        Utilities.printInfo(book1.getTitle(), book1.getAuthor(), book1.getYearOfPublication(), book1.getNumberOfPages(),book1.);
        Utilities.printInfo(book2.getTitle(), book2.getAuthor(), book2.getYearOfPublication(), book2.getNumberOfPages());
        Utilities.printInfo(book3.getTitle(), book3.getAuthor(), book3.getYearOfPublication(), book3.getNumberOfPages());
    }
}

class Utilities {
    public static int daysToRead(int numberOfPages) {
        int averagePagesPerDay = 73;
        return numberOfPages / averagePagesPerDay;
    }

    public static void printInfo(String title, String author, int yearOfPublication, int numberOfPages, int daysToRead) {
        System.out.printf("Book added: %25s | %-15s %5d %5dp. \n", title, author, yearOfPublication, numberOfPages, daysToRead);
    }


}

class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private int numberOfPages;

    public Book() {
    }

    public Book(String title, String author, int yearOfPublication, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

}

package OOP.Practise;

public class Book {
    String bookName;
    String authorName;
    int pages;
    boolean isNonFiction;

    public Book(String bookName,String authorName,int page,boolean isNonFiction){
        this.bookName = bookName;
        this.authorName = authorName;
        this.pages = page;
        this.isNonFiction = isNonFiction;
    }

    public void printCountRows(){
        System.out.println("Book rows" + this.pages * 40);
    }

    public void printCountRows(int countRows){
        System.out.println("Book rows" + this.pages * countRows);
    }

    public void bookAdditionalInfo(){
        System.out.printf("This book called %s, has been written by %s, It %s fantastic",
                this.bookName,this.authorName,this.isNonFiction ? "is" : "is not");
    }




    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", pages=" + pages +
                ", isNonFiction=" + isNonFiction +
                '}';
    }
}

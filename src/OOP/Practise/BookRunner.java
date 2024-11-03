package OOP.Practise;

public class BookRunner {
    public  static void main(String[] args){

        Book book = new Book("The Lord Ring","Someone",50,false);
        System.out.println(book);
        book.printCountRows();
        book.printCountRows(50);
        book.bookAdditionalInfo();

    }

}

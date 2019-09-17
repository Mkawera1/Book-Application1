//Create another class called BookApp which contains the main method.

public class BookApp {
    public static void main(String[] args) {
        //In the main method you shall create an instance of a Book

        Book one = new Book("Clear", "Jane Smith","Blue book",5.5,true);

        //print the Author, Title and Description.

        String print = one.getDidsplayText();
        System.out.println(print);


    }
}

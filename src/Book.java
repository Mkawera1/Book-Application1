
//Create a Book class that allows for Book title, author, description, price and isInStock variables
//The Book class shall contain private member variables,
public class Book {
    private String title;
    private String author;
    private String description;
    private Double price;
    private Boolean isInStock;

    //a default constructor,
    public Book(){

    }
    //an overloaded constructor

    public Book(String title, String author, String description, Double price, Boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }
    //The application shall also contain getters and setters for each private member variable.

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getInStock() {
        return isInStock;
    }

    public void setInStock(Boolean inStock) {
        isInStock = inStock;
    }

    //a method called getDisplayText() which prints the author, title and description.

    public String getDidsplayText(){
        String getDisplayText = "";
        getDisplayText = "Author: "+ getAuthor() + "\nTitle: " + getTitle() + "\nDescription:" + getDescription();

        return getDisplayText;




    }
}

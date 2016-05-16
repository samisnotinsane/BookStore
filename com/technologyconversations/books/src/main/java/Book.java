import java.io.Serializable;

/**
 * Created by sameenislam on 16/05/2016.
 */
public class Book implements Serializable {

    private int id;
    private String imageUrl; // the URL to the item cover art
    private String title; // the title of the item
    private String author; // the author of the item
    private String price; // the price of the item
    private String link; // the link to the item details

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if(id != book.id) return false;
        if(imageUrl != book.imageUrl) return false;
        if(title != book.title) return false;
        if(author != book.author) return false;
        if(price != book.price) return false;
        if(link != book.link) return false;


    }
}

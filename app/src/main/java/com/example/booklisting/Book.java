package com.example.booklisting;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Book {
    public String Author;
    private String Title;
    private String Image;
    private String Url;


    /**
     * Constructs a new {@link Book} object.
     */
    public Book(String title,String author ,String imageUrl,String url )
    {
        Author=author;
        Title = title;
        Image=imageUrl;
        Url=url;
    }

    public String getTitle(){
        return Title;
    }

    public String getAuthor()
    {
        return Author;
    }

    public String getImage()
    {
        return Image;
    }
    public String getUrl()
    {
        return Url;
    }
}

package com.example.booklisting;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import android.graphics.drawable.GradientDrawable;

import androidx.core.content.ContextCompat;

import com.example.booklisting.Book;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {

    //    contruct a new Book adpater
//    context of the app
//    Earthquakes are the list of the Earthquakes,which is the data source for the adapter
    public BookAdapter(Context context, ArrayList<Book> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }
//   Find the earthquake at the given position in the list of earthquakes
        //this will helps us to find that about which earthquake we are talking about
        Book currentBook = getItem(position);

        ////SECTION FOR THE TITLE
        TextView title = (TextView) listItemView.findViewById(R.id.title_book);
        String titleName = currentBook.getTitle();
        title.setText(titleName);

        ///SECTION FOR THE AUTHOR
        TextView author = (TextView) listItemView.findViewById(R.id.author_book);
        String authorName = currentBook.getAuthor();
        author.setText(authorName);

        ///SECTION FOR THE IMAGE
        ImageView imageBook = (ImageView) listItemView.findViewById(R.id.imageBook);
        String imageurl = currentBook.getImage();
        imageBook.setImageURI(Uri.parse(imageurl));

        //   Return the List item view which is now showing the appropriate data
        return listItemView;
    }
}


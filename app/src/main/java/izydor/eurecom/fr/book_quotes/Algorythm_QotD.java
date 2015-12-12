package izydor.eurecom.fr.book_quotes;


import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;


public class Algorythm_QotD {
    private final String language;

    private final String favourite_language;
    private final String favourite_author;
    private final String favourite_book;
    private final String favourite_type;

    public Algorythm_QotD(Preferenc p, Context context){
        this.favourite_language=p.getFavouriteLanguage();
        this.favourite_author=p.getFavouriteAuthor();
        this.favourite_book=p.getFavouriteBook();
        this.favourite_type=p.getFavouriteType();

        this.language=java.util.Locale.getDefault().getDisplayLanguage();
    }

    public String getLanguage() {return language;}
    public String getFavourite_language() {return favourite_language;}
    public String getFavourite_author() {return favourite_author;}
    public String getFavourite_book() {return favourite_book;}
    public String getFavourite_type() {return favourite_type;}

}

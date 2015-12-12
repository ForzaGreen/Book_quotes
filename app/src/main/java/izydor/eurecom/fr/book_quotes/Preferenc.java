package izydor.eurecom.fr.book_quotes;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;



public class Preferenc {

    private SharedPreferences preferences;
    private final String favouriteLanguage;
    private final String favouriteAuthor;
    private final String favouriteBook;
    private final String favouriteType;

    Preferenc(SharedPreferences preferences){
        this.preferences=preferences;
        this.favouriteLanguage=preferences.getString("language", "n/a");
        this.favouriteAuthor=preferences.getString("author","n/a");
        this.favouriteBook=preferences.getString("book","n/a");
        this.favouriteType=preferences.getString("type","n/a");
    }

    public String getFavouriteLanguage(){return favouriteLanguage;}
    public String getFavouriteAuthor(){return favouriteAuthor;}
    public String getFavouriteBook(){return favouriteBook;}
    public String getFavouriteType(){return favouriteType;}
}

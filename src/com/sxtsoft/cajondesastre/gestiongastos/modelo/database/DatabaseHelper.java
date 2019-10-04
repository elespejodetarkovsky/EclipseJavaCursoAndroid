package com.sxtsoft.cajondesastre.gestiongastos.modelo.database;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DatabaseHelper extends SQLiteOpenHelper {

    private static DatabaseHelper sInstance;

    private static final String DATABASE_NAME = "GESTIONGASTOS.DB";

    private static final SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS");

    private DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

	public static Object getInstance(Context context) {
		// TODO Auto-generated method stub
		return null;
	}

    

}
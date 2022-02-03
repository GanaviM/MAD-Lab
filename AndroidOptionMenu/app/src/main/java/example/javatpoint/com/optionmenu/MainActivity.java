package example.javatpoint.com.optionmenu;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<Toolbar> extends AppCompatActivity {

    private static final android.R.attr R = ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public boolean booleanonCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean booleanonOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Item1 Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:

                Toast.makeText(getApplicationContext(),"Item2 Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:

                Toast.makeText(getApplicationContext(),"Item3 Selected",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

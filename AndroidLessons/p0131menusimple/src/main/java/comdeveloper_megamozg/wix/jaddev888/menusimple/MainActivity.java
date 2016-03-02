package comdeveloper_megamozg.wix.jaddev888.menusimple;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //За создание меню отвечает метод onCreateOptionsMenu.

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add("menu1");
        menu.add("menu2");
        menu.add("menu3");
        menu.add("menu4");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        //Определять нажатый пункт меню по тексту – это не самый лучший вариант. Далее будем делать это по ID.
        return super.onOptionsItemSelected(item);
    }

}
package comdeveloper_megamozg.wix.jaddev888.activitylistener;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* В этом примере активити используется как обработчик, реализуя интерфейс OnClickListener
При такой реализации мы не создали ни одного лишнего объекта (Activity создается в любом случае)
 и затраты памяти минимальны, это рекомендуемый метод.
  */
public class MainActivity extends Activity implements View.OnClickListener {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // найдем View-элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        //присваем обработчик кнопкам
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnOk:
                tvOut.setText("Нажата кнопка ОК");
                break;
            case R.id.btnCancel:
                tvOut.setText("Нажата кнопка Отмена");
                break;
        }
    }

}
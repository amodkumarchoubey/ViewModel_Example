package viewmodel.com;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.txt_count);

        // checking without ViewModel concept
        ViewModel_DataGenerator modelDataGenerator = new ViewModel_DataGenerator();
        String number = modelDataGenerator.getRan_Number();
        textView.setText(number);


        // checking with ViewModel concept
//        ViewModel_DataGenerator modelDataGenerator = ViewModelProviders.of(this).get(ViewModel_DataGenerator.class);
//        String number = modelDataGenerator.getRan_Number();
//        textView.setText(number);
    }
}

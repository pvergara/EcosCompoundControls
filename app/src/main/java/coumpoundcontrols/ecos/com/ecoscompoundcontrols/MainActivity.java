package coumpoundcontrols.ecos.com.ecoscompoundcontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import coumpoundcontrols.ecos.com.ecoscompoundcontrols.components.SideSpinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializes the side spinner from code.
        SideSpinner fruitsSpinner;
        fruitsSpinner = (SideSpinner) this.findViewById(R.id.sidespinner_fruits);

        CharSequence fruitList[] = {
            "Apple",
            "Orange",
            "Pear",
            "Grapes" };

        fruitsSpinner.setValues(fruitList);
        fruitsSpinner.setSelectedIndex(1);
    }

}


package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.yoey.testproject.MainActivity;

/**
 * Created by yoey on 4/13/16.
 */

public class JUnit_Test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;

    public JUnit_Test() {
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }
}

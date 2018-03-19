package sample.kingja.rangebarsir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.kingja.rangebarsir.RangeBar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RangeBar rangebar = findViewById(R.id.rangebar);
        rangebar.setOnRangeChangedListener(new RangeBar.OnRangeChangedListener() {
            @Override
            public void onRnageChanged(int minNum, int maxNum) {
                Log.e(TAG, "minNum: "+minNum+"  maxNum: "+maxNum );
            }
        });
    }
}

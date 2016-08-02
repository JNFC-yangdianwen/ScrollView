package com.example.yangdianwen.scrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private Button button1;
    private ScrollView scrollView;
    private TextView txt_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn1);
        button1 = (Button) findViewById(R.id.btn2);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        txt_show = (TextView) findViewById(R.id.tv_show);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append("呵呵 * " + i + "\n");
        }
        txt_show.setText(sb.toString());

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                scrollView.fullScroll(ScrollView.FOCUS_UP);
                break;
            case R.id.btn2:
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);

                break;
        }
    }
}

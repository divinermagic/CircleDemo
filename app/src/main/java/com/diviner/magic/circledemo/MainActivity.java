package com.diviner.magic.circledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * @author Diviner
 */
public class MainActivity extends AppCompatActivity {

    private EditText widthEdit,colorEdit;

    private Button widthBtn,colorBtn;

    private CircleView circleView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        circleView = findViewById(R.id.circle_view);


        widthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer wigth = Integer.parseInt(widthEdit.getText().toString());
                circleView.setThumbWidth(wigth);
            }
        });

        colorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String color = colorEdit.getText().toString();
                circleView.setThumbColor(color);
            }
        });

    }

    private void initView(){
        widthEdit = findViewById(R.id.edit_text);
        colorEdit = findViewById(R.id.edit_color);
        widthBtn = findViewById(R.id.btn_width);
        colorBtn = findViewById(R.id.btn_color);
    }


}

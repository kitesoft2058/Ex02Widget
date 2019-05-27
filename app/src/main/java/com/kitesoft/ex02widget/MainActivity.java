package com.kitesoft.ex02widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //멤버변수
    TextView tv; //참조변수
    Button btn;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xml에서 만들어진 View객체를 id로 찾아와서 참조변수에 대입
        tv= findViewById(R.id.tv);
        btn= findViewById(R.id.btn);
        edit= findViewById(R.id.edit);

        //버튼이 클릭되는 것을 듣는 리스너객체 생성 및 추가
        btn.setOnClickListener(new View.OnClickListener() {

            //버튼을 클릭하면 자동으로 실행되는 콜백메소드
            @Override
            public void onClick(View view) {
                //EditText에 써있는 글씨를 얻어오기.
                Editable editable= edit.getText();
                String s= editable.toString();

                //얻어온 글씨를 TextView에 설정
                tv.setText(s);
            }
        });

    }

}

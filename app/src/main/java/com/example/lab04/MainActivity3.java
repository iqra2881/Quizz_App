package com.example.lab04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{
    TextView tvquestion,tvanswer,tvtotallength_yy, tvpresentindex_xx;
    Button bleft, bshow, bright;
    String[] simple_ques,Simple_ans;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
         index=0;
        tvquestion=(TextView)findViewById(R.id.textView13);
        tvanswer=(TextView)findViewById(R.id.textView14);
        tvtotallength_yy=(TextView)findViewById(R.id.textView4);
        tvpresentindex_xx=(TextView)findViewById(R.id.textView3);

        bleft=(Button)findViewById(R.id.button5) ;
        bright=(Button)findViewById(R.id.button6) ;
        bshow=(Button)findViewById(R.id.button7);

        simple_ques=getResources().getStringArray(R.array.simple_ques);
        Simple_ans=getResources().getStringArray(R.array.Simple_ans);

        tvquestion.setText(simple_ques[index]);
        tvanswer.setText("Press \"A\" Button for Answer");
        tvtotallength_yy.setText("/"+ String.valueOf(simple_ques.length));
        tvpresentindex_xx.setText(String.valueOf(index+1));


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button5:
                tvanswer.setText("press \"A\" Button for the Answer ");
                index--;
                tvquestion.setText(simple_ques[index]);
                tvpresentindex_xx.setText(String.valueOf(index+1));
                break;

            case R.id.button6:
                tvanswer.setText(Simple_ans[index]);
                break;


            case R.id.button7:
                tvanswer.setText("press \"A\" Button for the Answer ");
                index++;
                tvquestion.setText(simple_ques[index]);
                tvpresentindex_xx.setText(String.valueOf(index+1));

                break;
        }

    }
}
package com.xuyu.myview.pay_password;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.xuyu.myview.R;

public class EighthActivity extends AppCompatActivity
{
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);
        mTextView = (TextView)findViewById(R.id.textview);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                new PayPasswordTool().showPayPassworsDialog(EighthActivity.this, new PayPasswordTool.InputFinishListener()
                {
                    @Override
                    public void inputFinish(String password)
                    {
                        mTextView.setText(password);
                    }
                });
            }
        });
    }
}

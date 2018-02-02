package com.utng.aquintero.evalunid1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    private TextView txvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

       txvData = (TextView)findViewById(R.id.txv_datas);

       Bundle bundle = this.getIntent().getExtras();

        txvData.setText(bundle.getString("Name")+", "+bundle.getString("Age")+", "+bundle.getString("Phone"));
    }
}

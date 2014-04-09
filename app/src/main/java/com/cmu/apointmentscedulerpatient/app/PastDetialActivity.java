package com.cmu.apointmentscedulerpatient.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class PastDetialActivity extends ActionBarActivity {

    private TextView detail = null;
    private Button ret = null;
    private Button doc = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_past_detial);
        this.detail = (TextView) super.findViewById(R.id.p_detail);
        this.ret = (Button) super.findViewById(R.id.p_ret);
        this.doc = (Button) super.findViewById(R.id.check_doc);
        this.detail.setText("Appointment 1");
        this.ret.setOnClickListener(new OnClickListenerImpl());
        this.doc.setOnClickListener(new OnClickListenerImplDoc());
    }

    private class OnClickListenerImpl implements OnClickListener {

        //if user press return button, the current activity will be finished
        //and return to the previous activity
        //because startActivityForResult is used in the previous activity
        public void onClick(View v){
            Intent it = new Intent(PastDetialActivity.this, PastActivity.class);
            PastDetialActivity.this.startActivity(it);
            PastDetialActivity.this.finish();
        }
    }

    private class OnClickListenerImplDoc implements OnClickListener {

        public void onClick(View v){
            Intent it = new Intent(PastDetialActivity.this, DocumentActivity.class);
            PastDetialActivity.this.startActivity(it);
            PastDetialActivity.this.finish();
        }
    }

    public void newTab(View view) {
        Intent intent = new Intent(this, SelectHospital.class);
        startActivity(intent);
    }

    public void past(View view){
        Intent intent = new Intent(this, PastActivity.class);
        startActivity(intent);

    }

    public void future(View view){
        Intent intent = new Intent(this, FutureActivity.class);
        startActivity(intent);

    }

    public void info(View view){
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);

    }

}

package com.example.homeautomation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

import android.widget.ArrayAdapter;
import android.widget.EditText;



public class AddDevice extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
     
    	getActionBar().setDisplayHomeAsUpEnabled(true);   
        
    	  
        
        
    	Intent intent = new Intent(getApplicationContext(),Dashboard.class);

       
    	EditText editText = (EditText) findViewById(R.id.float_label_2);
    	String message = editText.getText().toString();
    	intent.putExtra("txtData", message);
    }    

}

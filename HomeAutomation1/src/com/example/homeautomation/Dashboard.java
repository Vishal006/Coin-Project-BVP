package com.example.homeautomation;

import com.getbase.floatingactionbutton.FloatingActionButton;
import android.widget.ListView;
import java.util.List;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Dashboard extends Activity {

	
	 Button add1;
     public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
     private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    
        
        getActionBar().setDisplayHomeAsUpEnabled(true);   
        
        final FloatingActionButton add = (FloatingActionButton) findViewById(R.id.add_app);
        add.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View v) {
  			// TODO Auto-generated method stub
  			Intent i = new Intent(getBaseContext(),AddDevice.class);
  			startActivity(i);
  		}
        });
        
        final FloatingActionButton rem1 = (FloatingActionButton) findViewById(R.id.rem_app);
        rem1.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View v) {
  			// TODO Auto-generated method stub
  			Intent i = new Intent(getBaseContext(),Remove.class);
  			startActivity(i);
  		}
        });
        
	    
	try{
		Intent intent = getIntent();
	
	String message = intent.getExtras().getString("txtData","");     
 
	lv = (ListView) findViewById(R.id.listView1);

    List<String> your_array_list = new ArrayList<String>();
    your_array_list.add(message);
    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>( this, R.layout.list, your_array_list );

    lv.setAdapter(arrayAdapter); 
	}catch(Exception e)
	{
		
	}
        

        // This is the array adapter, it takes the context of the activity as a 
        // first parameter, the type of list view as a second parameter and your 
        // array as a third parameter.
   
   
    
    }

}

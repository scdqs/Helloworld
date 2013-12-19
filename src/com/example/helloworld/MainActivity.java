package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        System.out.println("");
        System.out.println("新增内容22");
        System.out.println("新增内容333---from company");
         System.out.println("新增内容444---from github edit");
         System.out.println("新增内容444---from local");
         
          System.out.println("新增内容5555---from github edit2222");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

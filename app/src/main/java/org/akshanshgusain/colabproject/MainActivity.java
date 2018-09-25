package org.akshanshgusain.colabproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hii sir how are you..
        mytest();
    }

    public  void  mytest()
    {
        Toast.makeText(this, "hii this my new method", Toast.LENGTH_SHORT).show();
    }
}

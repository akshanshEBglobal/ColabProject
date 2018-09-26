package org.akshanshgusain.colabproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void akshansh()
    {
        //Akshansh Comment 2
    }

    public void akshansh2()
    {
        //Akshansh Comment 2
        Toast.makeText(this, "Random Toast", Toast.LENGTH_SHORT).show();
        //Why this  ^^^^ toast man?

    }
}

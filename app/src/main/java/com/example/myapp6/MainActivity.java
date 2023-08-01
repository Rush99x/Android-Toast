package com.example.myapp6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ShowToastSus(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void ShowToastError(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void ShowToastInfo(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Info",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void ShowToastWarning(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Warning",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void ShowToastNormal(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Normal",Toast.LENGTH_SHORT);
        toast.show();
    }
}
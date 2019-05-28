package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.alumno.myapplication.models.XPath;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<XPath> mylistita = new ArrayList<>();
        XPath mypath = new XPath( 72.2806191, 42.9279048);
        mylistita.add(mypath);

        XPath mypath1 = new XPath( 72.2782481, 42.9277712);
        mylistita.add(mypath1);

        XPath mypath2 = new XPath( 72.2787952, 42.9263179);
        mylistita.add(mypath2);

        XPath mypath3 = new XPath( 72.2805011, 42.9262865);
        mylistita.add(mypath2);

        XPath mypath4 = new XPath( 72.2806084, 42.927842);
        mylistita.add(mypath2);


        //mesage
        String url= "https://www.keene.edu/campus/maps/tool/?coordinates=-";

        String ruta ="";

        Toast.makeText(this,
                String.format("Hay %s elemtos | %s",
                        mylistita.size(),"todo va bien"),
                 Toast.LENGTH_LONG).show();

        int i = 1;
        for (XPath current_object: mylistita){
           ruta += current_object.latitud +"&2c%20"+ current_object.longitud;

           if (i < mylistita.size()){
               ruta += "%0A";
           }
           i++;
        }

        Log.v("bichito",url+ruta);

        setContentView(R.layout.activity_main);
    }
}

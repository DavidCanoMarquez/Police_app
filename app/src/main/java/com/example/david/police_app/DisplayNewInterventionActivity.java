package com.example.david.police_app;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import Constructors.Intervention;
import DataSource.InterventionDataSource;


public class DisplayNewInterventionActivity extends AppCompatActivity {
    private EditText name, dateB,dateE,localisation,description;
    private String iname,idateB,idateE,ilocalisation,idescription;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newintervention_activity);


    }

    /** Called when officer click submit intervention button */
    public void submitIntervention(View view) {

        Intent intent = new Intent(this, DisplayInterventionsActivity.class);

        InterventionDataSource ids = new InterventionDataSource(this);

        List<Intervention> interventions = new ArrayList<Intervention>();

        interventions = ids.getAllInterventions();
        id = interventions.size()+1;

        name = (EditText) findViewById(R.id.name);
        iname = name.getText().toString();

        dateB = (EditText) findViewById(R.id.dateB);
        idateB = dateB.getText().toString();

        dateE = (EditText) findViewById(R.id.dateE);
        idateE = dateE.getText().toString();

        localisation = (EditText) findViewById(R.id.localisation);
        ilocalisation = localisation.getText().toString();

        description = (EditText) findViewById(R.id.description);
        idescription = description.getText().toString();

        Intervention i1 = new Intervention(id, iname,"red",idescription,idateB,idateE,ilocalisation,1,2);

        ids.createIntervention(i1);

        startActivity(intent);


    }


}
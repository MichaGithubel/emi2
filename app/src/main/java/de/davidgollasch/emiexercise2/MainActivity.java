package de.davidgollasch.emiexercise2;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spContacts;
    private TextView
            tvTitle,
            tvFirstName,
            tvLastName,
            tvAddress,
            tvZip,
            tvCity,
            tvCountry;
    /*
    TODO: (TASK 2.2 and 3.3) Add required new UI widgets (EditTexts and Buttons) here
     */

    /*
    TODO: (TASK 2.1) Add data structure for contact details here
     */
    ArrayList<String> title;
    ArrayList<String> vorname;
    ArrayList<String> nachname;
    ArrayList<String> straße;
    ArrayList<String> stadt;
    ArrayList<String> land;
    ArrayList<String> plz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(getResources().getColor(R.color.tuHausfarbeBlauDunkel)));

        InitializeApp();
    }

    /**
     * Construct the Interactive Structure
     */
    private void InitializeApp() {
        spContacts = (Spinner) findViewById(R.id.spinnerContacts);

        tvTitle = (TextView) findViewById(R.id.textViewTitle);
        tvFirstName = (TextView) findViewById(R.id.textViewFirstName);
        tvLastName = (TextView) findViewById(R.id.textViewLastName);
        tvAddress = (TextView) findViewById(R.id.textViewAddress);
        tvZip = (TextView) findViewById(R.id.textViewZip);
        tvCity = (TextView) findViewById(R.id.textViewCity);
        tvCountry = (TextView) findViewById(R.id.textViewCountry);

        /*
        TODO: (TASK 2.2 and 3.3) Bind required new UI widgets (EditTexts and Buttons) here
         */


        /*
        TODO: (TASK 2.1) Fill contacts

        IMPORTANT: Fill the list with at least one item. Else, the spinner could look empty for some reason.

        1. create list of contacts

        2. create ArrayAdapter adapter

        3. spContacts.setAdapter(adapter);
         */

        /*
        Herr Robert Meyer       Frau Elisabeth Stramm       Herr Stefan Wennige
        Apfelbergstraße 10      Fritz-Konzert-Straße 1a     Kirchplatz 13
        9430 St. Margrethen     6020 Innsbruck              6112 Wattens
        Schweiz                 Österreich                  Österreich


        Frau Ella Beckmann      Frau Anne Watson
        Falkenstraße 3          1 Langdon Park Rd
        01067 Dresden           London N6 5PS
        Deutschland             Vereinigtes Königreich
         */
        title=new ArrayList<>();
        title.add("Herr");
        title.add("Frau");
        title.add("Herr");
        title.add("Frau");
        title.add("Frau");
        vorname=new ArrayList<>();
        vorname.add("Robert");
        vorname.add("Elisabeth");
        vorname.add("Stefan");
        vorname.add("Ella");
        vorname.add("Anne");
        nachname=new ArrayList<>();
        nachname.add("Meyer");
        nachname.add("Stramm");
        nachname.add("Wennige");
        nachname.add("Beckmann");
        nachname.add("Watson");
        straße=new ArrayList<>();
        straße.add("Apfelbergstraße 10");
        straße.add("Fritz-Konzert-Straße 1a");
        straße.add("Kirchplatz 13");
        straße.add("Falkenstraße 3");
        straße.add("1 Langdon Park Rd");
        stadt=new ArrayList<>();
        stadt.add("St Margrethen");
        stadt.add("Innsbruck");
        stadt.add("Wattens");
        stadt.add("Dresden");
        stadt.add("London");
        land=new ArrayList<>();
        land.add("Schweiz");
        land.add("Österreich");
        land.add("Österreich");
        land.add("Deutschland");
        land.add("Vereinigtes Königreich");
        plz=new ArrayList<>();
        plz.add("9430");
        plz.add("6020");
        plz.add("6112");
        plz.add("01067");
        plz.add("N6 5PS");
        String[] contactName = {"Herr Robert Meyer","Frau Elisabeth Stramm","Herr Stefan Wennige","Frau Ella Beckmann","Frau Anne Watson"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, contactName);
        spContacts.setAdapter(adapter);
        spContacts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(!(view instanceof TextView))
                    return;

                TextView item = (TextView) view;
                String selectedName = item.getText().toString();

                /*
                TODO: selectedName contains the selected spinner item as String Show

                Let's show the contact's details:
                 */
                DisplayContactDetails(selectedName);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // do nothing
            }
        });
    }
    /**
     * Set the displayed contact details by contact name
     * @param contactName contact's name
     */
    private void DisplayContactDetails(String contactName) {
        // TODO: Get contact by selected name
        int id=0;
        if (contactName=="Herr Robert Meyer")
            id=0;
        if (contactName=="Frau Elisabeth Stramm")
            id=1;
        if (contactName=="Herr Stefan Wennige")
            id=2;
        if (contactName=="Frau Ella Beckmann")
            id=3;
        if (contactName=="Frau Anne Watson")
            id=4;
        // TODO: Fill TextViews with contact details
        tvTitle.setText(land.get(id));
        tvFirstName.setText(vorname.get(id));
        tvLastName.setText(nachname.get(id));
        tvAddress.setText(straße.get(id));
        tvZip.setText(plz.get(id));
        tvCity.setText(stadt.get(id));
        tvCountry.setText(land.get(id));
    }



}

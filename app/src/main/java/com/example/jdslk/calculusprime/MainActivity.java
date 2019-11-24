package com.example.jdslk.calculusprime;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;



/***Champions***/

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, MiddleMan_Interface {


    /**Fragments Handled by Main Activity**/
    private android.support.v4.app.Fragment frag_display = new Frag_display();
    private android.support.v4.app.Fragment frag_keypad = new Frag_keypad();
    private android.support.v4.app.Fragment frag_differentiate_functions = new Frag_differentiate_functions();


    @Override
    public void data_carrier(String data){

        FragmentManager manager = getSupportFragmentManager();
        Frag_differentiate_functions frag_differentiate_functions = (Frag_differentiate_functions) manager.findFragmentById(R.id.display_frag_in_MainActivity);
        Frag_keypad frag_keypad = (Frag_keypad) manager.findFragmentById(R.id.keypad_frag_in_MainActivity);
        frag_differentiate_functions.change_data(data);
        frag_keypad.change_data(data);

    }//end data_carrier()


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**Link Spinner**/
        final Spinner topics_spinner = findViewById(R.id.topics_spinner);

        /**Add Toolbar**/
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**Show 'Display Fragment' On Activity Start*/
        getSupportFragmentManager().beginTransaction().add(R.id.display_frag_in_MainActivity, frag_display).commit();


        /**This Array puts content to each row in spinner**/
        final String topicsArray [] = {"Select topic","Differentiate Functions","Product Rule","Quotient Rule","Chain Rule","Second Derivative","Turning Point $ Nature","Implicit Function"};

        /**INITIAL SPINNER TITLE**/
        //topics_spinner.setPrompt("Topics");

        /**SETUP AN ARRAY ADAPTER**/
        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, topicsArray);

        /**SETTING UP THE ADAPTER**/
        topics_spinner.setAdapter(arrayAdapter);





        /**************************************************************************************************************/
        /*************************************START SPINNER LISTENER**************************************************/

        topics_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //getting data from the selected row and using it however we want
                String topicName = topics_spinner.getItemAtPosition(position).toString();


                /******************IF SPINNER**************/

                if(topicName.equals("Differentiate Functions")){

                    /**launch keypad**/
                    getSupportFragmentManager().beginTransaction().replace(R.id.keypad_frag_in_MainActivity, frag_keypad).commit();

                    /**launch frag_differentiate_functions**/
                    getSupportFragmentManager().beginTransaction().replace(R.id.display_frag_in_MainActivity, frag_differentiate_functions).commit();

                }//end if()

            }//end onItemSelected()

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //do nothing
            }
        });
        /*************************************END SPINNER LISTENER**************************************************/
        /***********************************************************************************************************/






        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        RelativeLayout relayout = new RelativeLayout(this);

    }//end onCreate()




    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        } else if (id == R.id.help) {
            intent = new Intent(getApplicationContext(),Help.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent;
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {

            intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);

        } else if (id == R.id.favorites) {

            intent = new Intent(getApplicationContext(),Favorites.class);
            startActivity(intent);

        } else if (id == R.id.random_questions) {


        } else if (id == R.id.about) {

            intent = new Intent(getApplicationContext(),About_us.class);
            startActivity(intent);

        } else if (id == R.id.exit) {

            System.exit(0);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}//End Class


package com.example.chamara.kancollesoundboard;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by leiroux on 11/25/2015.
 */
public class favorites extends AppCompatActivity {
    private Button back, newname, Clear;
    private EditText namer;
    private ToggleButton toggler;
    private TextView textlist;
    Context ctx= this;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorites);
        back = (Button)findViewById(R.id.btnreturn);
        toggler = (ToggleButton)findViewById(R.id.tbonoff);
        namer = (EditText)findViewById(R.id.editText);
        newname = (Button)findViewById(R.id.btnnewname);
        textlist = (TextView)findViewById(R.id.txtclicks);
        Clear = (Button)findViewById(R.id.btnClear);
        SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
        textlist.setText("Library intro:"+ sharedPrefs.getInt("libraryintronumber",0)+
                        "\nIntroduction:" + sharedPrefs.getInt("introductionnumber",0)+
                        "\nSecretary 1:" + sharedPrefs.getInt("secretary1number",0)+
                        "\nSecretary 2:" + sharedPrefs.getInt("secretary2number",0)+
                        "\nSecretary 3:" + sharedPrefs.getInt("secretary3number",0)+
                        "\nSecretary married:" + sharedPrefs.getInt("secretarymarriednumber",0)+
                        "\nWedding:" + sharedPrefs.getInt("weddingnumber",0)+
                        "\nShow player:" + sharedPrefs.getInt("showplayernumber",0)+
                        "\nJoining a fleet:" + sharedPrefs.getInt("joiningafleetnumber",0)+
                        "\nEquipment 1:" + sharedPrefs.getInt("equipment1number",0)+
                        "\nEquipment 2:" + sharedPrefs.getInt("equipment2number",0)+
                        "\nEquipment 3:" + sharedPrefs.getInt("equipment3number",0)+
                        "\nSupply:"+sharedPrefs.getInt("supplynumber",0)+
                        "\nDocking minor::"+sharedPrefs.getInt("dockingminornumber",0)+
                        "\nDocking::"+sharedPrefs.getInt("dockingnumber",0)+
                        "\nShip:"+sharedPrefs.getInt("shipnumber",0)+
                        "\nReturn from:"+sharedPrefs.getInt("returnfromnumber",0)+
                        "\nStart a sortie:"+sharedPrefs.getInt("startasortienumber",0)+
                        "\nBattle start:"+sharedPrefs.getInt("battlestartnumber",0)+
                        "\nAttack:"+sharedPrefs.getInt("attacknumber",0)+
                        "\nNight Battle:"+sharedPrefs.getInt("nightbattlenumber",0)+
                        "\nNight Attack:"+sharedPrefs.getInt("nightattacknumber",0)+
                        "\nMVP:"+sharedPrefs.getInt("MVPnumber",0)+
                        "\nMinor 1:"+sharedPrefs.getInt("minor1number",0)+
                        "\nMinor 2:"+sharedPrefs.getInt("minor2number",0)+
                        "\nModerately:"+sharedPrefs.getInt("moderatelynumber",0)+
                        "\nSunk:"+sharedPrefs.getInt("sunknumber",0)+
                        "\nIdle:"+sharedPrefs.getInt("idlenumber",0)+
                        "\nInstant repair:"+sharedPrefs.getInt("instantrepairnumber",0)

        );
        newname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (namer.getText().toString().equals("")) {
                    Toast.makeText(favorites.this, "No name!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(favorites.this, "New Name Added!", Toast.LENGTH_SHORT).show();

                    DatabaseHandler DB = new DatabaseHandler(ctx);
                    DB.addName(DB, namer.getText().toString());
                    /*
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                    editor.putString("toggletext", namer.getText().toString());
                    editor.commit();*/
                    namer.setText("");
                   // db.addName(namer.getText().toString());

                }
            }
        });
        toggler.setChecked(sharedPrefs.getBoolean("togglebutton", true));
        toggler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((toggler.isChecked())) {

                    SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                    editor.putBoolean("togglebutton", true);
                    editor.commit();

                } else {
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                    editor.putBoolean("togglebutton", false);
                    editor.commit();
                }
            }
        });
        back.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
            finish();
            }

        });
        Clear.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){

                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("libraryintronumber", 0);
                editor.putInt("introductionnumber", 0);
                editor.putInt("secretary1number", 0);
                editor.putInt("secretary2number", 0);
                editor.putInt("secretary3number", 0);
                editor.putInt("secretarymarriednumber", 0);
                editor.putInt("weddingnumber", 0);
                editor.putInt("showplayernumber", 0);
                editor.putInt("joiningafleetnumber", 0);
                editor.putInt("equipment1number", 0);
                editor.putInt("equipment2number", 0);
                editor.putInt("equipment3number", 0);
                editor.putInt("supplynumber", 0);
                editor.putInt("dockingminornumber", 0);
                editor.putInt("dockingnumber", 0);
                editor.putInt("shipnumber", 0);
                editor.putInt("returnfromnumber", 0);
                editor.putInt("startasortienumber", 0);
                editor.putInt("battlestartnumber", 0);
                editor.putInt("attacknumber", 0);
                editor.putInt("nightbattlenumber", 0);
                editor.putInt("nightattacknumber", 0);
                editor.putInt("MVPnumber", 0);
                editor.putInt("minor1number", 0);
                editor.putInt("minor2number", 0);
                editor.putInt("moderatelynumber", 0);
                editor.putInt("sunknumber", 0);
                editor.putInt("idlenumber", 0);
                editor.putInt("instantrepairnumber", 0);
                namer.setText("");
                editor.commit();
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                textlist.setText("Library intro:" + sharedPrefs.getInt("libraryintronumber", 0) +
                                "\nIntroduction:" + sharedPrefs.getInt("introductionnumber", 0) +
                                "\nSecretary 1:" + sharedPrefs.getInt("secretary1number", 0) +
                                "\nSecretary 2:" + sharedPrefs.getInt("secretary2number", 0) +
                                "\nSecretary 3:" + sharedPrefs.getInt("secretary3number", 0) +
                                "\nSecretary married:" + sharedPrefs.getInt("secretarymarriednumber", 0) +
                                "\nWedding:" + sharedPrefs.getInt("weddingnumber", 0) +
                                "\nShow player:" + sharedPrefs.getInt("showplayernumber", 0) +
                                "\nJoining a fleet:" + sharedPrefs.getInt("joiningafleetnumber", 0) +
                                "\nEquipment 1:" + sharedPrefs.getInt("equipment1number", 0) +
                                "\nEquipment 2:" + sharedPrefs.getInt("equipment2number", 0) +
                                "\nEquipment 3:" + sharedPrefs.getInt("equipment3number", 0) +
                                "\nSupply:" + sharedPrefs.getInt("supplynumber", 0) +
                                "\nDocking minor::" + sharedPrefs.getInt("dockingminornumber", 0) +
                                "\nDocking::" + sharedPrefs.getInt("dockingnumber", 0) +
                                "\nShip:" + sharedPrefs.getInt("shipnumber", 0) +
                                "\nReturn from:" + sharedPrefs.getInt("returnfromnumber", 0) +
                                "\nStart a sortie:" + sharedPrefs.getInt("startasortienumber", 0) +
                                "\nBattle start:" + sharedPrefs.getInt("battlestartnumber", 0) +
                                "\nAttack:" + sharedPrefs.getInt("attacknumber", 0) +
                                "\nNight Battle:" + sharedPrefs.getInt("nightbattlenumber", 0) +
                                "\nNight Attack:" + sharedPrefs.getInt("nightattacknumber", 0) +
                                "\nMVP:" + sharedPrefs.getInt("MVPnumber", 0) +
                                "\nMinor 1:" + sharedPrefs.getInt("minor1number", 0) +
                                "\nMinor 2:" + sharedPrefs.getInt("minor2number", 0) +
                                "\nModerately:" + sharedPrefs.getInt("moderatelynumber", 0) +
                                "\nSunk:" + sharedPrefs.getInt("sunknumber", 0) +
                                "\nIdle:" + sharedPrefs.getInt("idlenumber", 0) +
                                "\nInstant repair:" + sharedPrefs.getInt("instantrepairnumber", 0)

                );
            }
        });
    }

}

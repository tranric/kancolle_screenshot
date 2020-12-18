package com.example.chamara.kancollesoundboard;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by leiroux on 11/10/2015.
 */
public class quotes extends AppCompatActivity {
    //fix stablility issues.
    //fusou has issues when changing pictures
    //11/30/2015

    private TextView Kancollename;
    private Button introduction, libraryintro, secretary1, secretary2, secretary3, secretarymarried, wedding, showplayer,joiningafleet;
    private Button equipment1, equipment2, equipment3, supply, dockingminor, docking, ship, returnfrom, startasortie, battlestart, attack;
    private Button nightbattle, nightattack, MVP, minor1, minor2, moderately, sunk, idle, instantrepair;
    private ImageView kancollepicture;
    private Integer clickcount;

    private int introductionintroduction, secretary1secretary1;
    private int secretary2secretary2, secretary3secretary3, secretarymarriedsecretarymarried, weddingwedding;
    private int showplayershowplayer,joiningafleetjoiningafleet, equipment1equipment1, equipment2equipment2;
    private int equipment3equipment3, supplysupply, dockingminordockingminor, dockingdocking, shipship, returnfromreturnfrom;
    private int startasortiestartasortie, battlestartbattlestart, attackattack, nightbattlenightbattle, nightattacknightattack;
    private int MVPMVP, minor1minor1, minor2minor2, moderatelymoderately, sunksunk, instantrepairinstantrepair;

    private SoundPool introductionsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private MediaPlayer libraryintrosound;
    private SoundPool secretary1sound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool secretary2sound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool secretary3sound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool secretarymarriedsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool weddingsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool showplayersound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool joiningafleetsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool equipment1sound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool equipment2sound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool equipment3sound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool supplysound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool dockingminorsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool dockingsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool shipsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool returnfromsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool startasortiesound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool battlestartsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool attacksound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool nightbattlesound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool nightattacksound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool MVPsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool minor1sound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool minor2sound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool moderatelysound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool sunksound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool instantrepairsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quotes);
        final Vibrator var = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        Button rereturn = (Button) findViewById(R.id.btnreturn);
        introduction = (Button) findViewById(R.id.btnintroduction);
        libraryintro = (Button) findViewById(R.id.btnlibrary_intro);


        secretary1 = (Button) findViewById(R.id.btnsecretary1);
        secretary2 = (Button) findViewById(R.id.btnsecretary2);
        secretary3 = (Button) findViewById(R.id.btnsecretary3);
        secretarymarried = (Button) findViewById(R.id.btnsecretary_married);
        wedding = (Button) findViewById(R.id.btnwedding);
        showplayer = (Button) findViewById(R.id.btnshow_player);
        joiningafleet = (Button) findViewById(R.id.btnjoining_a_fleet);
        equipment1 = (Button) findViewById(R.id.btnequipment1);
        equipment2 = (Button) findViewById(R.id.btnequipment2);
        equipment3 = (Button) findViewById(R.id.btnequipment3);
        supply = (Button) findViewById(R.id.btnsupply);
        dockingminor = (Button) findViewById(R.id.btndocking_minor);
        docking = (Button) findViewById(R.id.btndocking);
        ship = (Button) findViewById(R.id.btnship);
        returnfrom = (Button) findViewById(R.id.btnreturn_from);
        startasortie = (Button) findViewById(R.id.btnstart_a_sortie);
        battlestart = (Button) findViewById(R.id.btnbattle_start);
        attack = (Button) findViewById(R.id.btnattack);
        nightbattle = (Button) findViewById(R.id.btnnight_battle);
        nightattack = (Button) findViewById(R.id.btnnight_attack);
        MVP = (Button) findViewById(R.id.btnMVP);
        minor1 = (Button) findViewById(R.id.btnminor1);
        minor2 = (Button) findViewById(R.id.btnminor2);
        moderately = (Button) findViewById(R.id.btnmoderately);
        sunk = (Button) findViewById(R.id.btnsunk);
        idle = (Button) findViewById(R.id.btnidle);
        instantrepair = (Button) findViewById(R.id.btninstant_repair);
        kancollepicture = (ImageView) findViewById(R.id.imgkancolle);

        Intent callingIntent = getIntent();
        final String name = callingIntent.getStringExtra("outputtext");
        Kancollename = (TextView) findViewById(R.id.KancolleID);
        Kancollename.setText("Kancolle: " + name);
        libraryintrosound = MediaPlayer.create(quotes.this, R.raw.fubukilibraryintro);
        if (name.equals("Fubuki")){
            introductionintroduction = introductionsound.load(this, R.raw.fubukiintroduction,1);
            secretary1secretary1 = secretary1sound.load(this, R.raw.fubukisecretary1, 1);
            secretary2secretary2 = secretary2sound.load(this, R.raw.fubukisecretary2, 1);
            secretary3secretary3 = secretary3sound.load(this, R.raw.fubukisecretary3, 1);
            secretarymarriedsecretarymarried = secretarymarriedsound.load(this, R.raw.fubukisecretarymarried, 1);
            weddingwedding = weddingsound.load(this, R.raw.fubukiwedding, 1);
            showplayershowplayer = showplayersound.load(this, R.raw.fubukishowplayer,1);
            joiningafleetjoiningafleet = joiningafleetsound.load(this, R.raw.fubukijoiningafleet,1);
            equipment1equipment1 = equipment1sound.load(this, R.raw.fubukiequipment1,1);
            equipment2equipment2 = equipment2sound.load(this, R.raw.fubukiequipment2,1);
            equipment3equipment3 = equipment3sound.load(this, R.raw.fubukiequipment3,1);
            supplysupply = supplysound.load(this, R.raw.fubukisupply,1);
            dockingminordockingminor = dockingminorsound.load(this, R.raw.fubukidockingminor,1);
            dockingdocking = dockingsound.load(this, R.raw.fubukidocking,1);
            shipship = shipsound.load(this, R.raw.fubukiship,1);
            returnfromreturnfrom = returnfromsound.load(this, R.raw.fubukireturnfrom,1);
            startasortiestartasortie = startasortiesound.load(this, R.raw.fubukistartasortie,1);
            battlestartbattlestart = battlestartsound.load(this, R.raw.fubukibattlestart,1);
            attackattack = attacksound.load(this, R.raw.fubukiattack,1);
            nightbattlenightbattle = nightbattlesound.load(this, R.raw.fubukinightbattle,1);
            nightattacknightattack = nightattacksound.load(this, R.raw.fubukinightattack,1);
            MVPMVP = MVPsound.load(this, R.raw.fubukimvp,1);
            minor1minor1 = minor1sound.load(this, R.raw.fubukiminor,1);
            minor2minor2 = minor2sound.load(this, R.raw.fubukiminor2,1);
            moderatelymoderately = moderatelysound.load(this, R.raw.fubukimoderately,1);
            sunksunk = sunksound.load(this, R.raw.fubukisunk,1);
            instantrepairinstantrepair = instantrepairsound.load(this, R.raw.fubukiinstantrepair,1);
            kancollepicture.setImageResource(R.drawable.fubuki);
        }

        if (name.equals("Kisaragi")){
            introductionintroduction = introductionsound.load(this, R.raw.kisaragiintroduction,1);
            secretary1secretary1 = secretary1sound.load(this, R.raw.kisaragisecretary1, 1);
            secretary2secretary2 = secretary2sound.load(this, R.raw.kisaragisecretary2, 1);
            secretary3secretary3 = secretary3sound.load(this, R.raw.kisaragisecretary3, 1);
            secretarymarriedsecretarymarried = secretarymarriedsound.load(this, R.raw.kisaragisecretarymarried, 1);
            weddingwedding = weddingsound.load(this, R.raw.kisaragiwedding, 1);
            showplayershowplayer = showplayersound.load(this, R.raw.kisaragishowplayer,1);
            joiningafleetjoiningafleet = joiningafleetsound.load(this, R.raw.kisaragijoiningafleet,1);
            equipment1equipment1 = equipment1sound.load(this, R.raw.kisaragiequipment1,1);
            equipment2equipment2 = equipment2sound.load(this, R.raw.kisaragiequipment2,1);
            equipment3equipment3 = equipment3sound.load(this, R.raw.kisaragiequipment3,1);
            supplysupply = supplysound.load(this, R.raw.kisaragisupply,1);
            dockingminordockingminor = dockingminorsound.load(this, R.raw.kisaragidockingminor,1);
            dockingdocking = dockingsound.load(this, R.raw.kisaragidocking,1);
            shipship = shipsound.load(this, R.raw.kisaragiship,1);
            returnfromreturnfrom = returnfromsound.load(this, R.raw.kisaragireturnfrom,1);
            startasortiestartasortie = startasortiesound.load(this, R.raw.kisaragistartasortie,1);
            battlestartbattlestart = battlestartsound.load(this, R.raw.kisaragibattlestart,1);
            attackattack = attacksound.load(this, R.raw.kisaragiattack,1);
            nightbattlenightbattle = nightbattlesound.load(this, R.raw.kisaraginightbattle,1);
            nightattacknightattack = nightattacksound.load(this, R.raw.kisaraginightattack,1);
            MVPMVP = MVPsound.load(this, R.raw.kisaragimvp,1);
            minor1minor1 = minor1sound.load(this, R.raw.kisaragiminor,1);
            minor2minor2 = minor2sound.load(this, R.raw.kisaragiminor2,1);
            moderatelymoderately = moderatelysound.load(this, R.raw.kisaragimoderately,1);
            sunksunk = sunksound.load(this, R.raw.kisaragisunk,1);
            instantrepairinstantrepair = instantrepairsound.load(this, R.raw.kisaragiinstantrepair,1);
            kancollepicture.setImageResource(R.drawable.kisaragi);
        }

        if (name.equals("Akebono")){
            attackattack = attacksound.load(this, R.raw.akebonoattack,1);
            battlestartbattlestart = battlestartsound.load(this, R.raw.akebonobattlestart,1);
            dockingdocking = dockingsound.load(this, R.raw.akebonodocking,1);
            dockingminordockingminor = dockingminorsound.load(this, R.raw.akebonodockingminor,1);
            equipment1equipment1 = equipment1sound.load(this, R.raw.akebonoequipment1,1);
            equipment2equipment2 = equipment2sound.load(this, R.raw.akebonoequipment2,1);
            equipment3equipment3 = equipment3sound.load(this, R.raw.akebonoequipment3,1);
            instantrepairinstantrepair = instantrepairsound.load(this, R.raw.akebonoinstantrepair,1);
            introductionintroduction = introductionsound.load(this, R.raw.akebonointroduction,1);
            joiningafleetjoiningafleet = joiningafleetsound.load(this, R.raw.akebonojoiningafleet,1);

            minor1minor1 = minor1sound.load(this, R.raw.akebonominor,1);
            minor2minor2 = minor2sound.load(this, R.raw.akebonominor2,1);
            moderatelymoderately = moderatelysound.load(this, R.raw.akebonomoderately,1);
            MVPMVP = MVPsound.load(this, R.raw.akebonomvp,1);
            nightattacknightattack = nightattacksound.load(this, R.raw.akebononightattack,1);
            nightbattlenightbattle = nightbattlesound.load(this, R.raw.akebononightbattle,1);
            returnfromreturnfrom = returnfromsound.load(this, R.raw.akebonoreturnfrom,1);
            secretary1secretary1 = secretary1sound.load(this, R.raw.akebonosecretary1, 1);
            secretary2secretary2 = secretary2sound.load(this, R.raw.akebonosecretary2, 1);
            secretary3secretary3 = secretary3sound.load(this, R.raw.akebonosecretary3, 1);
            secretarymarriedsecretarymarried = secretarymarriedsound.load(this, R.raw.akebonosecretarymarried, 1);
            shipship = shipsound.load(this, R.raw.akebonoship,1);
            showplayershowplayer = showplayersound.load(this, R.raw.akebonoshowplayer,1);
            startasortiestartasortie = startasortiesound.load(this, R.raw.akebonostartasortie,1);
            sunksunk = sunksound.load(this, R.raw.akebonosunk,1);
            supplysupply = supplysound.load(this, R.raw.akebonosupply,1);
            weddingwedding = weddingsound.load(this, R.raw.akebonowedding, 1);
            kancollepicture.setImageResource(R.drawable.akebono);
        }

        if (name.equals("Ayanami")){
            attackattack = attacksound.load(this, R.raw.ayanamiattack,1);
            battlestartbattlestart = battlestartsound.load(this, R.raw.ayanamibattlesstart,1);
            dockingdocking = dockingsound.load(this, R.raw.ayanamidocking,1);
            dockingminordockingminor = dockingminorsound.load(this, R.raw.ayanamidockingminor,1);
            equipment1equipment1 = equipment1sound.load(this, R.raw.ayanamiequipment1,1);
            equipment2equipment2 = equipment2sound.load(this, R.raw.ayanamiequipment2,1);
            equipment3equipment3 = equipment3sound.load(this, R.raw.ayanamiequipment3,1);
            instantrepairinstantrepair = instantrepairsound.load(this, R.raw.ayanamiinstantrepair,1);
            introductionintroduction = introductionsound.load(this, R.raw.ayanamiintroduction,1);
            joiningafleetjoiningafleet = joiningafleetsound.load(this, R.raw.ayanamijoiningafleet,1);

            minor1minor1 = minor1sound.load(this, R.raw.ayanamiminor,1);
            minor2minor2 = minor2sound.load(this, R.raw.ayanamiminor2,1);
            moderatelymoderately = moderatelysound.load(this, R.raw.ayanamimoderately,1);
            MVPMVP = MVPsound.load(this, R.raw.ayanamimvp,1);
            nightattacknightattack = nightattacksound.load(this, R.raw.ayanaminightattack,1);
            nightbattlenightbattle = nightbattlesound.load(this, R.raw.ayanaminightbattle,1);
            returnfromreturnfrom = returnfromsound.load(this, R.raw.ayanamireturnfrom,1);
            secretary1secretary1 = secretary1sound.load(this, R.raw.ayanamisecretary1, 1);
            secretary2secretary2 = secretary2sound.load(this, R.raw.ayanamisecretary2, 1);
            secretary3secretary3 = secretary3sound.load(this, R.raw.ayanamisecretary3, 1);
            secretarymarriedsecretarymarried = secretarymarriedsound.load(this, R.raw.ayanamisecretarymarried, 1); // broken
            shipship = shipsound.load(this, R.raw.ayanamiship,1);
            showplayershowplayer = showplayersound.load(this, R.raw.ayanamishowplayer,1);
            startasortiestartasortie = startasortiesound.load(this, R.raw.ayanamistartasortie,1);
            sunksunk = sunksound.load(this, R.raw.ayanamisunk,1);
            supplysupply = supplysound.load(this, R.raw.ayanamisupply,1);
            weddingwedding = weddingsound.load(this, R.raw.ayanamiwedding, 1);
            kancollepicture.setImageResource(R.drawable.ayanami);
        }

        if (name.equals("Fuso")){
            attackattack = attacksound.load(this, R.raw.fusoattack,1);
            battlestartbattlestart = battlestartsound.load(this, R.raw.fusobattle,1);
            dockingdocking = dockingsound.load(this, R.raw.fusodocking1,1);
            dockingminordockingminor = dockingminorsound.load(this, R.raw.fusodocking,1);
            equipment1equipment1 = equipment1sound.load(this, R.raw.fusoequipment1,1);
            equipment2equipment2 = equipment2sound.load(this, R.raw.fusoequipment2,1);
            equipment3equipment3 = equipment3sound.load(this, R.raw.fusoequipment3,1);
            instantrepairinstantrepair = instantrepairsound.load(this, R.raw.fusoinstant,1);
            introductionintroduction = introductionsound.load(this, R.raw.fusointroduction,1);
            joiningafleetjoiningafleet = joiningafleetsound.load(this, R.raw.fusojoining,1);

            minor1minor1 = minor1sound.load(this, R.raw.fusominor,1);
            minor2minor2 = minor2sound.load(this, R.raw.fusominor1,1);
            moderatelymoderately = moderatelysound.load(this, R.raw.fusomoderately,1);
            MVPMVP = MVPsound.load(this, R.raw.fusomvp,1);
            nightattacknightattack = nightattacksound.load(this, R.raw.fusonight1,1);
            nightbattlenightbattle = nightbattlesound.load(this, R.raw.fusonight,1);
            returnfromreturnfrom = returnfromsound.load(this, R.raw.fusoreturn,1);
            secretary1secretary1 = secretary1sound.load(this, R.raw.fusosecretary1, 1);
            secretary2secretary2 = secretary2sound.load(this, R.raw.fusosecretary2, 1);
            secretary3secretary3 = secretary3sound.load(this, R.raw.fusosecretary3, 1);
            secretarymarriedsecretarymarried = secretarymarriedsound.load(this, R.raw.fusosecretarymarried, 1);
            shipship = shipsound.load(this, R.raw.fusoship,1);
            showplayershowplayer = showplayersound.load(this, R.raw.fusoshow,1);
            startasortiestartasortie = startasortiesound.load(this, R.raw.fusostart,1);
            sunksunk = sunksound.load(this, R.raw.fusosunk,1);
            supplysupply = supplysound.load(this, R.raw.fusosupply,1);
            weddingwedding = weddingsound.load(this, R.raw.fusowedding, 1);
            kancollepicture.setImageResource(R.drawable.fuso);
        }

        if (name.equals("Isonami")){
            attackattack = attacksound.load(this, R.raw.isonamiattack,1);
            battlestartbattlestart = battlestartsound.load(this, R.raw.isonamibattlestart,1);
            dockingdocking = dockingsound.load(this, R.raw.isonamidocking,1);
            dockingminordockingminor = dockingminorsound.load(this, R.raw.isonamidockingminor,1);
            equipment1equipment1 = equipment1sound.load(this, R.raw.isonamiequipment1,1);
            equipment2equipment2 = equipment2sound.load(this, R.raw.isonamiequipment2,1);
            equipment3equipment3 = equipment3sound.load(this, R.raw.isonamiequipment3,1);
            instantrepairinstantrepair = instantrepairsound.load(this, R.raw.isonamiinstantrepair,1);
            introductionintroduction = introductionsound.load(this, R.raw.isonamiintroduction,1);
            joiningafleetjoiningafleet = joiningafleetsound.load(this, R.raw.isonamijoiningafleet,1);

            minor1minor1 = minor1sound.load(this, R.raw.isonamiminor,1);
            minor2minor2 = minor2sound.load(this, R.raw.isonamiminor2,1);
            moderatelymoderately = moderatelysound.load(this, R.raw.isonamimoderately,1);
            MVPMVP = MVPsound.load(this, R.raw.isonamimvp,1);
            nightattacknightattack = nightattacksound.load(this, R.raw.isonaminightattack,1);
            nightbattlenightbattle = nightbattlesound.load(this, R.raw.isonaminightbattle,1);
            returnfromreturnfrom = returnfromsound.load(this, R.raw.isonamireturnfrom,1);
            secretary1secretary1 = secretary1sound.load(this, R.raw.isonamisecretary1, 1);
            secretary2secretary2 = secretary2sound.load(this, R.raw.isonamisecretary2, 1);
            secretary3secretary3 = secretary3sound.load(this, R.raw.isonamisecretary3, 1);
            secretarymarriedsecretarymarried = secretarymarriedsound.load(this, R.raw.isonamisecretarymarried, 1);
            shipship = shipsound.load(this, R.raw.isonamiship,1);
            showplayershowplayer = showplayersound.load(this, R.raw.isonamishowplayer,1);
            startasortiestartasortie = startasortiesound.load(this, R.raw.isonamistartasortie,1);
            sunksunk = sunksound.load(this, R.raw.isonamisunk,1);
            supplysupply = supplysound.load(this, R.raw.isonamisupply,1);
            weddingwedding = weddingsound.load(this, R.raw.isonamiwedding, 1);
            kancollepicture.setImageResource(R.drawable.isonami);
        }

        if (name.equals("Mikazuki")){
            attackattack = attacksound.load(this, R.raw.mikazukiattack,1);
            battlestartbattlestart = battlestartsound.load(this, R.raw.mikazukibattlestart,1);
            dockingdocking = dockingsound.load(this, R.raw.mikazukidocking,1);
            dockingminordockingminor = dockingminorsound.load(this, R.raw.mikazukidockingminor,1);
            equipment1equipment1 = equipment1sound.load(this, R.raw.mikazukiequipment1,1);
            equipment2equipment2 = equipment2sound.load(this, R.raw.mikazukiequipment2,1);
            equipment3equipment3 = equipment3sound.load(this, R.raw.mikazukiequipment3,1);
            instantrepairinstantrepair = instantrepairsound.load(this, R.raw.mikazukiinstantrepair,1);
            introductionintroduction = introductionsound.load(this, R.raw.mikazukiintroduction,1);
            joiningafleetjoiningafleet = joiningafleetsound.load(this, R.raw.mikazukijoiningafleet,1);

            minor1minor1 = minor1sound.load(this, R.raw.mikazukiminor,1);
            minor2minor2 = minor2sound.load(this, R.raw.mikazukiminor2,1);
            moderatelymoderately = moderatelysound.load(this, R.raw.mikazukimoderately,1);
            MVPMVP = MVPsound.load(this, R.raw.mikazukimvp,1);
            nightattacknightattack = nightattacksound.load(this, R.raw.mikazukinightattack,1);
            nightbattlenightbattle = nightbattlesound.load(this, R.raw.mikazukinightbattle,1);
            returnfromreturnfrom = returnfromsound.load(this, R.raw.mikazukireturnfrom,1);
            secretary1secretary1 = secretary1sound.load(this, R.raw.mikazukisecretary1, 1);
            secretary2secretary2 = secretary2sound.load(this, R.raw.mikazukisecretary2, 1);
            secretary3secretary3 = secretary3sound.load(this, R.raw.mikazukisecretary3, 1);
            secretarymarriedsecretarymarried = secretarymarriedsound.load(this, R.raw.mikazukisecretarymarried, 1);
            shipship = shipsound.load(this, R.raw.mikazukiship,1);
            showplayershowplayer = showplayersound.load(this, R.raw.mikazukishowplayer,1);
            startasortiestartasortie = startasortiesound.load(this, R.raw.mikazukistartasortie,1);
            sunksunk = sunksound.load(this, R.raw.mikazukisunk,1);
            supplysupply = supplysound.load(this, R.raw.mikazukisupply,1);
            weddingwedding = weddingsound.load(this, R.raw.mikazukiwedding, 1);
            kancollepicture.setImageResource(R.drawable.mikazuki);
        }

        if (name.equals("Mutsuki")){
            attackattack = attacksound.load(this, R.raw.mutsukiattack,1);
            battlestartbattlestart = battlestartsound.load(this, R.raw.mutsukibattlestart,1);
            dockingdocking = dockingsound.load(this, R.raw.mutsukidocking,1);
            dockingminordockingminor = dockingminorsound.load(this, R.raw.mutsukidockingminor,1);
            equipment1equipment1 = equipment1sound.load(this, R.raw.mutsukiequipment1,1);
            equipment2equipment2 = equipment2sound.load(this, R.raw.mutsukiequipment2,1);
            equipment3equipment3 = equipment3sound.load(this, R.raw.mutsukiequipment3,1);
            instantrepairinstantrepair = instantrepairsound.load(this, R.raw.mutsukiinstantrepair,1);
            introductionintroduction = introductionsound.load(this, R.raw.mutsukiintroduction,1);
            joiningafleetjoiningafleet = joiningafleetsound.load(this, R.raw.mutsukijoiningafleet,1);

            minor1minor1 = minor1sound.load(this, R.raw.mutsukiminor,1);
            minor2minor2 = minor2sound.load(this, R.raw.mutsukiminor2,1);
            moderatelymoderately = moderatelysound.load(this, R.raw.mutsukimoderately,1);
            MVPMVP = MVPsound.load(this, R.raw.mutsukimvp,1);
            nightattacknightattack = nightattacksound.load(this, R.raw.mutsukinightattack,1);
            nightbattlenightbattle = nightbattlesound.load(this, R.raw.mutsukinightbattle,1);
            returnfromreturnfrom = returnfromsound.load(this, R.raw.mutsukireturnfrom,1);
            secretary1secretary1 = secretary1sound.load(this, R.raw.mutsukisecretary1, 1);
            secretary2secretary2 = secretary2sound.load(this, R.raw.mutsukisecretary2, 1);
            secretary3secretary3 = secretary3sound.load(this, R.raw.mutsukisecretary3, 1);
            secretarymarriedsecretarymarried = secretarymarriedsound.load(this, R.raw.mutsukisecretarymarried, 1);
            shipship = shipsound.load(this, R.raw.mutsukiship,1);
            showplayershowplayer = showplayersound.load(this, R.raw.mutsukishowplayer,1);
            startasortiestartasortie = startasortiesound.load(this, R.raw.mutsukistartasortie,1);
            sunksunk = sunksound.load(this, R.raw.mutsukisunk,1);
            supplysupply = supplysound.load(this, R.raw.mutsukisupply,1);
            weddingwedding = weddingsound.load(this, R.raw.mutsukiwedding, 1);
            kancollepicture.setImageResource(R.drawable.mutsuki);
        }

        if (name.equals("Shikinami")){
            attackattack = attacksound.load(this, R.raw.shikinamiattack,1);
            battlestartbattlestart = battlestartsound.load(this, R.raw.shikinamibattlestart,1);
            dockingdocking = dockingsound.load(this, R.raw.shikinamidocking,1);
            dockingminordockingminor = dockingminorsound.load(this, R.raw.shikinamidockingminor,1);
            equipment1equipment1 = equipment1sound.load(this, R.raw.shikinamiequipment1,1);
            equipment2equipment2 = equipment2sound.load(this, R.raw.shikinamiequipment2,1);
            equipment3equipment3 = equipment3sound.load(this, R.raw.shikinamiequipment3,1);
            instantrepairinstantrepair = instantrepairsound.load(this, R.raw.shikinamiinstantrepair,1);
            introductionintroduction = introductionsound.load(this, R.raw.shikinamiintroduction,1);
            joiningafleetjoiningafleet = joiningafleetsound.load(this, R.raw.shikinamijoiningafleet,1);

            minor1minor1 = minor1sound.load(this, R.raw.shikinamiminor,1);
            minor2minor2 = minor2sound.load(this, R.raw.shikinamiminor2,1);
            moderatelymoderately = moderatelysound.load(this, R.raw.shikinamimoderately,1);
            MVPMVP = MVPsound.load(this, R.raw.shikinamimvp,1);
            nightattacknightattack = nightattacksound.load(this, R.raw.shikinaminightattack,1);
            nightbattlenightbattle = nightbattlesound.load(this, R.raw.shikinaminightbattle,1);
            returnfromreturnfrom = returnfromsound.load(this, R.raw.shikinamireturnfrom,1);
            secretary1secretary1 = secretary1sound.load(this, R.raw.shikinamisecretary1, 1);
            secretary2secretary2 = secretary2sound.load(this, R.raw.shikinamisecretary2, 1);
            secretary3secretary3 = secretary3sound.load(this, R.raw.shikinamisecretary3, 1);
            secretarymarriedsecretarymarried = secretarymarriedsound.load(this, R.raw.shikinamisecretarymarried, 1);
            shipship = shipsound.load(this, R.raw.shikinamiship,1);
            showplayershowplayer = showplayersound.load(this, R.raw.shikinamishowplayer,1);
            startasortiestartasortie = startasortiesound.load(this, R.raw.shikinamistartasortie,1);
            sunksunk = sunksound.load(this, R.raw.shikinamisunk,1);
            supplysupply = supplysound.load(this, R.raw.shikinamisupply,1);
            weddingwedding = weddingsound.load(this, R.raw.shikinamiwedding, 1);
            kancollepicture.setImageResource(R.drawable.shikinami);
        }

        if (name.equals("Ushio")){
            attackattack = attacksound.load(this, R.raw.ushioattack,1);
            battlestartbattlestart = battlestartsound.load(this, R.raw.ushiobattle,1);
            dockingdocking = dockingsound.load(this, R.raw.ushiodocking1,1);
            dockingminordockingminor = dockingminorsound.load(this, R.raw.ushiodocking,1);
            equipment1equipment1 = equipment1sound.load(this, R.raw.ushioequipment1,1);
            equipment2equipment2 = equipment2sound.load(this, R.raw.ushioequipment2,1);
            equipment3equipment3 = equipment3sound.load(this, R.raw.ushioequipment3,1);
            instantrepairinstantrepair = instantrepairsound.load(this, R.raw.ushioinstant,1);
            introductionintroduction = introductionsound.load(this, R.raw.ushiointroduction,1);
            joiningafleetjoiningafleet = joiningafleetsound.load(this, R.raw.ushiojoining,1);

            minor1minor1 = minor1sound.load(this, R.raw.ushiominor,1);
            minor2minor2 = minor2sound.load(this, R.raw.ushiominor1,1);
            moderatelymoderately = moderatelysound.load(this, R.raw.ushiomoderately,1);
            MVPMVP = MVPsound.load(this, R.raw.ushiomvp,1);
            nightattacknightattack = nightattacksound.load(this, R.raw.ushionight1,1);
            nightbattlenightbattle = nightbattlesound.load(this, R.raw.ushionight,1);
            returnfromreturnfrom = returnfromsound.load(this, R.raw.ushioreturn,1);
            secretary1secretary1 = secretary1sound.load(this, R.raw.ushiosecretary1, 1);
            secretary2secretary2 = secretary2sound.load(this, R.raw.ushiosecretary2, 1);
            secretary3secretary3 = secretary3sound.load(this, R.raw.ushiosecretary3, 1);
            secretarymarriedsecretarymarried = secretarymarriedsound.load(this, R.raw.ushiosecretarymarried, 1);
            shipship = shipsound.load(this, R.raw.ushioship,1);
            showplayershowplayer = showplayersound.load(this, R.raw.ushioshow,1);
            startasortiestartasortie = startasortiesound.load(this, R.raw.ushiostart,1);
            sunksunk = sunksound.load(this, R.raw.ushiosunk,1);
            supplysupply = supplysound.load(this, R.raw.ushiosupply,1);
            weddingwedding = weddingsound.load(this, R.raw.ushiowedding, 1);
            kancollepicture.setImageResource(R.drawable.ushio);
        }

        if (name.equals("Kagerou")){
            attackattack = attacksound.load(this, R.raw.kagerouattack,1);
            battlestartbattlestart = battlestartsound.load(this, R.raw.kageroubattle,1);
            dockingdocking = dockingsound.load(this, R.raw.kageroudocking1,1);
            dockingminordockingminor = dockingminorsound.load(this, R.raw.kageroudocking,1);
            equipment1equipment1 = equipment1sound.load(this, R.raw.kagerouequipment1,1);
            equipment2equipment2 = equipment2sound.load(this, R.raw.kagerouequipment2,1);
            equipment3equipment3 = equipment3sound.load(this, R.raw.kagerouequipment3,1);
            instantrepairinstantrepair = instantrepairsound.load(this, R.raw.kagerouinstant,1);
            introductionintroduction = introductionsound.load(this, R.raw.kagerouintroduction,1);
            joiningafleetjoiningafleet = joiningafleetsound.load(this, R.raw.kageroujoining,1);

            minor1minor1 = minor1sound.load(this, R.raw.kagerouminor,1);
            minor2minor2 = minor2sound.load(this, R.raw.kagerouminor1,1);
            moderatelymoderately = moderatelysound.load(this, R.raw.kageroumoderately,1);
            MVPMVP = MVPsound.load(this, R.raw.kageroumvp,1);
            nightattacknightattack = nightattacksound.load(this, R.raw.kagerounight1,1);
            nightbattlenightbattle = nightbattlesound.load(this, R.raw.kagerounight,1);
            returnfromreturnfrom = returnfromsound.load(this, R.raw.kageroureturn,1);
            secretary1secretary1 = secretary1sound.load(this, R.raw.kagerousecretary1, 1);
            secretary2secretary2 = secretary2sound.load(this, R.raw.kagerousecretary2, 1);
            secretary3secretary3 = secretary3sound.load(this, R.raw.kagerousecretary3, 1);
            secretarymarriedsecretarymarried = secretarymarriedsound.load(this, R.raw.kagerousecretarymarried, 1);
            shipship = shipsound.load(this, R.raw.kagerouship,1);
            showplayershowplayer = showplayersound.load(this, R.raw.kageroushow,1);
            startasortiestartasortie = startasortiesound.load(this, R.raw.kageroustart,1);
            sunksunk = sunksound.load(this, R.raw.kagerousunk,1);
            supplysupply = supplysound.load(this, R.raw.kagerousupply,1);
            weddingwedding = weddingsound.load(this, R.raw.kagerouwedding, 1);
            kancollepicture.setImageResource(R.drawable.kagerou);
        }


        kancollepicture.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (name.equals("Fubuki")) {
                        kancollepicture.setImageResource(R.drawable.fubuki);
                    }
                    if (name.equals("Kisaragi")) {
                        kancollepicture.setImageResource(R.drawable.kisaragi);
                    }
                    if (name.equals("Akebono")) {
                        kancollepicture.setImageResource(R.drawable.akebono);
                    }
                    if (name.equals("Ayanami")) {
                        kancollepicture.setImageResource(R.drawable.ayanami);
                    }
                    if (name.equals("Fuso")) {
                        kancollepicture.setImageResource(R.drawable.fuso);
                    }
                    if (name.equals("Isonami")) {
                        kancollepicture.setImageResource(R.drawable.isonami);
                    }
                    if (name.equals("Mikazuki")) {
                        kancollepicture.setImageResource(R.drawable.mikazuki);
                    }
                    if (name.equals("Mutsuki")) {
                        kancollepicture.setImageResource(R.drawable.mutsuki);
                    }
                    if (name.equals("Shikinami")) {
                        kancollepicture.setImageResource(R.drawable.shikinami);
                    }
                    if (name.equals("Ushio")) {
                        kancollepicture.setImageResource(R.drawable.ushio);
                    }
                    if (name.equals("Kagerou")) {
                        kancollepicture.setImageResource(R.drawable.kagerou);
                    }
                }
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    if (name.equals("Fubuki")) {
                        kancollepicture.setImageResource(R.drawable.fubukidamaged);
                    }
                    if (name.equals("Kisaragi")) {
                        kancollepicture.setImageResource(R.drawable.kisaragidamaged);
                    }
                    if (name.equals("Akebono")) {
                        kancollepicture.setImageResource(R.drawable.akebonodamaged);
                    }
                    if (name.equals("Ayanami")) {
                        kancollepicture.setImageResource(R.drawable.ayanamidamaged);
                    }
                    if (name.equals("Fuso")) {
                        kancollepicture.setImageResource(R.drawable.fusodamaged);
                    }
                    if (name.equals("Isonami")) {
                        kancollepicture.setImageResource(R.drawable.isonamidamaged);
                    }
                    if (name.equals("Mikazuki")) {
                        kancollepicture.setImageResource(R.drawable.mikazukidamaged);
                    }
                    if (name.equals("Mutsuki")) {
                        kancollepicture.setImageResource(R.drawable.mutsukidamaged);
                    }
                    if (name.equals("Shikinami")) {
                        kancollepicture.setImageResource(R.drawable.shikinamidamaged);
                    }
                    if (name.equals("Ushio")) {
                        kancollepicture.setImageResource(R.drawable.ushiodamaged);
                    }
                    if (name.equals("Kagerou")) {
                        kancollepicture.setImageResource(R.drawable.kageroudamaged);
                    }
                    var.vibrate(150);
                }
                return true;
            }
        });

        libraryintro.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (name.equals("Fubuki")) {
                    libraryintrosound = MediaPlayer.create(quotes.this, R.raw.fubukilibraryintro);
                }
                if (name.equals("Kisaragi")) {
                    libraryintrosound = MediaPlayer.create(quotes.this, R.raw.kisaragilibraryintro);
                }
                if (name.equals("Akebono")) {
                    libraryintrosound = MediaPlayer.create(quotes.this, R.raw.akebonolibraryintro);
                }
                if (name.equals("Ayanami")) {
                    libraryintrosound = MediaPlayer.create(quotes.this, R.raw.ayanamilibraryintro);
                }
                if (name.equals("Fuso")) {
                    libraryintrosound = MediaPlayer.create(quotes.this, R.raw.fusolibrary);
                }
                if (name.equals("Isonami")) {
                    libraryintrosound = MediaPlayer.create(quotes.this, R.raw.isonamilibraryintro);
                }
                if (name.equals("Mikazuki")) {
                    libraryintrosound = MediaPlayer.create(quotes.this, R.raw.mikazukilibraryintro);
                }
                if (name.equals("Mutsuki")) {
                    libraryintrosound = MediaPlayer.create(quotes.this, R.raw.mutsukilibraryintro);
                }
                if (name.equals("Shikinami")) {
                    libraryintrosound = MediaPlayer.create(quotes.this, R.raw.shikinamilibraryintro);
                }
                if (name.equals("Ushio")) {
                    libraryintrosound = MediaPlayer.create(quotes.this, R.raw.ushiolibrary);
                }
                if (name.equals("Kagerou")) {
                    libraryintrosound = MediaPlayer.create(quotes.this, R.raw.kageroulibrary);
                }
                libraryintrosound.start();
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("libraryintronumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("libraryintronumber", clickcount+1);
                editor.commit();
            }
        });


        introduction.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                introductionsound.play(introductionintroduction, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("introductionnumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("introductionnumber", clickcount+1);
                editor.commit();
            }
        });


        secretary1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                secretary1sound.play(secretary1secretary1, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("secretary1number", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("secretary1number", clickcount + 1);
                editor.commit();
            }
        });

        secretary2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                secretary2sound.play(secretary2secretary2, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("secretary2number", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("secretary2number", clickcount+1);
                editor.commit();
            }
        });

        secretary3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                secretary3sound.play(secretary3secretary3, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("secretary3number", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("secretary3number", clickcount+1);
                editor.commit();
            }
        });

        secretarymarried.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                secretarymarriedsound.play(secretarymarriedsecretarymarried, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("secretarymarriednumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("secretarymarriednumber", clickcount+1);
                editor.commit();
            }
        });

        wedding.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                weddingsound.play(weddingwedding, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("weddingnumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("weddingnumber", clickcount+1);
                editor.commit();
            }
        });

        showplayer.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                showplayersound.play(showplayershowplayer, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("showplayernumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("showplayernumber", clickcount+1);
                editor.commit();
            }
        });

        joiningafleet.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                joiningafleetsound.play(joiningafleetjoiningafleet, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("joiningafleetnumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("joiningafleetnumber", clickcount+1);
                editor.commit();
            }
        });

        equipment1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                equipment1sound.play(equipment1equipment1, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("equipment1number", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("equipment1number", clickcount+1);
                editor.commit();
            }
        });

        equipment2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                equipment2sound.play(equipment2equipment2, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("equipment2number", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("equipment2number", clickcount+1);
                editor.commit();
            }
        });

        equipment3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                equipment3sound.play(equipment3equipment3, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("equipment3number", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("equipment3number", clickcount+1);
                editor.commit();
            }
        });

        supply.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                supplysound.play(supplysupply, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("supplynumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("supplynumber", clickcount+1);
                editor.commit();
            }
        });

        dockingminor.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                dockingminorsound.play(dockingminordockingminor, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("dockingminornumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("dockingminornumber", clickcount+1);
                editor.commit();
            }
        });

        docking.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                dockingsound.play(dockingdocking, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("dockingnumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("dockingnumber", clickcount+1);
                editor.commit();
            }
        });

        ship.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                shipsound.play(shipship, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("shipnumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("shipnumber", clickcount+1);
                editor.commit();
            }
        });

        returnfrom.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnfromsound.play(returnfromreturnfrom, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("returnfromnumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("returnfromnumber", clickcount+1);
                editor.commit();
            }
        });

        startasortie.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startasortiesound.play(startasortiestartasortie, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("startasortienumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("startasortienumber", clickcount+1);
                editor.commit();
            }
        });

        battlestart.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                battlestartsound.play(battlestartbattlestart, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("battlestartnumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("battlestartnumber", clickcount+1);
                editor.commit();
            }
        });

        attack.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                attacksound.play(attackattack, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("attacknumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("attacknumber", clickcount+1);
                editor.commit();
            }
        });

        nightbattle.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                nightbattlesound.play(nightbattlenightbattle, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("nightbattlenumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("nightbattlenumber", clickcount+1);
                editor.commit();
            }
        });

        nightattack.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                nightattacksound.play(nightattacknightattack, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("nightattacknumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("nightattacknumber", clickcount + 1);
                editor.commit();
            }
        });

        MVP.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                MVPsound.play(MVPMVP, 1, 1, 1, 0, 1);
            }
        });
        SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
        clickcount = sharedPrefs.getInt("MVPnumber", 0);
        SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
        editor.putInt("MVPnumber", clickcount + 1);
        editor.commit();

        minor1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                minor1sound.play(minor1minor1, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("minor1number", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("minor1number", clickcount + 1);
                editor.commit();
            }
        });

        minor2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                minor2sound.play(minor2minor2, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("minor2number", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("minor2number", clickcount+1);
                editor.commit();
            }
        });

        moderately.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                moderatelysound.play(moderatelymoderately, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("moderatelynumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("moderatelynumber", clickcount+1);
                editor.commit();
            }
        });

        sunk.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                sunksound.play(sunksunk, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("sunknumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("sunknumber", clickcount+1);
                editor.commit();
            }
        });



        idle.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                introductionsound.autoPause();
                sunksound.autoPause();
                secretary1sound.autoPause();
                secretary2sound.autoPause();
                secretary3sound.autoPause();
                secretarymarriedsound.autoPause();
                weddingsound.autoPause();
                showplayersound.autoPause();
                joiningafleetsound.autoPause();
                equipment1sound.autoPause();
                equipment2sound.autoPause();
                equipment3sound.autoPause();
                supplysound.autoPause();
                dockingminorsound.autoPause();
                dockingsound.autoPause();
                shipsound.autoPause();
                returnfromsound.autoPause();
                startasortiesound.autoPause();
                battlestartsound.autoPause();
                attacksound.autoPause();
                nightbattlesound.autoPause();
                nightattacksound.autoPause();
                MVPsound.autoPause();
                minor1sound.autoPause();
                minor2sound.autoPause();
                moderatelysound.autoPause();
                instantrepairsound.autoPause();
                libraryintrosound.stop();

                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("idlenumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("idlenumber", clickcount + 1);
                editor.commit();

            }
        });

        instantrepair.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                instantrepairsound.play(instantrepairinstantrepair, 1, 1, 1, 0, 1);
                SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
                clickcount = sharedPrefs.getInt("instantrepairnumber", 0);
                SharedPreferences.Editor editor = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE).edit();
                editor.putInt("instantrepairnumber", clickcount+1);
                editor.commit();
            }
        });

        rereturn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



    }

    @Override
    protected void onPause() {
        super.onPause();
        introductionsound.autoPause();
        sunksound.autoPause();
        secretary1sound.autoPause();
        secretary2sound.autoPause();
        secretary3sound.autoPause();
        secretarymarriedsound.autoPause();
        weddingsound.autoPause();
        showplayersound.autoPause();
        joiningafleetsound.autoPause();
        equipment1sound.autoPause();
        equipment2sound.autoPause();
        equipment3sound.autoPause();
        supplysound.autoPause();
        dockingminorsound.autoPause();
        dockingsound.autoPause();
        shipsound.autoPause();
        returnfromsound.autoPause();
        startasortiesound.autoPause();
        battlestartsound.autoPause();
        attacksound.autoPause();
        nightbattlesound.autoPause();
        nightattacksound.autoPause();
        MVPsound.autoPause();
        minor1sound.autoPause();
        minor2sound.autoPause();
        moderatelysound.autoPause();
        instantrepairsound.autoPause();
        libraryintrosound.stop();
        libraryintrosound.release();

    }
}

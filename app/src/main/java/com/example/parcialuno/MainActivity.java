package com.example.parcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView4, txt, txt_titulo_principal, txt_nombre_de_la_cancion_principal, txt_cancion_harry,
            txt_album_harry, txt_cancion_loba, txt_album_loba, txt_cancion_lostonyou, txt_album_lostonyou,
            txt_cancion_oneofthegirls, txt_album_oneofthegirls, txt_cancion_paramore, txt_album_paramore;
    ImageButton img_btn_play_principal, img_btn_harry, img_btn_loba, img_btn_paramore, img_btn_oneofthegirls, img_btn_lostonyou;

    ImageView imageView;

    MediaPlayer reproductor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt = findViewById(R.id.textView2);
        txt_titulo_principal = findViewById(R.id.txt_titulo_principal);
        txt_nombre_de_la_cancion_principal = findViewById(R.id.txt_nombre_de_la_cancion_principal);


        txt_cancion_harry = findViewById(R.id.txt_cancion_harry);
        txt_cancion_loba = findViewById(R.id.txt_cancion_loba);
        txt_cancion_lostonyou = findViewById(R.id.txt_cancion_lostonyou);
        txt_cancion_oneofthegirls = findViewById(R.id.txt_cancion_oneofthegirls);
        txt_cancion_paramore = findViewById(R.id.txt_cancion_paramore);

        txt_album_harry = findViewById(R.id.txt_album_harry);
        txt_album_loba = findViewById(R.id.txt_album_loba);
        txt_album_lostonyou = findViewById(R.id.txt_album_lostonyou);
        txt_album_oneofthegirls = findViewById(R.id.txt_album_oneofthegirls);
        txt_album_paramore = findViewById(R.id.txt_album_paramore);

        textView4 = findViewById(R.id.textView4);
        img_btn_play_principal = findViewById(R.id.img_btn_play_principal);

        img_btn_harry = findViewById(R.id.img_btn_harry);
        img_btn_loba = findViewById(R.id.img_btn_loba);
        img_btn_lostonyou = findViewById(R.id.img_btn_lostonyou);
        img_btn_oneofthegirls = findViewById(R.id.img_btn_oneofthegirls);
        img_btn_paramore = findViewById(R.id.img_btn_paramore);

        imageView = findViewById(R.id.imageView);



        img_btn_harry.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view){
        if (reproductor != null) {
            reproductor.release();
            reproductor = null;
        }
        img_btn_play_principal.setImageResource(R.drawable.play);
        imageView.setImageResource(R.drawable.asitwas);
        txt_nombre_de_la_cancion_principal.setText("As It Was");
        txt_titulo_principal.setText("Harry Styles");
        txt.setText("As It Was");
        img_btn_play_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (reproductor == null) {
                    reproductor = MediaPlayer.create(MainActivity.this, R.raw.asitwas);
                }
                if (reproductor.isPlaying()) {
                    reproductor.pause();
                    textView4.setText("En pausa");
                    img_btn_play_principal.setImageResource(R.drawable.play);
                } else {
                    textView4.setText("Reproduciendo");

                    reproductor.start();
                    img_btn_play_principal.setImageResource(R.drawable.pausa);
                }
            }
        });
        if (reproductor == null) {
            reproductor = MediaPlayer.create(MainActivity.this, R.raw.asitwas);
        }
        if (reproductor.isPlaying()) {
            reproductor.start();
        }
    }
    });




        img_btn_loba.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view){
        if (reproductor != null) {
            reproductor.release();
            reproductor = null;
        }
        img_btn_play_principal.setImageResource(R.drawable.play);
        imageView.setImageResource(R.drawable.loba);
        txt_nombre_de_la_cancion_principal.setText("Loba");
        txt_titulo_principal.setText("Shakira");
        txt.setText("Loba");
        img_btn_play_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (reproductor == null) {
                    reproductor = MediaPlayer.create(MainActivity.this, R.raw.lobaaa);
                }
                if (reproductor.isPlaying()) {
                    reproductor.pause();
                    textView4.setText("En pausa");
                    img_btn_play_principal.setImageResource(R.drawable.play);
                } else {
                    textView4.setText("Reproduciendo");
                    reproductor.start();
                    img_btn_play_principal.setImageResource(R.drawable.pausa);
                }
            }
        });
        if (reproductor == null) {
            reproductor = MediaPlayer.create(MainActivity.this, R.raw.lobaaa);
        }
        if (reproductor.isPlaying()) {
            reproductor.start();
        }
    }
    });

        img_btn_lostonyou.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view){
        if (reproductor != null) {
            reproductor.release();
            reproductor = null;
        }

        img_btn_play_principal.setImageResource(R.drawable.play);
        imageView.setImageResource(R.drawable.lostonyou);
        txt_nombre_de_la_cancion_principal.setText("Lost On You");
        txt_titulo_principal.setText("LP");
        txt.setText("Lost On You");
        img_btn_play_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (reproductor == null) {
                    reproductor = MediaPlayer.create(MainActivity.this, R.raw.lostonyou);
                }
                if (reproductor.isPlaying()) {
                    reproductor.pause();
                    textView4.setText("En pausa");
                    img_btn_play_principal.setImageResource(R.drawable.play);
                } else {
                    textView4.setText("Reproduciendo");
                    reproductor.start();
                    img_btn_play_principal.setImageResource(R.drawable.pausa);
                }
            }
        });
        if (reproductor == null) {
            reproductor = MediaPlayer.create(MainActivity.this, R.raw.lostonyou);
        }
        if (reproductor.isPlaying()) {
            reproductor.start();
        }
    }
    });


        img_btn_oneofthegirls.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        if (reproductor != null) {
            reproductor.release();
            reproductor = null;
        }

        img_btn_play_principal.setImageResource(R.drawable.play);
        imageView.setImageResource(R.drawable.oneofthegirls);
        txt_nombre_de_la_cancion_principal.setText("One Of The Girls");
        txt_titulo_principal.setText("The Weeknd");
        txt.setText("One Of The Girls");
        img_btn_play_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (reproductor == null) {
                    reproductor = MediaPlayer.create(MainActivity.this, R.raw.oneofthegirl);
                }
                if (reproductor.isPlaying()) {
                    reproductor.pause();
                    textView4.setText("En pausa");
                    img_btn_play_principal.setImageResource(R.drawable.play);
                } else {
                    textView4.setText("Reproduciendo");
                    reproductor.start();
                    img_btn_play_principal.setImageResource(R.drawable.pausa);
                }
            }
        });
        if (reproductor == null) {
            reproductor = MediaPlayer.create(MainActivity.this, R.raw.oneofthegirl);
        }
        if (reproductor.isPlaying()) {
            reproductor.start();
        }
    }
    });


        img_btn_paramore.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        if (reproductor != null) {
            reproductor.release();
            reproductor = null;
        }

        img_btn_play_principal.setImageResource(R.drawable.play);
        imageView.setImageResource(R.drawable.paramoredecode);
        txt_nombre_de_la_cancion_principal.setText("Decode");
        txt_titulo_principal.setText("Paramore");
        txt.setText("Decode");
        img_btn_play_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (reproductor == null) {
                    reproductor = MediaPlayer.create(MainActivity.this, R.raw.decode);
                }
                if (reproductor.isPlaying()) {
                    reproductor.pause();
                    textView4.setText("En pausa");
                    img_btn_play_principal.setImageResource(R.drawable.play);
                } else {
                    textView4.setText("Reproduciendo");
                    reproductor.start();
                    img_btn_play_principal.setImageResource(R.drawable.pausa);
                }
            }
        });
        if (reproductor == null) {
            reproductor = MediaPlayer.create(MainActivity.this, R.raw.decode);
        }
        if (reproductor.isPlaying()) {
            reproductor.start();
        }
    }
    });


}

    }

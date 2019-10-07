package com.example.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class goat_games extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goat_games);
        Button game1 = findViewById(R.id.game1);
        Button game2 = findViewById(R.id.game2);
        Button game3 = findViewById(R.id.game3);
        Button game4 = findViewById(R.id.game4);
        game1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(goat_games.this, instructions_word_search_goat.class);
                startActivity(intent);

//              You can reduce these two lies of code into just one line
                
                
            }
        });
        game2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(goat_games.this, instructions_puzzle_goat.class);
                startActivity(intent);

            }
        });
        game3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(goat_games.this, maze_goat.class);
                startActivity(intent);
            }
        });
        game4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(goat_games.this, dragDrop_goat.class);
                startActivity(intent);
            }
        });


    }
}

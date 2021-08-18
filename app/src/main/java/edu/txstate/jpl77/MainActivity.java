package edu.txstate.jpl77;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ////
        Button viewRecipe = findViewById(R.id.buttonRecipe);
        viewRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //switch activity
                
            }
        });


        /////Demo OO concepts
        Button button = (Button) findViewById(R.id.buttonRecipe);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, RecipeActivity.class));
            }
        });

        Person p = new Person();
        p.setName("Jordan");
        //Toast.makeText(this, p.Welcome(),Toast.LENGTH_LONG).show();


        instructor i = new instructor();
        i.setName("Jordan");
        i.setTitle("Mr.");
        //Toast.makeText(this, i.Welcome(), Toast.LENGTH_LONG).show();

        //sayWelcome(i);
        ///sayWelcome(p);
        Dog g = new Dog();
        //sayWelcome(g);
        sayWelcome(new sound() {
            @Override
            public String Welcome() {
                return "howdy";
            }
        });
    }

    private void sayWelcome(Person aPerson){

    Toast.makeText(this, aPerson.Welcome(), Toast.LENGTH_LONG).show();

    }
    private void sayWelcome(sound s){Toast.makeText(this, s.Welcome(), Toast.LENGTH_LONG).show();

    }
}

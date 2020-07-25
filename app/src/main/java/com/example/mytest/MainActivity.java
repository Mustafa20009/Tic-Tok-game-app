package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int playerState =0;
    int []array={2,2,2,2,2,2,2,2,2};
    int [][]array2 ={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};


    boolean gameAction =true;
    public void check(View view){
        TextView text =(TextView) findViewById(R.id.textView4);
        ImageView check = (ImageView) view;
        Button playAgain = (Button) findViewById(R.id.playAgain);


        int tagCounter=Integer.parseInt(check.getTag().toString());
        if (array[tagCounter]==2 && gameAction){
            if (playerState==0){
                check.setImageResource(R.drawable.tick);
                array[tagCounter]=playerState;
                playerState=1;
            }
            else {
                array[tagCounter]=playerState;
                check.setImageResource(R.drawable.cross);
                playerState=0;
            }
            for (int[] array2:array2)
            {
                if (array[array2[0]]==array[array2[1]] && array[array2[1]]==array[array2[2]] && array[array2[0]]!=2)
                {
                    String winner;
                    if (playerState==1)
                    {winner="tick";}
                    else {winner="cross";}
                    Toast.makeText(this,winner+"winner",Toast.LENGTH_LONG).show();
                    gameAction=false;
                    text.setText(" "+winner +" has won");
                    text.setVisibility(View.VISIBLE);

                }

            }

        }

    }
    public void playAgain(View view){
        TextView text =(TextView) findViewById(R.id.textView4);
        text.setVisibility(View.INVISIBLE);
        gameAction=true;
        playerState=0;
        for(int i=0;i<9;i++) {
            array[i] = 2;
        }
            ImageView check = (ImageView) findViewById(R.id.imageView3);
            ImageView check1 = (ImageView) findViewById(R.id.imageView4);
            ImageView check2 = (ImageView) findViewById(R.id.imageView5);
            ImageView check3 = (ImageView) findViewById(R.id.imageView6);
            ImageView check4 = (ImageView) findViewById(R.id.imageView7);
            ImageView check5 = (ImageView) findViewById(R.id.imageView8);
            ImageView check6 = (ImageView) findViewById(R.id.imageView9);
            ImageView check7= (ImageView) findViewById(R.id.imageView10);
            ImageView check8 = (ImageView) findViewById(R.id.imageView11);
            check.setImageDrawable(null);check1.setImageDrawable(null);
            check2.setImageDrawable(null);check3.setImageDrawable(null);
            check4.setImageDrawable(null);check5.setImageDrawable(null);
            check6.setImageDrawable(null);check7.setImageDrawable(null);
            check8.setImageDrawable(null);



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
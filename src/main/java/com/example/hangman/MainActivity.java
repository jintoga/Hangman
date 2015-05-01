package com.example.hangman;

import java.util.ArrayList;
import java.util.Random;

import model.Game;
import model.Word;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
    ArrayList<Word> listword = null;
    Word randomWord;

    Game game = null;
    String trueWord;
    String guessLetter;

    StringBuilder sb;
    Boolean newgame = false;
    Button btnAlpha, btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI,
            btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT,
            btnU, btnV, btnW, btnX, btnY, btnZ;

    ImageView imgView, ivdie;
    TextView WordLength, Turn;
    int turnToGuess;
    FrameLayout.LayoutParams params;
    TextView tvword;
    TranslateAnimation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getID();
        setEvents();

        generateListWord();
        CreateNewGame();
    }

    public ArrayList<Word> getListword() {
        return listword;
    }


    public void CreateNewGame() {
        // TODO Auto-generated method stub
        Random random = new Random();
        randomWord = (Word) listword.get(random.nextInt(listword.size()));
        WordLength.setText(" " + randomWord.getWord().length() + "(letters)");
        turnToGuess = randomWord.getTimeToGuess();
        Turn.setText(" " + turnToGuess + "(Times)");

        trueWord = randomWord.getWord();
        game = new Game(trueWord.toLowerCase());
        game.createHidden();
        tvword.setText(game.getAnswer());

    }

    private void playGame(String guessLetter) {
        // TODO Auto-generated method stub
        char guessChar = guessLetter.charAt(0);

        if (game.check(guessChar, game.getAnswer())) {
            tvword.setText(game.getAnswer().toUpperCase());
            imgView.setImageResource(R.drawable.man);
            jumpOnSide();
        } else {
            turnToGuess--;
            imgView.setImageResource(R.drawable.sad);
            if (turnToGuess < 0) {
                SetDisableButtons();
                anim.cancel();
                imgView.clearAnimation();

                imgView.setVisibility(View.INVISIBLE);

                ivdie.setVisibility(View.VISIBLE);
                Animation rotation = AnimationUtils.loadAnimation(this,
                        R.anim.rotatedie);
                rotation.setRepeatCount(Animation.INFINITE);
                ivdie.startAnimation(rotation);

            }
            Move();

            updateTurns();
        }

    }

    private void jumpOnSide() {
        // TODO Auto-generated method stub
        Animation rotation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        rotation.setRepeatCount(Animation.INFINITE);
        imgView.startAnimation(rotation);
    }

    private void updateTurns() {
        // TODO Auto-generated method stub
        Turn.setText(turnToGuess + "(Times)");
    }

    private void setOnclickForButtons() {
        btnA.setOnClickListener(MainActivity.this);
        btnB.setOnClickListener(MainActivity.this);
        btnC.setOnClickListener(MainActivity.this);
        btnD.setOnClickListener(MainActivity.this);
        btnE.setOnClickListener(MainActivity.this);
        btnF.setOnClickListener(MainActivity.this);
        btnG.setOnClickListener(MainActivity.this);
        btnH.setOnClickListener(MainActivity.this);
        btnI.setOnClickListener(MainActivity.this);
        btnJ.setOnClickListener(MainActivity.this);
        btnK.setOnClickListener(MainActivity.this);
        btnL.setOnClickListener(MainActivity.this);
        btnM.setOnClickListener(MainActivity.this);
        btnN.setOnClickListener(MainActivity.this);
        btnO.setOnClickListener(MainActivity.this);
        btnP.setOnClickListener(MainActivity.this);
        btnQ.setOnClickListener(MainActivity.this);
        btnR.setOnClickListener(MainActivity.this);
        btnS.setOnClickListener(MainActivity.this);
        btnT.setOnClickListener(MainActivity.this);
        btnU.setOnClickListener(MainActivity.this);
        btnV.setOnClickListener(MainActivity.this);
        btnW.setOnClickListener(MainActivity.this);
        btnX.setOnClickListener(MainActivity.this);
        btnY.setOnClickListener(MainActivity.this);
        btnZ.setOnClickListener(MainActivity.this);
        // CreateNewGame();
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.btnA:
                btnA.setEnabled(false);
                playGame(btnA.getText().toString().toLowerCase());
                break;
            case R.id.btnB:
                btnB.setEnabled(false);
                playGame(btnB.getText().toString().toLowerCase());
                break;
            case R.id.btnC:
                btnC.setEnabled(false);
                playGame(btnC.getText().toString().toLowerCase());
                break;
            case R.id.btnD:
                btnD.setEnabled(false);
                playGame(btnD.getText().toString().toLowerCase());
                break;
            case R.id.btnE:
                btnE.setEnabled(false);
                playGame(btnE.getText().toString().toLowerCase());
                break;
            case R.id.btnF:
                btnF.setEnabled(false);
                playGame(btnF.getText().toString().toLowerCase());
                break;
            case R.id.btnG:
                btnG.setEnabled(false);
                playGame(btnG.getText().toString().toLowerCase());
                break;
            case R.id.btnH:
                btnH.setEnabled(false);
                playGame(btnH.getText().toString().toLowerCase());
                break;
            case R.id.btnI:
                btnI.setEnabled(false);
                playGame(btnI.getText().toString().toLowerCase());
                break;
            case R.id.btnJ:
                btnJ.setEnabled(false);
                playGame(btnJ.getText().toString().toLowerCase());
                break;
            case R.id.btnK:
                btnK.setEnabled(false);
                playGame(btnK.getText().toString().toLowerCase());
                break;
            case R.id.btnL:
                btnL.setEnabled(false);
                playGame(btnL.getText().toString().toLowerCase());
                break;
            case R.id.btnM:
                btnM.setEnabled(false);
                playGame(btnM.getText().toString().toLowerCase());
                break;
            case R.id.btnN:
                btnN.setEnabled(false);
                playGame(btnN.getText().toString().toLowerCase());
                break;
            case R.id.btnO:
                btnO.setEnabled(false);
                playGame(btnO.getText().toString().toLowerCase());
                break;
            case R.id.btnP:
                btnP.setEnabled(false);
                playGame(btnP.getText().toString().toLowerCase());
                break;
            case R.id.btnQ:
                btnQ.setEnabled(false);
                playGame(btnQ.getText().toString().toLowerCase());
                break;
            case R.id.btnR:
                btnR.setEnabled(false);
                playGame(btnR.getText().toString().toLowerCase());
                break;
            case R.id.btnS:
                btnS.setEnabled(false);
                playGame(btnS.getText().toString().toLowerCase());
                break;
            case R.id.btnT:
                btnT.setEnabled(false);
                playGame(btnT.getText().toString().toLowerCase());
                break;
            case R.id.btnU:
                btnU.setEnabled(false);
                playGame(btnU.getText().toString().toLowerCase());
                break;
            case R.id.btnV:
                btnV.setEnabled(false);
                playGame(btnV.getText().toString().toLowerCase());
                break;
            case R.id.btnW:
                btnW.setEnabled(false);
                playGame(btnW.getText().toString().toLowerCase());
                break;
            case R.id.btnX:
                btnX.setEnabled(false);
                playGame(btnX.getText().toString().toLowerCase());
                break;
            case R.id.btnY:
                btnY.setEnabled(false);
                playGame(btnY.getText().toString().toLowerCase());
                break;
            case R.id.btnZ:
                btnZ.setEnabled(false);
                playGame(btnZ.getText().toString().toLowerCase());
                break;
        }
    }

    private void generateListWord() {
        // TODO Auto-generated method stub

        Word jintoga = new Word("jintoga", 3);
        Word trololol = new Word("trololol", 2);
        Word vn = new Word("vietnam", 3);
        Word dat = new Word("nguyenquocdat", 4);
        listword = new ArrayList<Word>();

        listword.add(jintoga);
        listword.add(trololol);
        listword.add(dat);
        listword.add(vn);

    }

    private void setEvents() {

        btnAlpha.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent = getIntent();
                finish();
                startActivity(intent);

            }
        });

        setOnclickForButtons();
    }

    protected void Move() {
        // TODO Auto-generated method stub
        final float amountToMoveLeft = -65;
        // SetDisableButtons();

        anim = new TranslateAnimation(Animation.ABSOLUTE, amountToMoveLeft,
                Animation.ABSOLUTE, Animation.ABSOLUTE);
        anim.setFillEnabled(true);
        anim.setDuration(150);

        anim.setAnimationListener(new TranslateAnimation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // TODO Auto-generated method stub

				/*
                 * animation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
				 * animation.setDuration(1); imgView.startAnimation(animation);
				 * // helping
				 */
                params = (FrameLayout.LayoutParams) imgView
                        .getLayoutParams();

                params.rightMargin -= amountToMoveLeft;
                imgView.setLayoutParams(params);

            }
        });
        imgView.startAnimation(anim);
    }

    protected void showRandom() {
        // TODO Auto-generated method stub
        Random random = new Random();
        randomWord = (Word) listword.get(random.nextInt(listword.size()));

    }

    private void getID() {
        // TODO Auto-generated method stub
        tvword = (TextView) findViewById(R.id.tvWord);
        Typeface typeface = Typeface.createFromAsset(getAssets(),
                "font/letter_gothic_line.ttf");
        tvword.setTypeface(typeface);
        WordLength = (TextView) findViewById(R.id.tvWordLength);
        Turn = (TextView) findViewById(R.id.tvTurn);
        btnA = (Button) findViewById(R.id.btnA);
        btnB = (Button) findViewById(R.id.btnB);
        btnC = (Button) findViewById(R.id.btnC);
        btnD = (Button) findViewById(R.id.btnD);
        btnE = (Button) findViewById(R.id.btnE);
        btnF = (Button) findViewById(R.id.btnF);
        btnG = (Button) findViewById(R.id.btnG);
        btnH = (Button) findViewById(R.id.btnH);
        btnI = (Button) findViewById(R.id.btnI);
        btnJ = (Button) findViewById(R.id.btnJ);
        btnK = (Button) findViewById(R.id.btnK);
        btnL = (Button) findViewById(R.id.btnL);
        btnM = (Button) findViewById(R.id.btnM);
        btnN = (Button) findViewById(R.id.btnN);
        btnO = (Button) findViewById(R.id.btnO);
        btnP = (Button) findViewById(R.id.btnP);
        btnQ = (Button) findViewById(R.id.btnQ);
        btnR = (Button) findViewById(R.id.btnR);
        btnS = (Button) findViewById(R.id.btnS);
        btnT = (Button) findViewById(R.id.btnT);
        btnU = (Button) findViewById(R.id.btnU);
        btnV = (Button) findViewById(R.id.btnV);
        btnW = (Button) findViewById(R.id.btnW);
        btnX = (Button) findViewById(R.id.btnX);
        btnY = (Button) findViewById(R.id.btnY);
        btnZ = (Button) findViewById(R.id.btnZ);

        btnAlpha = (Button) findViewById(R.id.btnNewGame);
        imgView = (ImageView) findViewById(R.id.imageView1);
        ivdie = (ImageView) findViewById(R.id.imageView2);
        ivdie.setVisibility(View.GONE);

    }

    private void SetDisableButtons() {
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        btnE.setEnabled(false);
        btnF.setEnabled(false);
        btnG.setEnabled(false);
        btnH.setEnabled(false);
        btnI.setEnabled(false);
        btnJ.setEnabled(false);
        btnK.setEnabled(false);
        btnL.setEnabled(false);
        btnM.setEnabled(false);
        btnN.setEnabled(false);
        btnO.setEnabled(false);
        btnP.setEnabled(false);
        btnQ.setEnabled(false);
        btnR.setEnabled(false);
        btnS.setEnabled(false);
        btnT.setEnabled(false);
        btnU.setEnabled(false);
        btnV.setEnabled(false);
        btnW.setEnabled(false);
        btnX.setEnabled(false);
        btnY.setEnabled(false);
        btnZ.setEnabled(false);
    }

    private void SetEnableButtons() {
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnE.setEnabled(true);
        btnF.setEnabled(true);
        btnG.setEnabled(true);
        btnH.setEnabled(true);
        btnI.setEnabled(true);
        btnJ.setEnabled(true);
        btnK.setEnabled(true);
        btnL.setEnabled(true);
        btnM.setEnabled(true);
        btnN.setEnabled(true);
        btnO.setEnabled(true);
        btnP.setEnabled(true);
        btnQ.setEnabled(true);
        btnR.setEnabled(true);
        btnS.setEnabled(true);
        btnT.setEnabled(true);
        btnU.setEnabled(true);
        btnV.setEnabled(true);
        btnW.setEnabled(true);
        btnX.setEnabled(true);
        btnY.setEnabled(true);
        btnZ.setEnabled(true);
    }

}

package Test;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.InstrumentationTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hangman.MainActivity;
import com.example.hangman.R;

import junit.framework.TestCase;

import model.Word;

/**
 * Created by DAT on 5/1/2015.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    Button btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI,
            btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT,
            btnU, btnV, btnW, btnX, btnY, btnZ;
    Activity activity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @SmallTest
    public void testTimeToGuess() throws Exception {
        int turnToGuess = 3;
        assertEquals(turnToGuess, getActivity().getListword().get(0).getTimeToGuess());

    }

    @SmallTest
    public void testAnimationNull() throws Exception {
        ImageView imageView = (ImageView) activity.findViewById(R.id.imageView1);
        assertNull(imageView.getAnimation());
    }

    @SmallTest
    public void testContentsNotNull() throws Exception {
        TextView tvWord = (TextView) activity.findViewById(R.id.tvWord);
        TextView tvTurn = (TextView) activity.findViewById(R.id.tvTurn);
        TextView tvWordLength = (TextView) activity.findViewById(R.id.tvWordLength);
        assertNotNull(tvWord);
        assertNotNull(tvTurn);
        assertNotNull(tvWordLength);
    }

    @SmallTest
    public void testButtons() throws Exception {

        btnA = (Button) activity.findViewById(R.id.btnA);
        btnB = (Button) activity.findViewById(R.id.btnB);
        btnC = (Button) activity.findViewById(R.id.btnC);

        assertEquals("A", btnA.getText());
        assertEquals("B", btnB.getText());
        assertEquals("C", btnC.getText());
    }

    @SmallTest
    public void testListWordNotNull() throws Exception {
        assertNull(getActivity().getListword());
    }


    @SmallTest
    public void testCheckCorrectWords() throws Exception {
        assertEquals("jintoga", getActivity().getListword().get(0).getWord());
    }


}

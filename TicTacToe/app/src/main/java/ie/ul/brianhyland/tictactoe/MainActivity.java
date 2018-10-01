package ie.ul.brianhyland.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TicTacToeGame mGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGame = new TicTacToeGame(this);
    }

    public void pressedSquare (View view){
        String tagAsStr = view.getTag().toString();
        int tagAsInt = Integer.parseInt(tagAsStr);
        //Log.d("TTT", "You pressed indew" +tagAsInt);

        //Toast.makeText(this, "You pressed index" +tagAsInt, Toast.LENGTH_SHORT).show();

    }

    public void pressedNewGame (View view){
        String tagAsStr = view.getTag().toString();
        int tagAsInt = Integer.parseInt(tagAsStr);
        //Log.d("TTT", "You pressed indew" +tagAsInt);

        //Toast.makeText(this, "New Game", Toast.LENGTH_SHORT).show();

    }
}

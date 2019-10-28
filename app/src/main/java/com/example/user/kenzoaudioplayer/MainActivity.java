package android.audioplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.user.kenzoaudioplayer.R;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp=MediaPlayer.create( this, R.raw.yoursong);
    }

    public void playSong(View v){
        mp.start();
    }

    public void pauseSong(View v){
        mp.pause();
    }

    public void stopSong(View v){
        mp.stop();
        finish();
        moveTaskToBack(true);
    }
}

package com.dashen.xiangmu.adapter;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dashen.xiangmu.R;

import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.Vitamio;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    private String videoUrl = "http://sj.video.5054399.com/sjyx/yztmxcp/160113yizhetemaikhd.mp4";
    private TextView cacheTextView;
    private TextView speedTextView;
    private VideoView vitamioVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        if (Vitamio.initialize(this)){
            cacheTextView = ((TextView) findViewById(R.id.cache));
            speedTextView = ((TextView) findViewById(R.id.speed));
            vitamioVideoView = ((VideoView) findViewById(R.id.vitamio_videoview));
            vitamioVideoView.setVideoURI(Uri.parse(videoUrl));

            MediaController controller = new MediaController(this);
            controller.setMediaPlayer(vitamioVideoView);
            vitamioVideoView.setMediaController(controller);
            controller.setPadding(100,0,100,200);


            vitamioVideoView.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() {
                @Override
                public void onBufferingUpdate(MediaPlayer mp, int percent) {
                    cacheTextView.setText("缓冲了"+percent+"%");
                }
            });
            vitamioVideoView.setOnInfoListener(new MediaPlayer.OnInfoListener() {
                @Override
                public boolean onInfo(MediaPlayer mp, int what, int extra) {
                    speedTextView.setText("下载速度："+extra+"kb/s");
                    return false;
                }
            });
            vitamioVideoView.start();
        }
    }
}

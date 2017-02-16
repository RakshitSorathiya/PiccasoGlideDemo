package demo.android.piccasoglidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    ImageView iv_p;
    ImageView iv_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_p = (ImageView) findViewById(R.id.iv_p);
        iv_g = (ImageView) findViewById(R.id.iv_g);

        Picasso.with(this)
                .load("http://ndl.mgccw.com/mu3/000/488/937/sss/68ad9b3f576e42399021560560fb3a16_small.png")
                .into(iv_p);

        String imgUrl = "http://api.androidhive.info/images/glide/medium/deadpool.jpg";


        Glide.with(this).load("https://mir-s3-cdn-cf.behance.net/project_modules/disp/fa041c19461997.562dad20dff1a.gif")
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(iv_g);
    }
}

package com.edaixi.twitteranimation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.lbtn_one)
    com.edaixi.twitteranimation.LikeButtonView lbtn_one;
    @Bind(R.id.lbtn_two)
    com.edaixi.twitteranimation.LikeButtonView lbtn_two;
    @Bind(R.id.lbtn_three)
    com.edaixi.twitteranimation.LikeButtonView lbtn_three;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "我是吐丝的替代者,我很漂亮", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });

        lbtn_one.setTvMenu("首页");
        lbtn_two.setTvMenu("订单");
        lbtn_three.setTvMenu("我的");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Snackbar.make(lbtn_one, "我已经刷新了,你眼瞎哈", Snackbar.LENGTH_SHORT)
                    .setAction("Action", null).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

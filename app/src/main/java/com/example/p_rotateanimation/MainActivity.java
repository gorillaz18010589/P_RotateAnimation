package com.example.p_rotateanimation;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Build;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setAnimtion();
    }

    private void setAnimtion() {
        ImageView iv = (ImageView) this.findViewById(R.id.img);

        // 動畫設定 (指定旋轉動畫)
        Animation am = new RotateAnimation(0, 90, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

        // 動畫開始到結束的執行時間 (1000 = 1 秒)
        am.setDuration(2000);

        // 動畫重複次數 (Animation.INFINITE表示一直重複)
        am.setRepeatCount(Animation.INFINITE);

        // 圖片配置動畫
        iv.setAnimation(am);

        // 動畫開始
        am.startNow();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void imgRotation(View view) {
//        container = findViewById(R.id.container);
//        ConstraintSet constraintSet = new ConstraintSet();
//        constraintSet.clone(container);
//        constraintSet.setRotation(R.id.img,90f);
//        TransitionManager.beginDelayedTransition(container);
//        constraintSet.applyTo(container);

        setAnimtion();
    }



}

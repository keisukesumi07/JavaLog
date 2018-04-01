package jp.techacademy.sumi.keisuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human taro = new Human("太郎", 25,"ランニング");
        //Human ziro  = new Human("太郎", 25,"料理");

        taro.say();
        taro.think();

        //ziro.say();
        //ziro.think();
    }
}
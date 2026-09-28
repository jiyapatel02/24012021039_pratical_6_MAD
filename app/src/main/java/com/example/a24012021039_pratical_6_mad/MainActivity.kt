package com.example.a24012021039_pratical_6_mad

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var alarmImage: ImageView
    private lateinit var heartImage: ImageView
    private lateinit var alarmAnimation: AnimationDrawable
    private lateinit var heartAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        alarmImage = findViewById(R.id.topBg1)
        alarmImage.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmAnimation = alarmImage.background as AnimationDrawable

        heartImage = findViewById(R.id.imgHeart)
        heartImage.setBackgroundResource(R.drawable.heart_animation_list)
        heartAnimation = heartImage.background as AnimationDrawable

        alarmAnimation.start()
        heartAnimation.start()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            alarmAnimation.start()
            heartAnimation.start()
        } else {
            alarmAnimation.stop()
            heartAnimation.stop()
        }
    }
}

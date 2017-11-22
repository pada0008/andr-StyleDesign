package com.sriyanksiddhartha.stylesandthemesdemo;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Author: Sriyank Siddhartha
 *
 * Module 4: Applying Themes
 *
 * 		"AFTER" Demo Project
 * */
public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView txvGradient = (TextView) findViewById(R.id.txvGradient);
		LinearGradient linearGradient = new LinearGradient(0, 0,
				0, txvGradient.getTextSize(), Color.GREEN, Color.RED, Shader.TileMode.MIRROR);

		txvGradient.getPaint().setShader(linearGradient);
	}
}

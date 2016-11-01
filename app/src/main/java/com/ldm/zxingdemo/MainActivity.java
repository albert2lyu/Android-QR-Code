package com.ldm.zxingdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @param
 * @author ldm
 * @description 项目主界面，就两个Button
 * @time 2016/04/11 16:22
 */
public class MainActivity extends Activity implements View.OnClickListener {
    private Button scan_btn;
    private Button made_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.scan_btn = (Button) findViewById(R.id.scan_btn);
        this.made_btn = (Button) findViewById(R.id.made_btn);
        this.scan_btn.setOnClickListener(this);
        this.made_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.scan_btn) {
            startActivity(new Intent(this, ScanCodeActivity.class));
        } else if (v.getId() == R.id.made_btn) {
            startActivity(new Intent(this, MadeCodeActivity.class));
        }
    }
}

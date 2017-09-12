package com.moligy.viewdraghelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.moligy.R;

public class ViewDragHelperMain extends AppCompatActivity implements View.OnClickListener{
    private Button mVerticalDrawerLayoutBtn;
    private Button mViewDrawerHealperBtn;
    private Button mViewDrawerHealperBtn1;
    private Button YouToBe;
    private Button vdh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_drag_helper_main);
        init();
    }

    private void init() {
        mVerticalDrawerLayoutBtn = (Button) findViewById(R.id.btn_1);
        mViewDrawerHealperBtn = (Button) findViewById(R.id.btn_2);
        mViewDrawerHealperBtn1 = (Button) findViewById(R.id.btn_3);
        YouToBe = (Button) findViewById(R.id.YouToBe);
        vdh = (Button) findViewById(R.id.vdh);
        mVerticalDrawerLayoutBtn.setOnClickListener(this);
        mViewDrawerHealperBtn.setOnClickListener(this);
        mViewDrawerHealperBtn1.setOnClickListener(this);
        YouToBe.setOnClickListener(this);
        vdh.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mVerticalDrawerLayoutBtn) {
            startActivity(new Intent(ViewDragHelperMain.this, VerticalDrawerLayoutActivity.class));
        }
        else if (v == mViewDrawerHealperBtn) {
            startActivity(new Intent(ViewDragHelperMain.this, ViewDragHelperActivity.class));
        }
        else if (v == mViewDrawerHealperBtn1) {
            startActivity(new Intent(ViewDragHelperMain.this, WanDouJiaActivity.class));
        }
        else if (v == YouToBe) {
            startActivity(new Intent(ViewDragHelperMain.this, YouToBe.class));
        }
        else if (v == vdh) {
            startActivity(new Intent(ViewDragHelperMain.this, VDHActivity.class));
        }
    }
}

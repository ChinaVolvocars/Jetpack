package com.volvo.downloadmanager;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Toast;

import com.volvo.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DownloadManagerActivity extends AppCompatActivity {


  @Override
  public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    setContentView(R.layout.download_manager_activity);
    findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(DownloadManagerActivity.this, "下载开始", Toast.LENGTH_SHORT).show();
      }
    });
  }



}

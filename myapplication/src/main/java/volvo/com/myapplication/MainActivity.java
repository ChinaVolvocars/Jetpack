package volvo.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;

import volvo.com.myapplication.rv.AutoPollAdapter;
import volvo.com.myapplication.rv.AutoPollRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);
    initView();
  }

  private void initView() {
    AutoPollRecyclerView mRecyclerView = (AutoPollRecyclerView) findViewById(R.id.rv_recycleView);
    List<String> list = new ArrayList<>();
    for (int i = 0; i < 5; ) {
      list.add(" Item: " + ++i);
    }
    AutoPollAdapter adapter = new AutoPollAdapter(this, list);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL));
    mRecyclerView.setAdapter(adapter);
    if (true) //保证itemCount的总个数宽度超过屏幕宽度->自己处理
      mRecyclerView.start();
  }
}

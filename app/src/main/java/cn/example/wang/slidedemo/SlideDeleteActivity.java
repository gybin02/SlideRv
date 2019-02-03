package cn.example.wang.slidedemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import cn.example.wang.slidedemo.slideswaphelper.ItemSlideCallback;
import cn.example.wang.slidedemo.slideswaphelper.ItemSlideHelper;

/**
 * 简单的侧滑删除
 */
public class SlideDeleteActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private RecOtherTypeAdapter recAdapter;

    public static void start(Context context){
        Intent intent = new Intent(context, SlideDeleteActivity.class);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_delete);
        initView();
        initData();
    }

    private void initData() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add("Item  " +i);
        }
        recAdapter.setList(list);
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerViewTwo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recAdapter = new RecOtherTypeAdapter(this);
        recyclerView.setAdapter(recAdapter);

        ItemSlideCallback callback = new ItemSlideCallback(recAdapter);
        ItemSlideHelper extension = new ItemSlideHelper(callback);
        extension.attachToRecyclerView(recyclerView);
    }
}

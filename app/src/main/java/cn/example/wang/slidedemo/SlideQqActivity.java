package cn.example.wang.slidedemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import cn.example.wang.slidedemo.slideswaphelper.ItemSlideCallback;
import cn.example.wang.slidedemo.slideswaphelper.ItemSlideHelper;

/**
 * 仿QQ，侧滑
 * @author zhengxiaobin@babytree-inc.com
 * @since  2019/2/3 下午2:01
 */
public class SlideQqActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private RecAdapter recAdapter;

    public static void start(Context context){
        Intent intent = new Intent(context, SlideQqActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qq);
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
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recAdapter = new RecAdapter(this);
        recyclerView.setAdapter(recAdapter);
        /*ItemTouchHelperCallback touchHelperCallback = new ItemTouchHelperCallback();
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(touchHelperCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);*/

        //作为一个ItemDecoration 写入的
        ItemSlideCallback callback = new ItemSlideCallback(recAdapter, ItemSlideHelper.SLIDE_ITEM_TYPE_SLIDECONTAINER);
        ItemSlideHelper extension = new ItemSlideHelper(callback);
        extension.attachToRecyclerView(recyclerView);
    }
}

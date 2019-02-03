//package cn.example.wang.slideslipedemo;
//
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.support.v7.widget.helper.ItemTouchHelper;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import cn.example.wang.slideslipedemo.slideswaphelper.ItemSlideHelperCallback;
//
///**
// * 系统 原生  ItemTouchHelper 测试
// *
// * @author zhengxiaobin@babytree-inc.com
// * @since 2019/2/3 下午2:03
// */
//public class ItemTouchHelperActivity extends AppCompatActivity {
//    RecyclerView recyclerView;
//    private RecOtherTypeAdapter recAdapter;
//
//    public static void start(Context context) {
//        Intent intent = new Intent(context, ItemTouchHelperActivity.class);
//        context.startActivity(intent);
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_slide_other_type);
//        initView();
//        initData();
//    }
//
//    private void initData() {
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < 30; i++) {
//            list.add("Item  " + i);
//        }
//        recAdapter.setList(list);
//    }
//
//    private void initView() {
//        recyclerView = findViewById(R.id.recyclerViewTwo);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recAdapter = new RecOtherTypeAdapter(this);
//        recyclerView.setAdapter(recAdapter);
//
//        ItemSlideHelperCallback touchHelperCallback = new ItemSlideHelperCallback();
//        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(touchHelperCallback);
//        itemTouchHelper.attachToRecyclerView(recyclerView);
//
////
////        PlusItemSlideCallback callback = new PlusItemSlideCallback(WItemTouchHelperPlus.SLIDE_ITEM_TYPE_SLIDECONTAINER);
////        WItemTouchHelperPlus extension = new WItemTouchHelperPlus(callback);
//        itemTouchHelper.attachToRecyclerView(recyclerView);
//    }
//}

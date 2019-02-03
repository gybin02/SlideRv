package cn.example.wang.slidedemo.slideswaphelper;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public interface Extension {

    /**
     * 请告诉我们你的侧滑菜单宽度是多少，才能准确的计算视图最大滑动距离
     *
     * @param
     * @return
     */
    int getActionWidth(RecyclerView.ViewHolder holder);

    /**
     * @param holder 手指所在条目所持有的viewhodler
     * @return 返回侧滑时需要跟着手指移动的View, 如果该条目不可滑动，请返回null
     */
    View getContentView(RecyclerView.ViewHolder holder);
}

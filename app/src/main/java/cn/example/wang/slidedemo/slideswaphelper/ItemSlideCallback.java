package cn.example.wang.slidedemo.slideswaphelper;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;


/**
 * Created by WANG on 18/3/14.
 */

public class ItemSlideCallback extends ItemSlideHelper.Callback {
    private Extension extension;
    String type;

    /**
     * ItemTouchHelperPlus#SLIDE_ITEM_TYPE_ITEMVIEW
     * ItemTouchHelperPlus#SLIDE_ITEM_TYPE_SLIDECONTAINER
     *
     * @param type
     */
    public ItemSlideCallback(Extension extension,String type) {
        init(extension, type);
    }

    public ItemSlideCallback(Extension extension) {
        init(extension, ItemSlideHelper.SLIDE_ITEM_TYPE_ITEMVIEW);
    }


    public void init(Extension extension, String type) {
        this.type = type;
        this.extension = extension;
    }

    @Override
    public boolean isItemViewSwipeEnabled() {
        return true;
    }


    @Override
    int getSlideViewWidth() {
        return 0;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return makeMovementFlags(0, ItemTouchHelper.START);
    }

    @Override
    public String getItemSlideType() {
        return type;
    }

    @Override
    public int getActionWidth(RecyclerView.ViewHolder viewHolder) {
        return extension.getActionWidth(viewHolder);
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

    }

    @Override
    public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        float actionWidth = extension.getActionWidth(viewHolder);
        View contentView = extension.getContentView(viewHolder);
        if (dX < -actionWidth) {
            dX = -actionWidth;
        }
        contentView.setTranslationX(dX);
    }

    @Override
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
    }
}

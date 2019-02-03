//package cn.example.wang.slideslipedemo.slideswaphelper;
//
//import android.graphics.Canvas;
//import android.support.v7.widget.RecyclerView;
//import android.support.v7.widget.helper.ItemTouchHelper;
//import android.view.View;
//
//import cn.example.wang.slideslipedemo.RecOtherTypeAdapter;
//
//
///**
// * Created by WANG on 18/3/14.
// */
//
//public class ItemSlideHelperCallback extends ItemTouchHelper.Callback {
//    String type;
//    private View currentView;
//
////    public ItemSlideHelper(String type) {
////        this.type = type;
////    }
//
//    @Override
//    public boolean isItemViewSwipeEnabled() {
//        return true;
//    }
//
//
//    public int getSlideViewWidth() {
//        return 0;
//    }
//
//    @Override
//    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
//        return makeMovementFlags(ItemTouchHelper.ACTION_STATE_IDLE, ItemTouchHelper.START);
//    }
//
//    public String getItemSlideType() {
//        return type;
//    }
//
//    @Override
//    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
//        return false;
//    }
//
//    @Override
//    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
//        if (viewHolder instanceof RecOtherTypeAdapter.RecViewholder) {
//            RecOtherTypeAdapter.RecViewholder holder = (RecOtherTypeAdapter.RecViewholder) viewHolder;
//            currentView = holder.textView;
//        }
//
//    }
//
//    @Override
//    public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
//        if (viewHolder instanceof RecOtherTypeAdapter.RecViewholder) {
//            RecOtherTypeAdapter.RecViewholder holder = (RecOtherTypeAdapter.RecViewholder) viewHolder;
//            float actionWidth = holder.getActionWidth();
//            if (dX < -actionWidth) {
//                dX = -actionWidth;
//            }
//            holder.textView.setTranslationX(dX);
//        }
//    }
//
//    @Override
//    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
//        super.clearView(recyclerView, viewHolder);
//        if (viewHolder instanceof RecOtherTypeAdapter.RecViewholder) {
//            RecOtherTypeAdapter.RecViewholder holder = (RecOtherTypeAdapter.RecViewholder) viewHolder;
//            if (currentView != null) {
//                currentView.setTranslationX(0);
//            }
////            holder.textView.setTranslationX(0);
////            ViewCompat.setTranslationX(viewHolder.itemView, 0);
//        }
//    }
//}

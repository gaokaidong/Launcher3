
package com.android.launcher3;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.android.launcher3.model.PackageItemInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;



public class TestView extends LinearLayout implements BaseRecyclerViewFastScrollBar.FastScrollFocusableView{
	
	private BubbleTextView bubbleChild;
	private ImageView imageview;
	private Context context;
	
	public TestView(Context  context){
		this(context,null);
	}

	public TestView(Context context,AttributeSet attrs){
		this(context,attrs,0);
	}

	public TestView(Context context,AttributeSet attrs,int defStyleAttr){
		super(context,attrs,defStyleAttr);
		InitView(context);
	}

	private void InitView(Context context){
		LayoutInflater inflater = (LayoutInflater)context.getSystemService (Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.test_view,this,true);
		bubbleChild = (BubbleTextView)findViewById(R.id.bubbleChild);
		imageview = (ImageView)findViewById(R.id.imageview);
		imageview.setVisibility(View.VISIBLE);
	}
	
	public View CreateBubbleTextView(){
        	return bubbleChild;
	}

    public void setImageVisible(){
        imageview.setVisibility(View.INVISIBLE);
    }

	public void applyFromShortcutInfo(ShortcutInfo info, IconCache iconCache){
		bubbleChild.applyFromShortcutInfo(info,iconCache);
	}

	public void applyFromApplicationInfo(AppInfo info){
		bubbleChild.applyFromApplicationInfo(info);
	}

	public void applyFromPackageItemInfo(PackageItemInfo info) {
		bubbleChild.applyFromPackageItemInfo(info);
	}
	public void setLongPressTimeout(int longPressTimeout) {
		bubbleChild.setLongPressTimeout(longPressTimeout);
	}
	
	@Override
     public void setTag(Object tag) {
     	bubbleChild.setTag(tag);
     	super.setTag(tag);
     }

     public Object getTag() {
        return bubbleChild.getTag();
     }

     @Override
     public void setPressed(boolean pressed) {
        super.setPressed(pressed);
        bubbleChild.setPressed(pressed);
     }


    public Drawable getIcon() {
        return bubbleChild.getIcon();
    } 

    public boolean isLayoutHorizontal() {
        return bubbleChild.isLayoutHorizontal();
    }


     public void setTextColor(int color) {
         bubbleChild.setTextColor(color);
     }

     public void setTextColor(ColorStateList colors) {
     	bubbleChild.setTextColor(colors);
     }

     public void setTextVisibility(boolean visible) {
     	bubbleChild.setTextVisibility(visible);
     }

     public void setText(CharSequence text){
        bubbleChild.setText(text);
     } 

     public void cancelLongPress() {
     	bubbleChild.cancelLongPress();
     }

     public void applyState(boolean promiseStateChanged) {
     	bubbleChild.applyState(promiseStateChanged);
     }

     public void reapplyItemInfo(final ItemInfo info) {
     	bubbleChild.reapplyItemInfo(info);
     }

     public void verifyHighRes() {
     	bubbleChild.verifyHighRes();
     }

     @Override
     public Object getTag(int key) {
        return bubbleChild.getTag(key);
     }

     public void setFastScrollFocus(float fraction) {
     	bubbleChild.setFastScrollFocus(fraction);
     }

     public float getFastScrollFocus() {
     	return bubbleChild.getFastScrollFocus();
     }

	@Override
     public void setFastScrollFocused(final boolean focused, boolean animated) {
     	bubbleChild.setFastScrollFocused(focused,animated);
     }
     public static interface BubbleTextShadowHandler {
         void setPressedIcon(BubbleTextView icon, Bitmap background);
     }


	
	
}

package com.animbus.music.customImpls;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.animbus.music.media.objects.album.Album;

public class SquareImageViewHeight_Based extends ImageView {
    public boolean isInEditMode() {
        return true;
    }

    public SquareImageViewHeight_Based(Context context) {
        super(context);
    }

    public SquareImageViewHeight_Based(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImageViewHeight_Based(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int height = getMeasuredHeight();
        setMeasuredDimension(height, height);
    }

    public void setAlbumArt(final Album album) {
        album.requestArt(this);
    }

}
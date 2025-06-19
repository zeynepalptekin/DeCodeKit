package c.a.b.c.j;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.h0;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class a implements View.OnTouchListener {

    @h0
    private final Dialog d;
    private final int e;
    private final int f;
    private final int g;

    public a(@h0 Dialog dialog, @h0 Rect rect) {
        this.d = dialog;
        this.e = rect.left;
        this.f = rect.top;
        this.g = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@h0 View view, @h0 MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.e + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int r7 = this.g;
            motionEventObtain.setLocation((-r7) - 1, (-r7) - 1);
        }
        view.performClick();
        return this.d.onTouchEvent(motionEventObtain);
    }
}

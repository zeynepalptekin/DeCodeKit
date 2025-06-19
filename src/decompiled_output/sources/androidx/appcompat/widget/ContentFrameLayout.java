package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.p0;

@androidx.annotation.p0({p0.a.LIBRARY})
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    private TypedValue d;
    private TypedValue e;
    private TypedValue f;
    private TypedValue g;
    private TypedValue h;
    private TypedValue i;
    private final Rect j;
    private a k;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public ContentFrameLayout(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.j = new Rect();
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void b(int r2, int r3, int r4, int r5) {
        this.j.set(r2, r3, r4, r5);
        if (b.i.p.f0.P0(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.h == null) {
            this.h = new TypedValue();
        }
        return this.h;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.i == null) {
            this.i = new TypedValue();
        }
        return this.i;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.g == null) {
            this.g = new TypedValue();
        }
        return this.g;
    }

    public TypedValue getMinWidthMajor() {
        if (this.d == null) {
            this.d = new TypedValue();
        }
        return this.d;
    }

    public TypedValue getMinWidthMinor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.k;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.k;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.k = aVar;
    }
}

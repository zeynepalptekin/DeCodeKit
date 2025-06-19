package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.p0;
import b.a.a;
import java.lang.ref.WeakReference;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    private int d;
    private int e;
    private WeakReference<View> f;
    private LayoutInflater g;
    private a h;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r5) {
        super(context, attributeSet, r5);
        this.d = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.ViewStubCompat, r5, 0);
        this.e = typedArrayObtainStyledAttributes.getResourceId(a.m.ViewStubCompat_android_inflatedId, -1);
        this.d = typedArrayObtainStyledAttributes.getResourceId(a.m.ViewStubCompat_android_layout, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(a.m.ViewStubCompat_android_id, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.d == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.g;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.d, viewGroup, false);
        int r2 = this.e;
        if (r2 != -1) {
            viewInflate.setId(r2);
        }
        int r22 = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, r22, layoutParams);
        } else {
            viewGroup.addView(viewInflate, r22);
        }
        this.f = new WeakReference<>(viewInflate);
        a aVar = this.h;
        if (aVar != null) {
            aVar.a(this, viewInflate);
        }
        return viewInflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.e;
    }

    public LayoutInflater getLayoutInflater() {
        return this.g;
    }

    public int getLayoutResource() {
        return this.d;
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int r1) {
        this.e = r1;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.g = layoutInflater;
    }

    public void setLayoutResource(int r1) {
        this.d = r1;
    }

    public void setOnInflateListener(a aVar) {
        this.h = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
        WeakReference<View> weakReference = this.f;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(r2);
            return;
        }
        super.setVisibility(r2);
        if (r2 == 0 || r2 == 4) {
            a();
        }
    }
}

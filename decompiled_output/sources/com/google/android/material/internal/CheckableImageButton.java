package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.annotation.h0;
import androidx.annotation.p0;
import b.a.a;
import b.i.p.f0;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class CheckableImageButton extends androidx.appcompat.widget.n implements Checkable {
    private static final int[] i = {R.attr.state_checked};
    private boolean f;
    private boolean g;
    private boolean h;

    class a extends b.i.p.a {
        a() {
        }

        @Override // b.i.p.a
        public void f(View view, @h0 AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // b.i.p.a
        public void g(View view, @h0 b.i.p.p0.d dVar) {
            super.g(view, dVar);
            dVar.R0(CheckableImageButton.this.a());
            dVar.S0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends b.k.b.a {
        public static final Parcelable.Creator<b> CREATOR = new a();
        boolean f;

        static class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(@h0 Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @h0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(@h0 Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int r1) {
                return new b[r1];
            }
        }

        public b(@h0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@h0 Parcel parcel) {
            this.f = parcel.readInt() == 1;
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(@h0 Parcel parcel, int r2) {
            super.writeToParcel(parcel, r2);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.g = true;
        this.h = true;
        f0.u1(this, new a());
    }

    public boolean a() {
        return this.g;
    }

    public boolean b() {
        return this.h;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int r2) {
        return this.f ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(r2 + i.length), i) : super.onCreateDrawableState(r2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f);
    }

    @Override // android.view.View
    @h0
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f = this.f;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.g != z) {
            this.g = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.g || this.f == z) {
            return;
        }
        this.f = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.h = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.h) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f);
    }
}

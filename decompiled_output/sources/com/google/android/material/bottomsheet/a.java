package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.c0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.t0;
import androidx.appcompat.app.i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.p.f0;
import c.a.b.c.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public class a extends i {
    private BottomSheetBehavior<FrameLayout> f;
    private FrameLayout g;
    boolean h;
    boolean i;
    private boolean j;
    private boolean k;

    @h0
    private BottomSheetBehavior.f l;

    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0192a implements View.OnClickListener {
        ViewOnClickListenerC0192a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.i && aVar.isShowing() && a.this.n()) {
                a.this.cancel();
            }
        }
    }

    class b extends b.i.p.a {
        b() {
        }

        @Override // b.i.p.a
        public void g(View view, @h0 b.i.p.p0.d dVar) {
            boolean z;
            super.g(view, dVar);
            if (a.this.i) {
                dVar.a(1048576);
                z = true;
            } else {
                z = false;
            }
            dVar.a1(z);
        }

        @Override // b.i.p.a
        public boolean j(View view, int r4, Bundle bundle) {
            if (r4 == 1048576) {
                a aVar = a.this;
                if (aVar.i) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, r4, bundle);
        }
    }

    class c implements View.OnTouchListener {
        c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class d extends BottomSheetBehavior.f {
        d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void a(@h0 View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@h0 View view, int r2) {
            if (r2 == 5) {
                a.this.cancel();
            }
        }
    }

    public a(@h0 Context context) {
        this(context, 0);
    }

    public a(@h0 Context context, @t0 int r2) {
        super(context, c(context, r2));
        this.i = true;
        this.j = true;
        this.l = new d();
        e(1);
    }

    protected a(@h0 Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.i = true;
        this.j = true;
        this.l = new d();
        e(1);
        this.i = z;
    }

    private static int c(@h0 Context context, int r3) {
        if (r3 != 0) {
            return r3;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(a.c.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : a.n.Theme_Design_Light_BottomSheetDialog;
    }

    private FrameLayout f() {
        if (this.g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), a.k.design_bottom_sheet_dialog, null);
            this.g = frameLayout;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorY = BottomSheetBehavior.Y((FrameLayout) frameLayout.findViewById(a.h.design_bottom_sheet));
            this.f = bottomSheetBehaviorY;
            bottomSheetBehaviorY.O(this.l);
            this.f.u0(this.i);
        }
        return this.g;
    }

    private View o(int r3, @i0 View view, @i0 ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g.findViewById(a.h.coordinator);
        if (r3 != 0 && view == null) {
            view = getLayoutInflater().inflate(r3, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.g.findViewById(a.h.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(a.h.touch_outside).setOnClickListener(new ViewOnClickListenerC0192a());
        f0.u1(frameLayout, new b());
        frameLayout.setOnTouchListener(new c());
        return this.g;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorI = i();
        if (!this.h || bottomSheetBehaviorI.f0() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorI.z0(5);
        }
    }

    @h0
    public BottomSheetBehavior<FrameLayout> i() {
        if (this.f == null) {
            f();
        }
        return this.f;
    }

    public boolean j() {
        return this.h;
    }

    void l() {
        this.f.l0(this.l);
    }

    public void m(boolean z) {
        this.h = z;
    }

    boolean n() {
        if (!this.k) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.j = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.k = true;
        }
        return this.j;
    }

    @Override // androidx.appcompat.app.i, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f0() != 5) {
            return;
        }
        this.f.z0(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.i != z) {
            this.i = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.u0(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.i) {
            this.i = true;
        }
        this.j = z;
        this.k = true;
    }

    @Override // androidx.appcompat.app.i, android.app.Dialog
    public void setContentView(@c0 int r2) {
        super.setContentView(o(r2, null, null));
    }

    @Override // androidx.appcompat.app.i, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(o(0, view, null));
    }

    @Override // androidx.appcompat.app.i, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(o(0, view, layoutParams));
    }
}

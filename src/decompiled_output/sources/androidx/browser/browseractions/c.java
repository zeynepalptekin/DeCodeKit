package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
class c extends Dialog {
    private static final long e = 250;
    private static final long f = 150;
    private final View d;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f224a;

        a(boolean z) {
            this.f224a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f224a) {
                return;
            }
            c.super.dismiss();
        }
    }

    c(Context context, View view) {
        super(context);
        this.d = view;
    }

    private void b(boolean z) {
        float f2 = z ? 0.0f : 1.0f;
        float f3 = z ? 1.0f : 0.0f;
        long j = z ? e : 150L;
        this.d.setScaleX(f2);
        this.d.setScaleY(f2);
        this.d.animate().scaleX(f3).scaleY(f3).setDuration(j).setInterpolator(new b.o.b.a.c()).setListener(new a(z)).start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        b(false);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        b(true);
        super.show();
    }
}

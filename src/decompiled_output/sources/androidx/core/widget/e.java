package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private EdgeEffect f405a;

    @Deprecated
    public e(Context context) {
        this.f405a = new EdgeEffect(context);
    }

    public static void e(@h0 EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    @Deprecated
    public boolean a(Canvas canvas) {
        return this.f405a.draw(canvas);
    }

    @Deprecated
    public void b() {
        this.f405a.finish();
    }

    @Deprecated
    public boolean c() {
        return this.f405a.isFinished();
    }

    @Deprecated
    public boolean d(int r2) {
        this.f405a.onAbsorb(r2);
        return true;
    }

    @Deprecated
    public boolean f(float f) {
        this.f405a.onPull(f);
        return true;
    }

    @Deprecated
    public boolean g(float f, float f2) {
        e(this.f405a, f, f2);
        return true;
    }

    @Deprecated
    public boolean h() {
        this.f405a.onRelease();
        return this.f405a.isFinished();
    }

    @Deprecated
    public void i(int r2, int r3) {
        this.f405a.setSize(r2, r3);
    }
}

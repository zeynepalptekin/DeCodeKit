package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
/* loaded from: classes.dex */
public abstract class kt extends TextureView implements du {
    protected final ut d;
    protected final eu e;

    public kt(Context context) {
        super(context);
        this.d = new ut();
        this.e = new eu(context, this);
    }

    public abstract void a();

    public abstract void d();

    public abstract void f();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void h(int r1);

    public abstract void i();

    public abstract void j(float f, float f2);

    public abstract void k(ht htVar);

    public void l(String str, String[] strArr) {
        setVideoPath(str);
    }

    public void m(int r1) {
    }

    public void n(int r1) {
    }

    public void o(int r1) {
    }

    public void p(int r1) {
    }

    public void q(int r1) {
    }

    public abstract String r();

    public abstract void setVideoPath(String str);
}

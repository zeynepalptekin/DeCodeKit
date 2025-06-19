package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f261a = "android.activity.usage_time";

    /* renamed from: b, reason: collision with root package name */
    public static final String f262b = "android.usage_time_packages";

    @m0(16)
    private static class a extends c {

        /* renamed from: c, reason: collision with root package name */
        private final ActivityOptions f263c;

        a(ActivityOptions activityOptions) {
            this.f263c = activityOptions;
        }

        @Override // androidx.core.app.c
        public Rect a() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return this.f263c.getLaunchBounds();
        }

        @Override // androidx.core.app.c
        public void j(@h0 PendingIntent pendingIntent) {
            if (Build.VERSION.SDK_INT >= 23) {
                this.f263c.requestUsageTimeReport(pendingIntent);
            }
        }

        @Override // androidx.core.app.c
        @h0
        public c k(@i0 Rect rect) {
            return Build.VERSION.SDK_INT < 24 ? this : new a(this.f263c.setLaunchBounds(rect));
        }

        @Override // androidx.core.app.c
        public Bundle l() {
            return this.f263c.toBundle();
        }

        @Override // androidx.core.app.c
        public void m(@h0 c cVar) {
            if (cVar instanceof a) {
                this.f263c.update(((a) cVar).f263c);
            }
        }
    }

    protected c() {
    }

    @h0
    public static c b() {
        return Build.VERSION.SDK_INT >= 23 ? new a(ActivityOptions.makeBasic()) : new c();
    }

    @h0
    public static c c(@h0 View view, int r3, int r4, int r5, int r6) {
        return Build.VERSION.SDK_INT >= 23 ? new a(ActivityOptions.makeClipRevealAnimation(view, r3, r4, r5, r6)) : new c();
    }

    @h0
    public static c d(@h0 Context context, int r3, int r4) {
        return Build.VERSION.SDK_INT >= 16 ? new a(ActivityOptions.makeCustomAnimation(context, r3, r4)) : new c();
    }

    @h0
    public static c e(@h0 View view, int r3, int r4, int r5, int r6) {
        return Build.VERSION.SDK_INT >= 16 ? new a(ActivityOptions.makeScaleUpAnimation(view, r3, r4, r5, r6)) : new c();
    }

    @h0
    public static c f(@h0 Activity activity, @h0 View view, @h0 String str) {
        return Build.VERSION.SDK_INT >= 21 ? new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str)) : new c();
    }

    @h0
    public static c g(@h0 Activity activity, b.i.o.f<View, String>... fVarArr) {
        if (Build.VERSION.SDK_INT < 21) {
            return new c();
        }
        Pair[] pairArr = null;
        if (fVarArr != null) {
            pairArr = new Pair[fVarArr.length];
            for (int r1 = 0; r1 < fVarArr.length; r1++) {
                pairArr[r1] = Pair.create(fVarArr[r1].f1147a, fVarArr[r1].f1148b);
            }
        }
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    @h0
    public static c h() {
        return Build.VERSION.SDK_INT >= 21 ? new a(ActivityOptions.makeTaskLaunchBehind()) : new c();
    }

    @h0
    public static c i(@h0 View view, @h0 Bitmap bitmap, int r4, int r5) {
        return Build.VERSION.SDK_INT >= 16 ? new a(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, r4, r5)) : new c();
    }

    @i0
    public Rect a() {
        return null;
    }

    public void j(@h0 PendingIntent pendingIntent) {
    }

    @h0
    public c k(@i0 Rect rect) {
        return this;
    }

    @i0
    public Bundle l() {
        return null;
    }

    public void m(@h0 c cVar) {
    }
}

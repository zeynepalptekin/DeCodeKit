package com.google.android.gms.ads.j0;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.uh;
import java.util.List;
import java.util.Map;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final oh f2428a;

    @com.google.android.gms.common.annotation.a
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final uh f2429a;

        @com.google.android.gms.common.annotation.a
        public a(View view) {
            uh uhVar = new uh();
            this.f2429a = uhVar;
            uhVar.d(view);
        }

        @com.google.android.gms.common.annotation.a
        public final d a() {
            return new d(this);
        }

        @com.google.android.gms.common.annotation.a
        public final a b(Map<String, View> map) {
            this.f2429a.c(map);
            return this;
        }
    }

    private d(a aVar) {
        this.f2428a = new oh(aVar.f2429a);
    }

    @com.google.android.gms.common.annotation.a
    public final void a(MotionEvent motionEvent) {
        this.f2428a.a(motionEvent);
    }

    @com.google.android.gms.common.annotation.a
    public final void b(Uri uri, e eVar) {
        this.f2428a.b(uri, eVar);
    }

    @com.google.android.gms.common.annotation.a
    public final void c(List<Uri> list, f fVar) {
        this.f2428a.c(list, fVar);
    }
}

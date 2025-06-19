package com.google.android.gms.ads.d0;

import android.view.View;
import com.google.android.gms.ads.d0.c;
import com.google.android.gms.ads.z;
import java.util.List;

/* loaded from: classes.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2371a = "_videoMediaView";

    public interface a {
        void a(View view);

        boolean start();
    }

    public interface b {
        void c(k kVar, String str);
    }

    public interface c {
        void e(k kVar);
    }

    List<String> D0();

    void Q0(String str);

    String Z0();

    c.b a1(String str);

    CharSequence b1(String str);

    a c1();

    com.google.android.gms.ads.d0.b d1();

    void destroy();

    void g();

    z getVideoController();
}

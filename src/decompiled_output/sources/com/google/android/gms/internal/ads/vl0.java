package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface vl0 {
    boolean A1();

    void F1(g5 g5Var);

    void N0();

    void V0();

    void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void b();

    void c(Bundle bundle);

    void d(View view);

    void destroy();

    void e(View view, Map<String, WeakReference<View>> map);

    void f();

    void g(@androidx.annotation.i0 View view, MotionEvent motionEvent, View view2);

    void h(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z);

    void i(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void j(String str);

    void j1(ez2 ez2Var);

    void k();

    void l(Bundle bundle);

    JSONObject m(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void n(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z);

    void n1(@androidx.annotation.i0 jz2 jz2Var);

    boolean o(Bundle bundle);
}

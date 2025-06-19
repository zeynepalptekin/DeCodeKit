package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.m0;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import java.lang.reflect.Field;

@m0(19)
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements h {

    /* renamed from: b, reason: collision with root package name */
    private static final int f4b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f5c = 1;
    private static final int d = 2;
    private static int e;
    private static Field f;
    private static Field g;
    private static Field h;

    /* renamed from: a, reason: collision with root package name */
    private Activity f6a;

    ImmLeaksCleaner(Activity activity) {
        this.f6a = activity;
    }

    @e0
    private static void h() throws NoSuchFieldException {
        try {
            e = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            g = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            h = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f = declaredField3;
            declaredField3.setAccessible(true);
            e = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.h
    public void d(@h0 j jVar, @h0 g.a aVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (aVar != g.a.ON_DESTROY) {
            return;
        }
        if (e == 0) {
            h();
        }
        if (e == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f6a.getSystemService("input_method");
            try {
                Object obj = f.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) g.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                h.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}

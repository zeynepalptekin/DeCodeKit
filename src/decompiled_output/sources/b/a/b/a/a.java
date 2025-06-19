package b.a.b.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m;
import androidx.annotation.q;
import androidx.appcompat.widget.o0;
import b.i.c.c;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f795a = "AppCompatResources";

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f796b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<C0038a>> f797c = new WeakHashMap<>(0);
    private static final Object d = new Object();

    /* renamed from: b.a.b.a.a$a, reason: collision with other inner class name */
    private static class C0038a {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f798a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f799b;

        C0038a(@h0 ColorStateList colorStateList, @h0 Configuration configuration) {
            this.f798a = colorStateList;
            this.f799b = configuration;
        }
    }

    private a() {
    }

    private static void a(@h0 Context context, @m int r4, @h0 ColorStateList colorStateList) {
        synchronized (d) {
            SparseArray<C0038a> sparseArray = f797c.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f797c.put(context, sparseArray);
            }
            sparseArray.append(r4, new C0038a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    @i0
    private static ColorStateList b(@h0 Context context, @m int r5) {
        C0038a c0038a;
        synchronized (d) {
            SparseArray<C0038a> sparseArray = f797c.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0038a = sparseArray.get(r5)) != null) {
                if (c0038a.f799b.equals(context.getResources().getConfiguration())) {
                    return c0038a.f798a;
                }
                sparseArray.remove(r5);
            }
            return null;
        }
    }

    public static ColorStateList c(@h0 Context context, @m int r3) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(r3);
        }
        ColorStateList colorStateListB = b(context, r3);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListF = f(context, r3);
        if (colorStateListF == null) {
            return c.f(context, r3);
        }
        a(context, r3, colorStateListF);
        return colorStateListF;
    }

    @i0
    public static Drawable d(@h0 Context context, @q int r2) {
        return o0.h().j(context, r2);
    }

    @h0
    private static TypedValue e() {
        TypedValue typedValue = f796b.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f796b.set(typedValue2);
        return typedValue2;
    }

    @i0
    private static ColorStateList f(Context context, int r3) throws Resources.NotFoundException {
        if (g(context, r3)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return b.i.c.j.a.a(resources, resources.getXml(r3), context.getTheme());
        } catch (Exception e) {
            Log.e(f795a, "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static boolean g(@h0 Context context, @m int r3) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        TypedValue typedValueE = e();
        resources.getValue(r3, typedValueE, true);
        int r2 = typedValueE.type;
        return r2 >= 28 && r2 <= 31;
    }
}

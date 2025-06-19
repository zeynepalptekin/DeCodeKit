package b.i.p;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1221a = "LayoutInflaterCompatHC";

    /* renamed from: b, reason: collision with root package name */
    private static Field f1222b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1223c;

    static class a implements LayoutInflater.Factory2 {
        final l d;

        a(l lVar) {
            this.d = lVar;
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.d.onCreateView(view, str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.d.onCreateView(null, str, context, attributeSet);
        }

        @androidx.annotation.h0
        public String toString() {
            return a.class.getName() + "{" + this.d + "}";
        }
    }

    private k() {
    }

    private static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!f1223c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f1222b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f1221a, "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f1223c = true;
        }
        Field field = f1222b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e(f1221a, "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    @Deprecated
    public static l b(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a) factory).d;
        }
        return null;
    }

    @Deprecated
    public static void c(@androidx.annotation.h0 LayoutInflater layoutInflater, @androidx.annotation.h0 l lVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 21) {
            layoutInflater.setFactory2(lVar != null ? new a(lVar) : null);
            return;
        }
        a aVar = lVar != null ? new a(lVar) : null;
        layoutInflater.setFactory2(aVar);
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof LayoutInflater.Factory2) {
            a(layoutInflater, (LayoutInflater.Factory2) factory);
        } else {
            a(layoutInflater, aVar);
        }
    }

    public static void d(@androidx.annotation.h0 LayoutInflater layoutInflater, @androidx.annotation.h0 LayoutInflater.Factory2 factory2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                a(layoutInflater, factory2);
            }
        }
    }
}

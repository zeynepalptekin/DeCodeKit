package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class x0 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f204c = new Object();
    private static ArrayList<WeakReference<x0>> d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f205a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f206b;

    private x0(@androidx.annotation.h0 Context context) {
        super(context);
        if (!f1.c()) {
            this.f205a = new z0(this, context.getResources());
            this.f206b = null;
            return;
        }
        f1 f1Var = new f1(this, context.getResources());
        this.f205a = f1Var;
        Resources.Theme themeNewTheme = f1Var.newTheme();
        this.f206b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(@androidx.annotation.h0 Context context) {
        if ((context instanceof x0) || (context.getResources() instanceof z0) || (context.getResources() instanceof f1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || f1.c();
    }

    public static Context b(@androidx.annotation.h0 Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f204c) {
            if (d == null) {
                d = new ArrayList<>();
            } else {
                for (int size = d.size() - 1; size >= 0; size--) {
                    WeakReference<x0> weakReference = d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        d.remove(size);
                    }
                }
                for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<x0> weakReference2 = d.get(size2);
                    x0 x0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (x0Var != null && x0Var.getBaseContext() == context) {
                        return x0Var;
                    }
                }
            }
            x0 x0Var2 = new x0(context);
            d.add(new WeakReference<>(x0Var2));
            return x0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f205a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f205a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f206b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r3) {
        Resources.Theme theme = this.f206b;
        if (theme == null) {
            super.setTheme(r3);
        } else {
            theme.applyStyle(r3, true);
        }
    }
}

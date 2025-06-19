package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f1 extends Resources {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f154b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final int f155c = 20;

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f156a;

    public f1(@androidx.annotation.h0 Context context, @androidx.annotation.h0 Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f156a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f154b;
    }

    public static void b(boolean z) {
        f154b = z;
    }

    public static boolean c() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    final Drawable d(int r1) {
        return super.getDrawable(r1);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int r3) throws Resources.NotFoundException {
        Context context = this.f156a.get();
        return context != null ? o0.h().t(context, this, r3) : super.getDrawable(r3);
    }
}

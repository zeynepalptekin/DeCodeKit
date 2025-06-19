package androidx.appcompat.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f46a = "ActionBarDrawerToggleHC";

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f47b = {R.attr.homeAsUpIndicator};

    static class a {

        /* renamed from: a, reason: collision with root package name */
        public Method f48a;

        /* renamed from: b, reason: collision with root package name */
        public Method f49b;

        /* renamed from: c, reason: collision with root package name */
        public ImageView f50c;

        a(Activity activity) {
            try {
                this.f48a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f49b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View viewFindViewById = activity.findViewById(R.id.home);
                if (viewFindViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f50c = (ImageView) childAt;
                }
            }
        }
    }

    private c() {
    }

    public static Drawable a(Activity activity) {
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(f47b);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static a b(a aVar, Activity activity, int r5) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (aVar == null) {
            aVar = new a(activity);
        }
        if (aVar.f48a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f49b.invoke(actionBar, Integer.valueOf(r5));
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
                Log.w(f46a, "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return aVar;
    }

    public static a c(Activity activity, Drawable drawable, int r8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        a aVar = new a(activity);
        if (aVar.f48a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f48a.invoke(actionBar, drawable);
                aVar.f49b.invoke(actionBar, Integer.valueOf(r8));
            } catch (Exception e) {
                Log.w(f46a, "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else {
            ImageView imageView = aVar.f50c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w(f46a, "Couldn't set home-as-up indicator");
            }
        }
        return aVar;
    }
}

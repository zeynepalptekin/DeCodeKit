package b.a.f;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import androidx.annotation.p0;
import b.a.a;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f813a;

    private a(Context context) {
        this.f813a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f813a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f813a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f813a.getResources().getConfiguration();
        int r1 = configuration.screenWidthDp;
        int r2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || r1 > 600) {
            return 5;
        }
        if (r1 > 960 && r2 > 720) {
            return 5;
        }
        if (r1 > 720 && r2 > 960) {
            return 5;
        }
        if (r1 >= 500) {
            return 4;
        }
        if (r1 > 640 && r2 > 480) {
            return 4;
        }
        if (r1 <= 480 || r2 <= 640) {
            return r1 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f813a.getResources().getDimensionPixelSize(a.e.abc_action_bar_stacked_tab_max_width);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f813a.obtainStyledAttributes(null, a.m.ActionBar, a.b.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(a.m.ActionBar_height, 0);
        Resources resources = this.f813a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(a.e.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f813a.getResources().getBoolean(a.c.abc_action_bar_embed_tabs);
    }

    public boolean h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f813a).hasPermanentMenuKey();
    }
}

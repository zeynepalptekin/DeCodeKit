package b.i.f.a;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, a> f1037b = new WeakHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static final String f1038c = "android.hardware.display.category.PRESENTATION";

    /* renamed from: a, reason: collision with root package name */
    private final Context f1039a;

    private a(Context context) {
        this.f1039a = context;
    }

    @h0
    public static a d(@h0 Context context) {
        a aVar;
        synchronized (f1037b) {
            aVar = f1037b.get(context);
            if (aVar == null) {
                aVar = new a(context);
                f1037b.put(context, aVar);
            }
        }
        return aVar;
    }

    @i0
    public Display a(int r3) {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((DisplayManager) this.f1039a.getSystemService("display")).getDisplay(r3);
        }
        Display defaultDisplay = ((WindowManager) this.f1039a.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay.getDisplayId() == r3) {
            return defaultDisplay;
        }
        return null;
    }

    @h0
    public Display[] b() {
        return Build.VERSION.SDK_INT >= 17 ? ((DisplayManager) this.f1039a.getSystemService("display")).getDisplays() : new Display[]{((WindowManager) this.f1039a.getSystemService("window")).getDefaultDisplay()};
    }

    @h0
    public Display[] c(@i0 String str) {
        return Build.VERSION.SDK_INT >= 17 ? ((DisplayManager) this.f1039a.getSystemService("display")).getDisplays(str) : str == null ? new Display[0] : new Display[]{((WindowManager) this.f1039a.getSystemService("window")).getDefaultDisplay()};
    }
}

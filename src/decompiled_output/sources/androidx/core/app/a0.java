package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a0 implements Iterable<Intent> {
    private static final String f = "TaskStackBuilder";
    private final ArrayList<Intent> d = new ArrayList<>();
    private final Context e;

    public interface a {
        @i0
        Intent i();
    }

    private a0(Context context) {
        this.e = context;
    }

    @h0
    public static a0 n(@h0 Context context) {
        return new a0(context);
    }

    @Deprecated
    public static a0 r(Context context) {
        return n(context);
    }

    public void A(@i0 Bundle bundle) {
        if (this.d.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.d;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (b.i.c.c.r(this.e, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.e.startActivity(intent);
    }

    @h0
    public a0 c(@h0 Intent intent) {
        this.d.add(intent);
        return this;
    }

    @h0
    public a0 h(@h0 Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.e.getPackageManager());
        }
        if (component != null) {
            j(component);
        }
        c(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @h0
    public a0 i(@h0 Activity activity) {
        Intent intentI = activity instanceof a ? ((a) activity).i() : null;
        if (intentI == null) {
            intentI = n.a(activity);
        }
        if (intentI != null) {
            ComponentName component = intentI.getComponent();
            if (component == null) {
                component = intentI.resolveActivity(this.e.getPackageManager());
            }
            j(component);
            c(intentI);
        }
        return this;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.d.iterator();
    }

    public a0 j(ComponentName componentName) {
        int size = this.d.size();
        try {
            Context context = this.e;
            while (true) {
                Intent intentB = n.b(context, componentName);
                if (intentB == null) {
                    return this;
                }
                this.d.add(size, intentB);
                context = this.e;
                componentName = intentB.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @h0
    public a0 l(@h0 Class<?> cls) {
        return j(new ComponentName(this.e, cls));
    }

    @i0
    public Intent o(int r2) {
        return this.d.get(r2);
    }

    @Deprecated
    public Intent s(int r1) {
        return o(r1);
    }

    public int t() {
        return this.d.size();
    }

    @h0
    public Intent[] u() {
        int size = this.d.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.d.get(0)).addFlags(268484608);
        for (int r2 = 1; r2 < size; r2++) {
            intentArr[r2] = new Intent(this.d.get(r2));
        }
        return intentArr;
    }

    @i0
    public PendingIntent v(int r2, int r3) {
        return x(r2, r3, null);
    }

    @i0
    public PendingIntent x(int r5, int r6, @i0 Bundle bundle) {
        if (this.d.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        ArrayList<Intent> arrayList = this.d;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return Build.VERSION.SDK_INT >= 16 ? PendingIntent.getActivities(this.e, r5, intentArr, r6, bundle) : PendingIntent.getActivities(this.e, r5, intentArr, r6);
    }

    public void y() {
        A(null);
    }
}

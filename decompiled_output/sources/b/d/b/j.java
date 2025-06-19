package b.d.b;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f873a = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";

    private j() {
    }

    public static void a(@h0 Context context, @h0 c cVar, @h0 Uri uri) {
        if (androidx.core.app.i.a(cVar.f859a.getExtras(), c.d) == null) {
            throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
        }
        cVar.f859a.putExtra(f873a, true);
        cVar.b(context, uri);
    }
}

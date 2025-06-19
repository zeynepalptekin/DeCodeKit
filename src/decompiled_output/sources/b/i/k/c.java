package b.i.k;

import android.content.res.Configuration;
import android.os.Build;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class c {
    private c() {
    }

    @h0
    public static f a(@h0 Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? f.n(configuration.getLocales()) : f.a(configuration.locale);
    }
}

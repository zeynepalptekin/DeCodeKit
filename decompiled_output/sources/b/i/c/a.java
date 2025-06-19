package b.i.c;

import android.content.ContentProvider;
import android.content.Context;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class a {
    private a() {
    }

    @h0
    public static Context a(@h0 ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}

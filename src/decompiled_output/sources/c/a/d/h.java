package c.a.d;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.r;

/* loaded from: classes.dex */
public class h extends Exception {
    @Deprecated
    protected h() {
    }

    public h(@RecentlyNonNull String str) {
        super(r.h(str, "Detail message must not be empty"));
    }

    public h(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
        super(r.h(str, "Detail message must not be empty"), th);
    }
}

package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public abstract class e {
    @h0
    @Deprecated
    public Fragment a(@h0 Context context, @h0 String str, @i0 Bundle bundle) {
        return Fragment.e0(context, str, bundle);
    }

    @i0
    public abstract View c(@androidx.annotation.w int r1);

    public abstract boolean f();
}

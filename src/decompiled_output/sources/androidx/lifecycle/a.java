package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class a extends u {

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private Application f501c;

    public a(@h0 Application application) {
        this.f501c = application;
    }

    @h0
    public <T extends Application> T f() {
        return (T) this.f501c;
    }
}

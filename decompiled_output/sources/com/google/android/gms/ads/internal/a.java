package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.im;
import com.google.android.gms.internal.ads.ki;
import com.google.android.gms.internal.ads.to;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2400a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2401b;

    /* renamed from: c, reason: collision with root package name */
    private im f2402c;
    private ki d;

    public a(Context context, im imVar, ki kiVar) {
        this.f2400a = context;
        this.f2402c = imVar;
        this.d = null;
        if (0 == 0) {
            this.d = new ki();
        }
    }

    private final boolean c() {
        im imVar = this.f2402c;
        return (imVar != null && imVar.c().i) || this.d.d;
    }

    public final void a() {
        this.f2401b = true;
    }

    public final void b(@i0 String str) {
        List<String> list;
        if (c()) {
            if (str == null) {
                str = "";
            }
            im imVar = this.f2402c;
            if (imVar != null) {
                imVar.e(str, null, 3);
                return;
            }
            ki kiVar = this.d;
            if (!kiVar.d || (list = kiVar.e) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    p.c();
                    to.G(this.f2400a, "", strReplace);
                }
            }
        }
    }

    public final boolean d() {
        return !c() || this.f2401b;
    }
}

package androidx.browser.browseractions;

import android.app.PendingIntent;
import androidx.annotation.h0;
import androidx.annotation.q;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f219a;

    /* renamed from: b, reason: collision with root package name */
    private final PendingIntent f220b;

    /* renamed from: c, reason: collision with root package name */
    @q
    private final int f221c;

    public a(@h0 String str, @h0 PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }

    public a(@h0 String str, @h0 PendingIntent pendingIntent, @q int r3) {
        this.f219a = str;
        this.f220b = pendingIntent;
        this.f221c = r3;
    }

    public PendingIntent a() {
        return this.f220b;
    }

    public int b() {
        return this.f221c;
    }

    public String c() {
        return this.f219a;
    }
}

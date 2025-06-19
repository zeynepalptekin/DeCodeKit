package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class RemoteActionCompat implements androidx.versionedparcelable.h {

    /* renamed from: a, reason: collision with root package name */
    @p0({p0.a.LIBRARY_GROUP})
    public IconCompat f255a;

    /* renamed from: b, reason: collision with root package name */
    @p0({p0.a.LIBRARY_GROUP})
    public CharSequence f256b;

    /* renamed from: c, reason: collision with root package name */
    @p0({p0.a.LIBRARY_GROUP})
    public CharSequence f257c;

    @p0({p0.a.LIBRARY_GROUP})
    public PendingIntent d;

    @p0({p0.a.LIBRARY_GROUP})
    public boolean e;

    @p0({p0.a.LIBRARY_GROUP})
    public boolean f;

    @p0({p0.a.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@h0 RemoteActionCompat remoteActionCompat) {
        b.i.o.i.f(remoteActionCompat);
        this.f255a = remoteActionCompat.f255a;
        this.f256b = remoteActionCompat.f256b;
        this.f257c = remoteActionCompat.f257c;
        this.d = remoteActionCompat.d;
        this.e = remoteActionCompat.e;
        this.f = remoteActionCompat.f;
    }

    public RemoteActionCompat(@h0 IconCompat iconCompat, @h0 CharSequence charSequence, @h0 CharSequence charSequence2, @h0 PendingIntent pendingIntent) {
        this.f255a = (IconCompat) b.i.o.i.f(iconCompat);
        this.f256b = (CharSequence) b.i.o.i.f(charSequence);
        this.f257c = (CharSequence) b.i.o.i.f(charSequence2);
        this.d = (PendingIntent) b.i.o.i.f(pendingIntent);
        this.e = true;
        this.f = true;
    }

    @m0(26)
    @h0
    public static RemoteActionCompat a(@h0 RemoteAction remoteAction) {
        b.i.o.i.f(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.g(remoteAction.getIcon()), remoteAction.getTitle(), remoteAction.getContentDescription(), remoteAction.getActionIntent());
        remoteActionCompat.g(remoteAction.isEnabled());
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.h(remoteAction.shouldShowIcon());
        }
        return remoteActionCompat;
    }

    @h0
    public PendingIntent b() {
        return this.d;
    }

    @h0
    public CharSequence c() {
        return this.f257c;
    }

    @h0
    public IconCompat d() {
        return this.f255a;
    }

    @h0
    public CharSequence e() {
        return this.f256b;
    }

    public boolean f() {
        return this.e;
    }

    public void g(boolean z) {
        this.e = z;
    }

    public void h(boolean z) {
        this.f = z;
    }

    public boolean i() {
        return this.f;
    }

    @m0(26)
    @h0
    public RemoteAction j() {
        RemoteAction remoteAction = new RemoteAction(this.f255a.J(), this.f256b, this.f257c, this.d);
        remoteAction.setEnabled(f());
        if (Build.VERSION.SDK_INT >= 28) {
            remoteAction.setShouldShowIcon(i());
        }
        return remoteAction;
    }
}

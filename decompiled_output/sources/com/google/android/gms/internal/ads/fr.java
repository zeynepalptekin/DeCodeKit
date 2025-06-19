package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class fr {
    private boolean d;
    private Context e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3444c = false;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private final Map<BroadcastReceiver, IntentFilter> f3443b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    private final BroadcastReceiver f3442a = new ir(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void e(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.f3443b.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        int r2 = 0;
        while (r2 < size) {
            Object obj = arrayList.get(r2);
            r2++;
            ((BroadcastReceiver) obj).onReceive(context, intent);
        }
    }

    public final synchronized void a(Context context) {
        if (this.f3444c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        if (applicationContext == null) {
            this.e = context;
        }
        e0.a(this.e);
        this.d = ((Boolean) qx2.e().c(e0.n2)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.e.registerReceiver(this.f3442a, intentFilter);
        this.f3444c = true;
    }

    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.d) {
            this.f3443b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.d) {
            this.f3443b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}

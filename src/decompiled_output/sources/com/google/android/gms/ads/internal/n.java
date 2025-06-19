package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.i52;
import com.google.android.gms.internal.ads.tr;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class n extends AsyncTask<Void, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ j f2410a;

    private n(j jVar) {
        this.f2410a = jVar;
    }

    /* synthetic */ n(j jVar, m mVar) {
        this(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            this.f2410a.l = (i52) this.f2410a.g.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            tr.d("", e);
        }
        return this.f2410a.M8();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        if (this.f2410a.j == null || str2 == null) {
            return;
        }
        this.f2410a.j.loadUrl(str2);
    }
}

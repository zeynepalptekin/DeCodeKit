package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class l0 {

    @com.google.android.gms.common.util.d0
    private String d;

    @com.google.android.gms.common.util.d0
    private Context e;

    @com.google.android.gms.common.util.d0
    private String f;
    private AtomicBoolean h;
    private File i;

    /* renamed from: a, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private BlockingQueue<v0> f4167a = new ArrayBlockingQueue(100);

    /* renamed from: b, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private LinkedHashMap<String, String> f4168b = new LinkedHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private Map<String, p0> f4169c = new HashMap();
    private final HashSet<String> g = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    private final void c(Map<String, String> map, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        Uri.Builder builderBuildUpon = Uri.parse(this.d).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        StringBuilder sb = new StringBuilder(builderBuildUpon.build().toString());
        if (!TextUtils.isEmpty(str)) {
            sb.append("&it=");
            sb.append(str);
        }
        String string = sb.toString();
        if (!this.h.get()) {
            com.google.android.gms.ads.internal.p.c();
            to.G(this.e, this.f, string);
            return;
        }
        File file = this.i;
        if (file == null) {
            tr.i("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(string.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                tr.d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            tr.d("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    tr.d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    tr.d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                }
            }
            throw th;
        }
    }

    final Map<String, String> a(Map<String, String> map, @androidx.annotation.i0 Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            linkedHashMap.put(key, e(key).a((String) linkedHashMap.get(key), value));
        }
        return linkedHashMap;
    }

    public final void b(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.e = context;
        this.f = str;
        this.d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.h = atomicBoolean;
        atomicBoolean.set(w1.f5766c.a().booleanValue());
        if (this.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f4168b.put(entry.getKey(), entry.getValue());
        }
        cs.f3023a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.k0
            private final l0 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.d.g();
            }
        });
        this.f4169c.put("action", p0.f4762b);
        this.f4169c.put(FirebaseAnalytics.b.f6877b, p0.f4762b);
        this.f4169c.put("e", p0.f4763c);
    }

    public final boolean d(v0 v0Var) {
        return this.f4167a.offer(v0Var);
    }

    public final p0 e(String str) {
        p0 p0Var = this.f4169c.get(str);
        return p0Var != null ? p0Var : p0.f4761a;
    }

    public final void f(String str) throws Throwable {
        if (this.g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f);
        linkedHashMap.put("ue", str);
        c(a(this.f4168b, linkedHashMap), "");
    }

    final /* synthetic */ void g() throws Throwable {
        while (true) {
            try {
                v0 v0VarTake = this.f4167a.take();
                String strE = v0VarTake.e();
                if (!TextUtils.isEmpty(strE)) {
                    c(a(this.f4168b, v0VarTake.f()), strE);
                }
            } catch (InterruptedException e) {
                tr.d("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }
}

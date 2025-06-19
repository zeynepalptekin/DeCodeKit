package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class xr implements or {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    private final String f6027a;

    public xr() {
        this(null);
    }

    public xr(@androidx.annotation.i0 String str) {
        this.f6027a = str;
    }

    @Override // com.google.android.gms.internal.ads.or
    @androidx.annotation.y0
    public final void a(String str) {
        try {
            try {
                if (com.google.android.gms.common.util.e.b()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                String strValueOf = String.valueOf(str);
                tr.f(strValueOf.length() != 0 ? "Pinging URL: ".concat(strValueOf) : new String("Pinging URL: "));
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    qx2.a();
                    jr.i(true, httpURLConnection, this.f6027a);
                    nr nrVar = new nr();
                    nrVar.i(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    nrVar.h(httpURLConnection, responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                        sb.append("Received non-success response code ");
                        sb.append(responseCode);
                        sb.append(" from pinging URL: ");
                        sb.append(str);
                        tr.i(sb.toString());
                    }
                    if (com.google.android.gms.common.util.e.b()) {
                        TrafficStats.clearThreadStatsTag();
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
                sb2.append("Error while pinging URL: ");
                sb2.append(str);
                sb2.append(". ");
                sb2.append(message);
                tr.i(sb2.toString());
                if (com.google.android.gms.common.util.e.b()) {
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
                sb3.append("Error while parsing ping URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
                tr.i(sb3.toString());
                if (com.google.android.gms.common.util.e.b()) {
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (RuntimeException e3) {
                String message3 = e3.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb4.append("Error while pinging URL: ");
                sb4.append(str);
                sb4.append(". ");
                sb4.append(message3);
                tr.i(sb4.toString());
                if (com.google.android.gms.common.util.e.b()) {
                    TrafficStats.clearThreadStatsTag();
                }
            }
        } catch (Throwable th) {
            if (com.google.android.gms.common.util.e.b()) {
                TrafficStats.clearThreadStatsTag();
            }
            throw th;
        }
    }
}

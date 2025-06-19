package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;

/* loaded from: classes.dex */
public final class r01 extends jg {
    private final Context e;
    private final xr f;
    private final i01 g;

    public r01(Context context, i01 i01Var, xr xrVar) {
        this.e = context;
        this.f = xrVar;
        this.g = i01Var;
    }

    @Override // com.google.android.gms.internal.ads.gg
    public final void U5(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            com.google.android.gms.ads.internal.p.c();
            boolean zM = to.M(this.e);
            int r4 = j01.e;
            if (stringExtra.equals("offline_notification_clicked")) {
                if (zM) {
                    r4 = j01.d;
                }
                Context context = this.e;
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setData(Uri.parse(stringExtra3));
                }
                launchIntentForPackage.addFlags(268435456);
                context.startActivity(launchIntentForPackage);
            }
            try {
                SQLiteDatabase writableDatabase = this.g.getWritableDatabase();
                if (r4 == j01.d) {
                    this.g.a(writableDatabase, this.f, stringExtra2);
                } else {
                    writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                }
            } catch (SQLiteException e) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 51);
                sb.append("Failed to get writable offline buffering database: ");
                sb.append(strValueOf);
                tr.g(sb.toString());
            }
        }
    }
}

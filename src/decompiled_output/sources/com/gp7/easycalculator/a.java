package com.gp7.easycalculator;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7042a = 2;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7043b = 10;

    /* renamed from: com.gp7.easycalculator.a$a, reason: collision with other inner class name */
    static class ViewOnClickListenerC0212a implements View.OnClickListener {
        final /* synthetic */ Context d;
        final /* synthetic */ SharedPreferences.Editor e;
        final /* synthetic */ Dialog f;
        final /* synthetic */ MenuItem g;

        ViewOnClickListenerC0212a(Context context, SharedPreferences.Editor editor, Dialog dialog, MenuItem menuItem) {
            this.d = context;
            this.e = editor;
            this.f = dialog;
            this.g = menuItem;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + com.gp7.easycalculator.b.f7045b)));
            this.e.putBoolean("dontshowagain", true);
            this.e.commit();
            this.f.dismiss();
            this.g.setVisible(false);
        }
    }

    static class b implements View.OnClickListener {
        final /* synthetic */ SharedPreferences.Editor d;
        final /* synthetic */ MenuItem e;
        final /* synthetic */ Dialog f;

        b(SharedPreferences.Editor editor, MenuItem menuItem, Dialog dialog) {
            this.d = editor;
            this.e = menuItem;
            this.f = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.d.putLong("launch_count", 0L);
            this.d.putLong("date_firstlaunch", Long.valueOf(System.currentTimeMillis()).longValue());
            this.d.commit();
            this.e.setVisible(false);
            this.f.dismiss();
        }
    }

    static class c implements View.OnClickListener {
        final /* synthetic */ SharedPreferences.Editor d;
        final /* synthetic */ Dialog e;
        final /* synthetic */ MenuItem f;

        c(SharedPreferences.Editor editor, Dialog dialog, MenuItem menuItem) {
            this.d = editor;
            this.e = dialog;
            this.f = menuItem;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor = this.d;
            if (editor != null) {
                editor.putBoolean("dontshowagain", true);
                this.d.commit();
            }
            this.e.dismiss();
            this.f.setVisible(false);
        }
    }

    a() {
    }

    static void a(Context context, MenuItem menuItem) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("apprater", 0);
        if (sharedPreferences.getBoolean("dontshowagain", false)) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        long j = sharedPreferences.getLong("launch_count", 0L) + 1;
        editorEdit.putLong("launch_count", j);
        Long lValueOf = Long.valueOf(sharedPreferences.getLong("date_firstlaunch", 0L));
        if (lValueOf.longValue() == 0) {
            lValueOf = Long.valueOf(System.currentTimeMillis());
            editorEdit.putLong("date_firstlaunch", lValueOf.longValue());
        }
        if (j >= 10 && System.currentTimeMillis() >= lValueOf.longValue() + 172800000) {
            menuItem.setVisible(true);
        }
        editorEdit.apply();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r16, android.content.SharedPreferences.Editor r17, android.view.MenuItem r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.a.b(android.content.Context, android.content.SharedPreferences$Editor, android.view.MenuItem, java.lang.String):void");
    }
}

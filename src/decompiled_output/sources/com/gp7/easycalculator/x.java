package com.gp7.easycalculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MenuItem;
import java.util.Random;

/* loaded from: classes.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    String f7063a;

    x() {
    }

    static void a(Context context, MenuItem menuItem) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getString(R.string.pref_file), 0);
        Long lValueOf = Long.valueOf(sharedPreferences.getLong("data_gift_rifiutato", 0L));
        Long lValueOf2 = Long.valueOf(sharedPreferences.getLong("data_gift_vinto", 0L));
        int r4 = new Random().nextInt(101);
        if (lValueOf2.longValue() == 0) {
            if (r4 >= 102) {
                menuItem.setVisible(true);
            } else {
                menuItem.setVisible(false);
            }
        }
        if (System.currentTimeMillis() < lValueOf.longValue() + 4.32E7d || ((System.currentTimeMillis() <= lValueOf2.longValue() + 1.296E8d && lValueOf2.longValue() != 0) || r4 < 102)) {
            menuItem.setVisible(false);
        } else {
            menuItem.setVisible(true);
        }
    }

    String b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getString(R.string.pref_file), 0);
        Long lValueOf = Long.valueOf(sharedPreferences.getLong("data_gift_rifiutato", 0L));
        Long lValueOf2 = Long.valueOf(sharedPreferences.getLong("data_gift_vinto", 0L));
        if (lValueOf2.longValue() == 0) {
            this.f7063a = "si";
        }
        if (System.currentTimeMillis() < lValueOf.longValue() + 4.32E7d || (System.currentTimeMillis() <= lValueOf2.longValue() + 1.296E8d && lValueOf2.longValue() != 0)) {
            this.f7063a = "no";
        } else {
            this.f7063a = "si";
        }
        return this.f7063a;
    }
}

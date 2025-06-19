package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;

@d0
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class u {
    private u() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static long a(@RecentlyNonNull String str) throws NumberFormatException {
        if (str.length() <= 16) {
            if (str.length() != 16) {
                return Long.parseLong(str, 16);
            }
            return (Long.parseLong(str.substring(0, 8), 16) << 32) | Long.parseLong(str.substring(8), 16);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37);
        sb.append("Invalid input: ");
        sb.append(str);
        sb.append(" exceeds 16 characters");
        throw new NumberFormatException(sb.toString());
    }
}

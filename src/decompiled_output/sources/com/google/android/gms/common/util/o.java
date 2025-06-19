package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class o {
    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static String a(@RecentlyNonNull byte[] bArr, @RecentlyNonNull int r12, @RecentlyNonNull int r13, @RecentlyNonNull boolean z) {
        if (bArr == null || bArr.length == 0 || r12 < 0 || r13 <= 0 || r12 + r13 > bArr.length) {
            return null;
        }
        StringBuilder sb = new StringBuilder((z ? 75 : 57) * (((r13 + 16) - 1) / 16));
        int r4 = r13;
        int r5 = 0;
        int r6 = 0;
        while (r4 > 0) {
            if (r5 == 0) {
                sb.append(r13 < 65536 ? String.format("%04X:", Integer.valueOf(r12)) : String.format("%08X:", Integer.valueOf(r12)));
                r6 = r12;
            } else if (r5 == 8) {
                sb.append(" -");
            }
            sb.append(String.format(" %02X", Integer.valueOf(bArr[r12] & 255)));
            r4--;
            r5++;
            if (z && (r5 == 16 || r4 == 0)) {
                int r8 = 16 - r5;
                if (r8 > 0) {
                    for (int r9 = 0; r9 < r8; r9++) {
                        sb.append("   ");
                    }
                }
                if (r8 >= 8) {
                    sb.append("  ");
                }
                sb.append("  ");
                for (int r7 = 0; r7 < r5; r7++) {
                    char c2 = (char) bArr[r6 + r7];
                    if (c2 < ' ' || c2 > '~') {
                        c2 = '.';
                    }
                    sb.append(c2);
                }
            }
            if (r5 == 16 || r4 == 0) {
                sb.append('\n');
                r5 = 0;
            }
            r12++;
        }
        return sb.toString();
    }
}

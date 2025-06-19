package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class t {
    private t() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static int a(@RecentlyNonNull byte[] bArr, @RecentlyNonNull int r6, @RecentlyNonNull int r7, @RecentlyNonNull int r8) {
        int r0 = (r7 & (-4)) + r6;
        while (r6 < r0) {
            int r3 = ((bArr[r6] & 255) | ((bArr[r6 + 1] & 255) << 8) | ((bArr[r6 + 2] & 255) << 16) | (bArr[r6 + 3] << 24)) * (-862048943);
            int r82 = r8 ^ (((r3 << 15) | (r3 >>> 17)) * 461845907);
            r8 = (((r82 >>> 19) | (r82 << 13)) * 5) - 430675100;
            r6 += 4;
        }
        int r32 = r7 & 3;
        if (r32 == 1) {
            int r5 = ((bArr[r0] & 255) | ı) * (-862048943);
            r8 ^= ((r5 >>> 17) | (r5 << 15)) * 461845907;
        } else {
            if (r32 != 2) {
                ı = r32 == 3 ? (bArr[r0 + 2] & 255) << 16 : 0;
            }
            ı |= (bArr[r0 + 1] & 255) << 8;
            int r52 = ((bArr[r0] & 255) | ı) * (-862048943);
            r8 ^= ((r52 >>> 17) | (r52 << 15)) * 461845907;
        }
        int r53 = r8 ^ r7;
        int r54 = (r53 ^ (r53 >>> 16)) * (-2048144789);
        int r55 = (r54 ^ (r54 >>> 13)) * (-1028477387);
        return r55 ^ (r55 >>> 16);
    }
}

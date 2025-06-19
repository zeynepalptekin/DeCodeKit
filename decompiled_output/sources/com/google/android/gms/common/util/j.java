package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.io.ByteArrayOutputStream;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class j {
    @com.google.android.gms.common.annotation.a
    public static void a(@RecentlyNonNull String str, @RecentlyNonNull CharArrayBuffer charArrayBuffer) {
        if (TextUtils.isEmpty(str)) {
            charArrayBuffer.sizeCopied = 0;
        } else {
            char[] cArr = charArrayBuffer.data;
            if (cArr == null || cArr.length < str.length()) {
                charArrayBuffer.data = str.toCharArray();
            } else {
                str.getChars(0, str.length(), charArrayBuffer.data, 0);
            }
        }
        charArrayBuffer.sizeCopied = str.length();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static byte[] b(@RecentlyNonNull Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}

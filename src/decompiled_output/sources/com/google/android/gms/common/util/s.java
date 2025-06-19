package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import java.util.HashMap;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class s {
    @com.google.android.gms.common.annotation.a
    public static void a(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull HashMap<String, String> map) {
        sb.append("{");
        boolean z = true;
        for (String str : map.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            String str2 = map.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
        }
        sb.append("}");
    }
}

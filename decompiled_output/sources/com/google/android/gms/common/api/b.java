package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.h0;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    @RecentlyNonNull
    public static final int f2496a = -1;

    /* renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    public static final int f2497b = 0;

    /* renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    @Deprecated
    public static final int f2498c = 2;

    @RecentlyNonNull
    @Deprecated
    public static final int d = 3;

    @RecentlyNonNull
    public static final int e = 4;

    @RecentlyNonNull
    public static final int f = 5;

    @RecentlyNonNull
    public static final int g = 6;

    @RecentlyNonNull
    public static final int h = 7;

    @RecentlyNonNull
    public static final int i = 8;

    @RecentlyNonNull
    public static final int j = 10;

    @RecentlyNonNull
    public static final int k = 13;

    @RecentlyNonNull
    public static final int l = 14;

    @RecentlyNonNull
    public static final int m = 15;

    @RecentlyNonNull
    public static final int n = 16;

    @RecentlyNonNull
    public static final int o = 17;

    @RecentlyNonNull
    public static final int p = 19;

    @RecentlyNonNull
    public static final int q = 20;

    @RecentlyNonNull
    public static final int r = 21;

    @RecentlyNonNull
    public static final int s = 22;

    @com.google.android.gms.common.annotation.a
    protected b() {
    }

    @h0
    public static String a(@RecentlyNonNull int r2) {
        switch (r2) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(r2);
                return sb.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}

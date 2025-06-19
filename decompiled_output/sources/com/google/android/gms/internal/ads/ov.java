package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class ov implements z6<zt> {
    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(zt ztVar, Map map) throws NumberFormatException {
        zt ztVar2 = ztVar;
        mx mxVarN = ztVar2.n();
        if (mxVarN == null) {
            try {
                mx mxVar = new mx(ztVar2, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                ztVar2.l(mxVar);
                mxVarN = mxVar;
            } catch (NullPointerException | NumberFormatException e) {
                tr.c("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.p.g().e(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f2 = Float.parseFloat((String) map.get("currentTime"));
        int r2 = Integer.parseInt((String) map.get("playbackState"));
        int r5 = (r2 < 0 || 3 < r2) ? 0 : r2;
        String str = (String) map.get("aspectRatio");
        float f3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (tr.a(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(f2);
            sb.append(" , duration : ");
            sb.append(f);
            sb.append(" , isMuted : ");
            sb.append(zEquals);
            sb.append(" , playbackState : ");
            sb.append(r5);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            tr.f(sb.toString());
        }
        mxVarN.z8(f2, f, r5, zEquals, f3);
    }
}

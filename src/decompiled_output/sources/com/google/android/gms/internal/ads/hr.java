package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class hr {

    /* renamed from: b, reason: collision with root package name */
    private static List<MediaCodecInfo> f3714b;

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, List<Map<String, Object>>> f3713a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f3715c = new Object();

    @TargetApi(21)
    private static Integer[] a(Range<Integer> range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }

    @TargetApi(16)
    public static List<Map<String, Object>> b(String str) {
        synchronized (f3715c) {
            if (f3713a.containsKey(str)) {
                return f3713a.get(str);
            }
            try {
                synchronized (f3715c) {
                    if (f3714b == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            f3714b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else {
                            int codecCount = MediaCodecList.getCodecCount();
                            f3714b = new ArrayList(codecCount);
                            for (int r5 = 0; r5 < codecCount; r5++) {
                                f3714b.add(MediaCodecList.getCodecInfoAt(r5));
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : f3714b) {
                    if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                        HashMap map = new HashMap();
                        map.put("codecName", mediaCodecInfo.getName());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        map.put("profileLevels", arrayList2);
                        if (Build.VERSION.SDK_INT >= 21) {
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            map.put("bitRatesBps", a(videoCapabilities.getBitrateRange()));
                            map.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            map.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            map.put("frameRates", a(videoCapabilities.getSupportedFrameRates()));
                            map.put("widths", a(videoCapabilities.getSupportedWidths()));
                            map.put("heights", a(videoCapabilities.getSupportedHeights()));
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            map.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(map);
                    }
                }
                f3713a.put(str, arrayList);
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap map2 = new HashMap();
                map2.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map2);
                f3713a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }
}

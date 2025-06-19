package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nonnull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wq {
    public static Point a(MotionEvent motionEvent, @androidx.annotation.i0 View view) {
        int[] r3 = m(view);
        return new Point(((int) motionEvent.getRawX()) - r3[0], ((int) motionEvent.getRawY()) - r3[1]);
    }

    @androidx.annotation.i0
    private static JSONObject b(Context context, Point point, Point point2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", h(context, point2.x));
            jSONObject.put("y", h(context, point2.y));
            jSONObject.put("start_x", h(context, point.x));
            jSONObject.put("start_y", h(context, point.y));
            return jSONObject;
        } catch (JSONException e) {
            tr.c("Error occurred while putting signals into JSON object.", e);
            return null;
        }
    }

    private static JSONObject c(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", h(context, rect.right - rect.left));
        jSONObject.put("height", h(context, rect.bottom - rect.top));
        jSONObject.put("x", h(context, rect.left));
        jSONObject.put("y", h(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:58|23)|32|55|33|(2:35|(1:40))(2:41|(1:43))|44|(1:(1:47)(1:48))(1:49)) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0151, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0152, code lost:
    
        com.google.android.gms.internal.ads.tr.c("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0135 A[Catch: JSONException -> 0x0151, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0151, blocks: (B:33:0x011c, B:47:0x0144, B:48:0x0148, B:49:0x014d, B:38:0x012b, B:41:0x0135), top: B:55:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014d A[Catch: JSONException -> 0x0151, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0151, blocks: (B:33:0x011c, B:47:0x0144, B:48:0x0148, B:49:0x014d, B:38:0x012b, B:41:0x0135), top: B:55:0x011c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject d(android.content.Context r16, @androidx.annotation.i0 android.view.View r17) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wq.d(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject e(Context context, @androidx.annotation.i0 Map<String, WeakReference<View>> map, @androidx.annotation.i0 Map<String, WeakReference<View>> map2, @androidx.annotation.i0 View view) {
        String str;
        String str2;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] r9 = m(view);
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, WeakReference<View>> next = it.next();
                View view2 = next.getValue().get();
                if (view2 != null) {
                    int[] r13 = m(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                    try {
                        jSONObject4.put("width", h(context, view2.getMeasuredWidth()));
                        jSONObject4.put("height", h(context, view2.getMeasuredHeight()));
                        jSONObject4.put("x", h(context, r13[0] - r9[0]));
                        jSONObject4.put("y", h(context, r13[1] - r9[1]));
                        jSONObject4.put(str4, str3);
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = c(context, rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", h(context, r13[0] - r9[0]));
                            jSONObject.put("y", h(context, r13[1] - r9[1]));
                            jSONObject.put(str4, str3);
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            str = str3;
                            str2 = str4;
                            try {
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            } catch (JSONException unused) {
                                tr.i("Unable to get asset views information");
                                it = it2;
                                str3 = str;
                                str4 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        jSONObject3.put("is_clickable", map2 != null && map2.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject2.put(next.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        str = str3;
                        str2 = str4;
                    }
                    it = it2;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject f(@androidx.annotation.i0 String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
        }
        try {
            jSONObject.put("click_point", b(context, point, point2));
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            jSONObject2 = jSONObject;
            tr.c("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static boolean g(km1 km1Var) {
        if (!((Boolean) qx2.e().c(e0.f5)).booleanValue() || !km1Var.I) {
            return false;
        }
        return ((Boolean) qx2.e().c(e0.h5)).booleanValue();
    }

    private static int h(Context context, int r2) {
        return qx2.a().j(context, r2);
    }

    public static JSONObject i(Context context, @androidx.annotation.i0 View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.p.c();
            jSONObject.put("can_show_on_lock_screen", to.j0(view));
            com.google.android.gms.ads.internal.p.c();
            jSONObject.put("is_keyguard_locked", to.D(context));
        } catch (JSONException unused) {
            tr.i("Unable to get lock screen information");
        }
        return jSONObject;
    }

    public static JSONObject j(@Nonnull Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        com.google.android.gms.ads.internal.p.c();
        DisplayMetrics displayMetricsB = to.b((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", h(context, displayMetricsB.widthPixels));
            jSONObject.put("height", h(context, displayMetricsB.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static boolean k(int r2) {
        if (((Boolean) qx2.e().c(e0.U1)).booleanValue()) {
            return ((Boolean) qx2.e().c(e0.V1)).booleanValue() || r2 <= 15299999;
        }
        return true;
    }

    public static JSONObject l(@androidx.annotation.i0 View view) {
        boolean zN0;
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            if (((Boolean) qx2.e().c(e0.e5)).booleanValue()) {
                com.google.android.gms.ads.internal.p.c();
                zN0 = to.n0(view);
            } else {
                com.google.android.gms.ads.internal.p.c();
                zN0 = to.k0(view) != -1;
            }
            jSONObject.put("contained_in_scroll_view", zN0);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static int[] m(@androidx.annotation.i0 View view) {
        int[] r0 = new int[2];
        if (view != null) {
            view.getLocationOnScreen(r0);
        }
        return r0;
    }

    public static WindowManager.LayoutParams n() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) qx2.e().c(e0.g5)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = c.a.b.c.c.a.u;
        return layoutParams;
    }
}

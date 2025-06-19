package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.p0;
import androidx.appcompat.widget.o0;
import b.a.a;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    private static final String f164b = "AppCompatDrawableManag";

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f165c = false;
    private static final PorterDuff.Mode d = PorterDuff.Mode.SRC_IN;
    private static k e;

    /* renamed from: a, reason: collision with root package name */
    private o0 f166a;

    class a implements o0.e {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f167a = {a.f.abc_textfield_search_default_mtrl_alpha, a.f.abc_textfield_default_mtrl_alpha, a.f.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f168b = {a.f.abc_ic_commit_search_api_mtrl_alpha, a.f.abc_seekbar_tick_mark_material, a.f.abc_ic_menu_share_mtrl_alpha, a.f.abc_ic_menu_copy_mtrl_am_alpha, a.f.abc_ic_menu_cut_mtrl_alpha, a.f.abc_ic_menu_selectall_mtrl_alpha, a.f.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f169c = {a.f.abc_textfield_activated_mtrl_alpha, a.f.abc_textfield_search_activated_mtrl_alpha, a.f.abc_cab_background_top_mtrl_alpha, a.f.abc_text_cursor_material, a.f.abc_text_select_handle_left_mtrl_dark, a.f.abc_text_select_handle_middle_mtrl_dark, a.f.abc_text_select_handle_right_mtrl_dark, a.f.abc_text_select_handle_left_mtrl_light, a.f.abc_text_select_handle_middle_mtrl_light, a.f.abc_text_select_handle_right_mtrl_light};
        private final int[] d = {a.f.abc_popup_background_mtrl_mult, a.f.abc_cab_background_internal_bg, a.f.abc_menu_hardkey_panel_mtrl_mult};
        private final int[] e = {a.f.abc_tab_indicator_material, a.f.abc_textfield_search_material};
        private final int[] f = {a.f.abc_btn_check_material, a.f.abc_btn_radio_material, a.f.abc_btn_check_material_anim, a.f.abc_btn_radio_material_anim};

        a() {
        }

        private boolean f(int[] r5, int r6) {
            for (int r0 : r5) {
                if (r0 == r6) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(@androidx.annotation.h0 Context context) {
            return h(context, 0);
        }

        private ColorStateList h(@androidx.annotation.h0 Context context, @androidx.annotation.k int r7) {
            int r2 = v0.d(context, a.b.colorControlHighlight);
            return new ColorStateList(new int[][]{v0.f200c, v0.f, v0.d, v0.j}, new int[]{v0.c(context, a.b.colorButtonNormal), b.i.e.e.t(r2, r7), b.i.e.e.t(r2, r7), r7});
        }

        private ColorStateList i(@androidx.annotation.h0 Context context) {
            return h(context, v0.d(context, a.b.colorAccent));
        }

        private ColorStateList j(@androidx.annotation.h0 Context context) {
            return h(context, v0.d(context, a.b.colorButtonNormal));
        }

        private ColorStateList k(Context context) {
            int[][] r1 = new int[3][];
            int[] r0 = new int[3];
            ColorStateList colorStateListF = v0.f(context, a.b.colorSwitchThumbNormal);
            if (colorStateListF == null || !colorStateListF.isStateful()) {
                r1[0] = v0.f200c;
                r0[0] = v0.c(context, a.b.colorSwitchThumbNormal);
                r1[1] = v0.g;
                r0[1] = v0.d(context, a.b.colorControlActivated);
                r1[2] = v0.j;
                r0[2] = v0.d(context, a.b.colorSwitchThumbNormal);
            } else {
                r1[0] = v0.f200c;
                r0[0] = colorStateListF.getColorForState(r1[0], 0);
                r1[1] = v0.g;
                r0[1] = v0.d(context, a.b.colorControlActivated);
                r1[2] = v0.j;
                r0[2] = colorStateListF.getDefaultColor();
            }
            return new ColorStateList(r1, r0);
        }

        private void l(Drawable drawable, int r3, PorterDuff.Mode mode) {
            if (f0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = k.d;
            }
            drawable.setColorFilter(k.e(r3, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.o0.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(@androidx.annotation.h0 android.content.Context r7, int r8, @androidx.annotation.h0 android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.k.a()
                int[] r1 = r6.f167a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = b.a.a.b.colorControlNormal
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f169c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = b.a.a.b.colorControlActivated
                goto L14
            L22:
                int[] r1 = r6.d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = b.a.a.f.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = b.a.a.f.abc_dialog_material_background
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.f0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.v0.d(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.k.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.o0.e
        public PorterDuff.Mode b(int r2) {
            if (r2 == a.f.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.o0.e
        public Drawable c(@androidx.annotation.h0 o0 o0Var, @androidx.annotation.h0 Context context, int r6) {
            if (r6 == a.f.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{o0Var.j(context, a.f.abc_cab_background_internal_bg), o0Var.j(context, a.f.abc_cab_background_top_mtrl_alpha)});
            }
            return null;
        }

        @Override // androidx.appcompat.widget.o0.e
        public ColorStateList d(@androidx.annotation.h0 Context context, int r3) {
            if (r3 == a.f.abc_edit_text_material) {
                return b.a.b.a.a.c(context, a.d.abc_tint_edittext);
            }
            if (r3 == a.f.abc_switch_track_mtrl_alpha) {
                return b.a.b.a.a.c(context, a.d.abc_tint_switch_track);
            }
            if (r3 == a.f.abc_switch_thumb_material) {
                return k(context);
            }
            if (r3 == a.f.abc_btn_default_mtrl_shape) {
                return j(context);
            }
            if (r3 == a.f.abc_btn_borderless_material) {
                return g(context);
            }
            if (r3 == a.f.abc_btn_colored_material) {
                return i(context);
            }
            if (r3 == a.f.abc_spinner_mtrl_am_alpha || r3 == a.f.abc_spinner_textfield_background_material) {
                return b.a.b.a.a.c(context, a.d.abc_tint_spinner);
            }
            if (f(this.f168b, r3)) {
                return v0.f(context, a.b.colorControlNormal);
            }
            if (f(this.e, r3)) {
                return b.a.b.a.a.c(context, a.d.abc_tint_default);
            }
            if (f(this.f, r3)) {
                return b.a.b.a.a.c(context, a.d.abc_tint_btn_checkable);
            }
            if (r3 == a.f.abc_seekbar_thumb_material) {
                return b.a.b.a.a.c(context, a.d.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.o0.e
        public boolean e(@androidx.annotation.h0 Context context, int r7, @androidx.annotation.h0 Drawable drawable) {
            LayerDrawable layerDrawable;
            Drawable drawableFindDrawableByLayerId;
            int r0;
            if (r7 == a.f.abc_seekbar_track_material) {
                layerDrawable = (LayerDrawable) drawable;
                l(layerDrawable.findDrawableByLayerId(R.id.background), v0.d(context, a.b.colorControlNormal), k.d);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                r0 = a.b.colorControlNormal;
            } else {
                if (r7 != a.f.abc_ratingbar_material && r7 != a.f.abc_ratingbar_indicator_material && r7 != a.f.abc_ratingbar_small_material) {
                    return false;
                }
                layerDrawable = (LayerDrawable) drawable;
                l(layerDrawable.findDrawableByLayerId(R.id.background), v0.c(context, a.b.colorControlNormal), k.d);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                r0 = a.b.colorControlActivated;
            }
            l(drawableFindDrawableByLayerId, v0.d(context, r0), k.d);
            l(layerDrawable.findDrawableByLayerId(R.id.progress), v0.d(context, a.b.colorControlActivated), k.d);
            return true;
        }
    }

    public static synchronized k b() {
        if (e == null) {
            i();
        }
        return e;
    }

    public static synchronized PorterDuffColorFilter e(int r1, PorterDuff.Mode mode) {
        return o0.l(r1, mode);
    }

    public static synchronized void i() {
        if (e == null) {
            k kVar = new k();
            e = kVar;
            kVar.f166a = o0.h();
            e.f166a.u(new a());
        }
    }

    static void j(Drawable drawable, y0 y0Var, int[] r2) {
        o0.w(drawable, y0Var, r2);
    }

    public synchronized Drawable c(@androidx.annotation.h0 Context context, @androidx.annotation.q int r3) {
        return this.f166a.j(context, r3);
    }

    synchronized Drawable d(@androidx.annotation.h0 Context context, @androidx.annotation.q int r3, boolean z) {
        return this.f166a.k(context, r3, z);
    }

    synchronized ColorStateList f(@androidx.annotation.h0 Context context, @androidx.annotation.q int r3) {
        return this.f166a.m(context, r3);
    }

    public synchronized void g(@androidx.annotation.h0 Context context) {
        this.f166a.s(context);
    }

    synchronized Drawable h(@androidx.annotation.h0 Context context, @androidx.annotation.h0 f1 f1Var, @androidx.annotation.q int r4) {
        return this.f166a.t(context, f1Var, r4);
    }

    boolean k(@androidx.annotation.h0 Context context, @androidx.annotation.q int r3, @androidx.annotation.h0 Drawable drawable) {
        return this.f166a.x(context, r3, drawable);
    }
}

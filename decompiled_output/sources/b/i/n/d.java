package b.i.n;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.annotation.z;
import androidx.appcompat.widget.ActivityChooserView;
import b.i.k.o;
import b.i.o.i;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class d implements Spannable {
    private static final char h = '\n';
    private static final Object i = new Object();

    @u("sLock")
    @h0
    private static Executor j;

    @h0
    private final Spannable d;

    @h0
    private final a e;

    @h0
    private final int[] f;

    @i0
    private final PrecomputedText g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @h0
        private final TextPaint f1114a;

        /* renamed from: b, reason: collision with root package name */
        @i0
        private final TextDirectionHeuristic f1115b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1116c;
        private final int d;
        final PrecomputedText.Params e;

        /* renamed from: b.i.n.d$a$a, reason: collision with other inner class name */
        public static class C0066a {

            /* renamed from: a, reason: collision with root package name */
            @h0
            private final TextPaint f1117a;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f1118b;

            /* renamed from: c, reason: collision with root package name */
            private int f1119c;
            private int d;

            public C0066a(@h0 TextPaint textPaint) {
                this.f1117a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f1119c = 1;
                    this.d = 1;
                } else {
                    this.d = 0;
                    this.f1119c = 0;
                }
                this.f1118b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            @h0
            public a a() {
                return new a(this.f1117a, this.f1118b, this.f1119c, this.d);
            }

            @m0(23)
            public C0066a b(int r1) {
                this.f1119c = r1;
                return this;
            }

            @m0(23)
            public C0066a c(int r1) {
                this.d = r1;
                return this;
            }

            @m0(18)
            public C0066a d(@h0 TextDirectionHeuristic textDirectionHeuristic) {
                this.f1118b = textDirectionHeuristic;
                return this;
            }
        }

        @m0(28)
        public a(@h0 PrecomputedText.Params params) {
            this.f1114a = params.getTextPaint();
            this.f1115b = params.getTextDirection();
            this.f1116c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
            this.e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        @SuppressLint({"NewApi"})
        a(@h0 TextPaint textPaint, @h0 TextDirectionHeuristic textDirectionHeuristic, int r5, int r6) {
            this.e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(r5).setHyphenationFrequency(r6).setTextDirection(textDirectionHeuristic).build() : null;
            this.f1114a = textPaint;
            this.f1115b = textDirectionHeuristic;
            this.f1116c = r5;
            this.d = r6;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public boolean a(@h0 a aVar) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.f1116c != aVar.b() || this.d != aVar.c())) || this.f1114a.getTextSize() != aVar.e().getTextSize() || this.f1114a.getTextScaleX() != aVar.e().getTextScaleX() || this.f1114a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f1114a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f1114a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.f1114a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            int r0 = Build.VERSION.SDK_INT;
            if (r0 >= 24) {
                if (!this.f1114a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (r0 >= 17 && !this.f1114a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f1114a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f1114a.getTypeface().equals(aVar.e().getTypeface());
        }

        @m0(23)
        public int b() {
            return this.f1116c;
        }

        @m0(23)
        public int c() {
            return this.d;
        }

        @i0
        @m0(18)
        public TextDirectionHeuristic d() {
            return this.f1115b;
        }

        @h0
        public TextPaint e() {
            return this.f1114a;
        }

        public boolean equals(@i0 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar)) {
                return Build.VERSION.SDK_INT < 18 || this.f1115b == aVar.d();
            }
            return false;
        }

        public int hashCode() {
            int r0 = Build.VERSION.SDK_INT;
            if (r0 >= 24) {
                return b.i.o.e.b(Float.valueOf(this.f1114a.getTextSize()), Float.valueOf(this.f1114a.getTextScaleX()), Float.valueOf(this.f1114a.getTextSkewX()), Float.valueOf(this.f1114a.getLetterSpacing()), Integer.valueOf(this.f1114a.getFlags()), this.f1114a.getTextLocales(), this.f1114a.getTypeface(), Boolean.valueOf(this.f1114a.isElegantTextHeight()), this.f1115b, Integer.valueOf(this.f1116c), Integer.valueOf(this.d));
            }
            if (r0 >= 21) {
                return b.i.o.e.b(Float.valueOf(this.f1114a.getTextSize()), Float.valueOf(this.f1114a.getTextScaleX()), Float.valueOf(this.f1114a.getTextSkewX()), Float.valueOf(this.f1114a.getLetterSpacing()), Integer.valueOf(this.f1114a.getFlags()), this.f1114a.getTextLocale(), this.f1114a.getTypeface(), Boolean.valueOf(this.f1114a.isElegantTextHeight()), this.f1115b, Integer.valueOf(this.f1116c), Integer.valueOf(this.d));
            }
            if (r0 < 18 && r0 < 17) {
                return b.i.o.e.b(Float.valueOf(this.f1114a.getTextSize()), Float.valueOf(this.f1114a.getTextScaleX()), Float.valueOf(this.f1114a.getTextSkewX()), Integer.valueOf(this.f1114a.getFlags()), this.f1114a.getTypeface(), this.f1115b, Integer.valueOf(this.f1116c), Integer.valueOf(this.d));
            }
            return b.i.o.e.b(Float.valueOf(this.f1114a.getTextSize()), Float.valueOf(this.f1114a.getTextScaleX()), Float.valueOf(this.f1114a.getTextSkewX()), Integer.valueOf(this.f1114a.getFlags()), this.f1114a.getTextLocale(), this.f1114a.getTypeface(), this.f1115b, Integer.valueOf(this.f1116c), Integer.valueOf(this.d));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b.i.n.d.a.toString():java.lang.String");
        }
    }

    private static class b extends FutureTask<d> {

        private static class a implements Callable<d> {

            /* renamed from: a, reason: collision with root package name */
            private a f1120a;

            /* renamed from: b, reason: collision with root package name */
            private CharSequence f1121b;

            a(@h0 a aVar, @h0 CharSequence charSequence) {
                this.f1120a = aVar;
                this.f1121b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d call() throws Exception {
                return d.a(this.f1121b, this.f1120a);
            }
        }

        b(@h0 a aVar, @h0 CharSequence charSequence) {
            super(new a(aVar, charSequence));
        }
    }

    @m0(28)
    private d(@h0 PrecomputedText precomputedText, @h0 a aVar) {
        this.d = precomputedText;
        this.e = aVar;
        this.f = null;
        this.g = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    private d(@h0 CharSequence charSequence, @h0 a aVar, @h0 int[] r4) {
        this.d = new SpannableString(charSequence);
        this.e = aVar;
        this.f = r4;
        this.g = null;
    }

    @SuppressLint({"NewApi"})
    public static d a(@h0 CharSequence charSequence, @h0 a aVar) {
        i.f(charSequence);
        i.f(aVar);
        try {
            o.b("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && aVar.e != null) {
                return new d(PrecomputedText.create(charSequence, aVar.e), aVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int r3 = 0;
            while (r3 < length) {
                int r32 = TextUtils.indexOf(charSequence, h, r3, length);
                r3 = r32 < 0 ? length : r32 + 1;
                arrayList.add(Integer.valueOf(r3));
            }
            int[] r1 = new int[arrayList.size()];
            for (int r33 = 0; r33 < arrayList.size(); r33++) {
                r1[r33] = ((Integer) arrayList.get(r33)).intValue();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), aVar.e(), ActivityChooserView.f.j).setBreakStrategy(aVar.b()).setHyphenationFrequency(aVar.c()).setTextDirection(aVar.d()).build();
            } else if (Build.VERSION.SDK_INT >= 21) {
                new StaticLayout(charSequence, aVar.e(), ActivityChooserView.f.j, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return new d(charSequence, aVar, r1);
        } finally {
            o.d();
        }
    }

    @w0
    public static Future<d> g(@h0 CharSequence charSequence, @h0 a aVar, @i0 Executor executor) {
        b bVar = new b(aVar, charSequence);
        if (executor == null) {
            synchronized (i) {
                if (j == null) {
                    j = Executors.newFixedThreadPool(1);
                }
                executor = j;
            }
        }
        executor.execute(bVar);
        return bVar;
    }

    @z(from = FabTransformationScrimBehavior.j)
    @SuppressLint({"NewApi"})
    public int b() {
        return Build.VERSION.SDK_INT >= 29 ? this.g.getParagraphCount() : this.f.length;
    }

    @z(from = FabTransformationScrimBehavior.j)
    @SuppressLint({"NewApi"})
    public int c(@z(from = FabTransformationScrimBehavior.j) int r4) {
        i.c(r4, 0, b(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.g.getParagraphEnd(r4) : this.f[r4];
    }

    @Override // java.lang.CharSequence
    public char charAt(int r2) {
        return this.d.charAt(r2);
    }

    @z(from = FabTransformationScrimBehavior.j)
    @SuppressLint({"NewApi"})
    public int d(@z(from = FabTransformationScrimBehavior.j) int r4) {
        i.c(r4, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.g.getParagraphStart(r4);
        }
        if (r4 == 0) {
            return 0;
        }
        return this.f[r4 - 1];
    }

    @h0
    public a e() {
        return this.e;
    }

    @i0
    @m0(28)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public PrecomputedText f() {
        Spannable spannable = this.d;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.d.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.d.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.d.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int r3, int r4, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.g.getSpans(r3, r4, cls) : (T[]) this.d.getSpans(r3, r4, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.d.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int r2, int r3, Class cls) {
        return this.d.nextSpanTransition(r2, r3, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.g.removeSpan(obj);
        } else {
            this.d.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int r4, int r5, int r6) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.g.setSpan(obj, r4, r5, r6);
        } else {
            this.d.setSpan(obj, r4, r5, r6);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int r2, int r3) {
        return this.d.subSequence(r2, r3);
    }

    @Override // java.lang.CharSequence
    @h0
    public String toString() {
        return this.d.toString();
    }
}

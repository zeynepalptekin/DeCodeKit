package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b.a.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
class t0 extends b.j.b.c implements View.OnClickListener {
    private static final boolean F = false;
    private static final String G = "SuggestionsAdapter";
    private static final int H = 50;
    static final int I = 0;
    static final int J = 1;
    static final int K = 2;
    static final int L = -1;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private final SearchView r;
    private final SearchableInfo s;
    private final Context t;
    private final WeakHashMap<String, Drawable.ConstantState> u;
    private final int v;
    private boolean w;
    private int x;
    private ColorStateList y;
    private int z;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f195a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f196b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f197c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.f195a = (TextView) view.findViewById(R.id.text1);
            this.f196b = (TextView) view.findViewById(R.id.text2);
            this.f197c = (ImageView) view.findViewById(R.id.icon1);
            this.d = (ImageView) view.findViewById(R.id.icon2);
            this.e = (ImageView) view.findViewById(a.g.edit_query);
        }
    }

    public t0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.w = false;
        this.x = 1;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.r = searchView;
        this.s = searchableInfo;
        this.v = searchView.getSuggestionCommitIconResId();
        this.t = context;
        this.u = weakHashMap;
    }

    private Drawable A(Cursor cursor) {
        int r0 = this.D;
        if (r0 == -1) {
            return null;
        }
        return y(cursor.getString(r0));
    }

    private static String D(Cursor cursor, int r3) {
        if (r3 == -1) {
            return null;
        }
        try {
            return cursor.getString(r3);
        } catch (Exception e) {
            Log.e(G, "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    private void F(ImageView imageView, Drawable drawable, int r3) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(r3);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void G(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    private void H(String str, Drawable drawable) {
        if (drawable != null) {
            this.u.put(str, drawable.getConstantState());
        }
    }

    private void I(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    private Drawable p(String str) {
        Drawable.ConstantState constantState = this.u.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence r(CharSequence charSequence) {
        if (this.y == null) {
            TypedValue typedValue = new TypedValue();
            this.g.getTheme().resolveAttribute(a.b.textColorSearchUrl, typedValue, true);
            this.y = this.g.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.y, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable s(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.g.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e) {
            string = e.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        string = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w(G, string);
        return null;
    }

    private Drawable t(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.u.containsKey(strFlattenToShortString)) {
            Drawable drawableS = s(componentName);
            this.u.put(strFlattenToShortString, drawableS != null ? drawableS.getConstantState() : null);
            return drawableS;
        }
        Drawable.ConstantState constantState = this.u.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.t.getResources());
    }

    public static String u(Cursor cursor, String str) {
        return D(cursor, cursor.getColumnIndex(str));
    }

    private Drawable v() throws PackageManager.NameNotFoundException {
        Drawable drawableT = t(this.s.getSearchActivity());
        return drawableT != null ? drawableT : this.g.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable w(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return x(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.t.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e) {
                    Log.e(G, "Error closing icon stream for " + uri, e);
                }
            }
        } catch (FileNotFoundException e2) {
            Log.w(G, "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
        Log.w(G, "Icon not found: " + uri + ", " + e2.getMessage());
        return null;
    }

    private Drawable y(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int r1 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.t.getPackageName() + "/" + r1;
            Drawable drawableP = p(str2);
            if (drawableP != null) {
                return drawableP;
            }
            Drawable drawableH = b.i.c.c.h(this.t, r1);
            H(str2, drawableH);
            return drawableH;
        } catch (Resources.NotFoundException unused) {
            Log.w(G, "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableP2 = p(str);
            if (drawableP2 != null) {
                return drawableP2;
            }
            Drawable drawableW = w(Uri.parse(str));
            H(str, drawableW);
            return drawableW;
        }
    }

    private Drawable z(Cursor cursor) throws NumberFormatException, IOException {
        int r0 = this.C;
        if (r0 == -1) {
            return null;
        }
        Drawable drawableY = y(cursor.getString(r0));
        return drawableY != null ? drawableY : v();
    }

    public int B() {
        return this.x;
    }

    Cursor C(SearchableInfo searchableInfo, String str, int r12) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(FirebaseAnalytics.b.R).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (r12 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(r12));
        }
        return this.g.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void E(int r1) {
        this.x = r1;
    }

    @Override // b.j.b.a, b.j.b.b.a
    public CharSequence a(Cursor cursor) {
        String strU;
        String strU2;
        if (cursor == null) {
            return null;
        }
        String strU3 = u(cursor, "suggest_intent_query");
        if (strU3 != null) {
            return strU3;
        }
        if (this.s.shouldRewriteQueryFromData() && (strU2 = u(cursor, "suggest_intent_data")) != null) {
            return strU2;
        }
        if (!this.s.shouldRewriteQueryFromText() || (strU = u(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strU;
    }

    @Override // b.j.b.a, b.j.b.b.a
    public void b(Cursor cursor) {
        if (this.w) {
            Log.w(G, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.b(cursor);
            if (cursor != null) {
                this.z = cursor.getColumnIndex("suggest_text_1");
                this.A = cursor.getColumnIndex("suggest_text_2");
                this.B = cursor.getColumnIndex("suggest_text_2_url");
                this.C = cursor.getColumnIndex("suggest_icon_1");
                this.D = cursor.getColumnIndex("suggest_icon_2");
                this.E = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e(G, "error changing cursor and caching columns", e);
        }
    }

    @Override // b.j.b.a, b.j.b.b.a
    public Cursor d(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.r.getVisibility() == 0 && this.r.getWindowVisibility() == 0) {
            try {
                Cursor cursorC = C(this.s, string, 50);
                if (cursorC != null) {
                    cursorC.getCount();
                    return cursorC;
                }
            } catch (RuntimeException e) {
                Log.w(G, "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // b.j.b.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int r8 = this.E;
        int r82 = r8 != -1 ? cursor.getInt(r8) : 0;
        if (aVar.f195a != null) {
            G(aVar.f195a, D(cursor, this.z));
        }
        if (aVar.f196b != null) {
            String strD = D(cursor, this.B);
            CharSequence charSequenceR = strD != null ? r(strD) : D(cursor, this.A);
            if (TextUtils.isEmpty(charSequenceR)) {
                TextView textView = aVar.f195a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f195a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f195a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f195a.setMaxLines(1);
                }
            }
            G(aVar.f196b, charSequenceR);
        }
        ImageView imageView = aVar.f197c;
        if (imageView != null) {
            F(imageView, z(cursor), 4);
        }
        ImageView imageView2 = aVar.d;
        if (imageView2 != null) {
            F(imageView2, A(cursor), 8);
        }
        int r9 = this.x;
        if (r9 != 2 && (r9 != 1 || (r82 & 1) == 0)) {
            aVar.e.setVisibility(8);
            return;
        }
        aVar.e.setVisibility(0);
        aVar.e.setTag(aVar.f195a.getText());
        aVar.e.setOnClickListener(this);
    }

    @Override // b.j.b.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int r2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(r2, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(G, "Search suggestions cursor threw exception.", e);
            View viewI = i(this.g, this.f, viewGroup);
            if (viewI != null) {
                ((a) viewI.getTag()).f195a.setText(e.toString());
            }
            return viewI;
        }
    }

    @Override // b.j.b.a, android.widget.Adapter
    public View getView(int r2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(r2, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(G, "Search suggestions cursor threw exception.", e);
            View viewJ = j(this.g, this.f, viewGroup);
            if (viewJ != null) {
                ((a) viewJ.getTag()).f195a.setText(e.toString());
            }
            return viewJ;
        }
    }

    @Override // b.j.b.a, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // b.j.b.c, b.j.b.a
    public View j(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewJ = super.j(context, cursor, viewGroup);
        viewJ.setTag(new a(viewJ));
        ((ImageView) viewJ.findViewById(a.g.edit_query)).setImageResource(this.v);
        return viewJ;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        I(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        I(c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.r.b0((CharSequence) tag);
        }
    }

    public void q() {
        b(null);
        this.w = true;
    }

    Drawable x(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.g.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }
}

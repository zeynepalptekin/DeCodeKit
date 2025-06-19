package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.annotation.x0;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.widget.m;
import b.d.a;
import java.util.List;

/* loaded from: classes.dex */
class d implements AdapterView.OnItemClickListener {
    private static final String i = "BrowserActionskMenuUi";
    private final Context d;
    private final Uri e;
    private final List<androidx.browser.browseractions.a> f;
    c g;
    private androidx.browser.browseractions.c h;

    class a implements DialogInterface.OnShowListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f226a;

        a(View view) {
            this.f226a = view;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            d.this.g.a(this.f226a);
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ TextView d;

        b(TextView textView) {
            this.d = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextView textView;
            TextUtils.TruncateAt truncateAt;
            if (m.k(this.d) == Integer.MAX_VALUE) {
                this.d.setMaxLines(1);
                textView = this.d;
                truncateAt = TextUtils.TruncateAt.END;
            } else {
                this.d.setMaxLines(ActivityChooserView.f.j);
                textView = this.d;
                truncateAt = null;
            }
            textView.setEllipsize(truncateAt);
        }
    }

    @p0({p0.a.LIBRARY_GROUP})
    @x0
    interface c {
        void a(View view);
    }

    d(Context context, Uri uri, List<androidx.browser.browseractions.a> list) {
        this.d = context;
        this.e = uri;
        this.f = list;
    }

    private BrowserActionsFallbackMenuView b(View view) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) view.findViewById(a.e.browser_actions_menu_view);
        TextView textView = (TextView) view.findViewById(a.e.browser_actions_header_text);
        textView.setText(this.e.toString());
        textView.setOnClickListener(new b(textView));
        ListView listView = (ListView) view.findViewById(a.e.browser_actions_menu_items);
        listView.setAdapter((ListAdapter) new androidx.browser.browseractions.b(this.f, this.d));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }

    public void a() {
        View viewInflate = LayoutInflater.from(this.d).inflate(a.g.browser_actions_context_menu_page, (ViewGroup) null);
        androidx.browser.browseractions.c cVar = new androidx.browser.browseractions.c(this.d, b(viewInflate));
        this.h = cVar;
        cVar.setContentView(viewInflate);
        if (this.g != null) {
            this.h.setOnShowListener(new a(viewInflate));
        }
        this.h.show();
    }

    @p0({p0.a.LIBRARY_GROUP})
    @x0
    void c(c cVar) {
        this.g = cVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int r3, long j) throws PendingIntent.CanceledException {
        try {
            this.f.get(r3).a().send();
            this.h.dismiss();
        } catch (PendingIntent.CanceledException e) {
            Log.e(i, "Failed to send custom item action", e);
        }
    }
}

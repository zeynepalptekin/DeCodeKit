package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.tr;

/* loaded from: classes.dex */
final class m extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ j f2409a;

    m(j jVar) {
        this.f2409a = jVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f2409a.k != null) {
            try {
                this.f2409a.k.E(0);
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f2409a.N8())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (this.f2409a.k != null) {
                try {
                    this.f2409a.k.E(3);
                } catch (RemoteException e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
            this.f2409a.H8(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            if (this.f2409a.k != null) {
                try {
                    this.f2409a.k.E(0);
                } catch (RemoteException e2) {
                    tr.e("#007 Could not call remote method.", e2);
                }
            }
            this.f2409a.H8(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            if (this.f2409a.k != null) {
                try {
                    this.f2409a.k.u();
                } catch (RemoteException e3) {
                    tr.e("#007 Could not call remote method.", e3);
                }
            }
            this.f2409a.H8(this.f2409a.E8(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        if (this.f2409a.k != null) {
            try {
                this.f2409a.k.h();
            } catch (RemoteException e4) {
                tr.e("#007 Could not call remote method.", e4);
            }
        }
        this.f2409a.G8(this.f2409a.F8(str));
        return true;
    }
}

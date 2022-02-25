/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2017 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package ti.android.kenburnsview;

import android.app.Activity;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;

// This proxy can be created by calling Kenburnsview.createImageView({image: "...", interpolation: "..."})

@Kroll.proxy(creatableInModule = KenburnsviewModule.class, propertyAccessors = {
        "interpolation", "image"
})
public class ImageViewProxy extends TiViewProxy {
    // Constructor
    public ImageViewProxy() {
        super();
    }

    @Override
    public TiUIView createView(Activity activity) {
        TiUIView view = new KVView(this);
        view.getLayoutParams().autoFillsHeight = true;
        view.getLayoutParams().autoFillsWidth = true;
        return view;
    }

    protected KVView getView() {
        return (KVView) getOrCreateView();
    }

    // Handle creation options
    @Override
    public void handleCreationDict(KrollDict options) {
        super.handleCreationDict(options);
    }

    // Methods
    @Kroll.method
    public void pause() {
        getView().pause();
    }

    @Kroll.method
    public void resume() {
        getView().resume();
    }
}
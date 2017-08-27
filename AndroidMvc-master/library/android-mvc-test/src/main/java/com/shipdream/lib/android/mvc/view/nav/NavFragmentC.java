/*
 * Copyright 2016 Kejun Xia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shipdream.lib.android.mvc.view.nav;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.shipdream.lib.android.mvc.Controller;
import com.shipdream.lib.android.mvc.Reason;
import com.shipdream.lib.android.mvc.view.injection.controller.ControllerD;

import javax.inject.Inject;

public class NavFragmentC extends NavFragment{
    @Inject
    private DisposeCheckerC disposeCheckerC;

    @Override
    protected Class<? extends Controller> getNextFragmentLocId() {
        return ControllerD.class;
    }

    @Override
    protected Class getControllerClass() {
        return null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewReady(View view, Bundle savedInstanceState, Reason reason) {
        super.onViewReady(view, savedInstanceState, reason);
        Log.d("", "");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void update() {

    }
}

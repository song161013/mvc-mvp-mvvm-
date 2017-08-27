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

package com.shipdream.lib.android.mvc.samples.simple.mvvm.controller;

import com.shipdream.lib.android.mvc.samples.simple.mvvm.manager.CounterManager;

import javax.inject.Inject;

public class CounterMasterInsideController extends AbstractController {

    @Override
    public Class modelType() {
        return null;
    }

    @Inject
    private CounterManager counterManager;

    public String getCount() {
        return String.valueOf(counterManager.getModel().getCount());
    }

    public String getCountInEnglish() {
        return counterManager.convertNumberToEnglish(counterManager.getModel().getCount());
    }

    private void onEvent(CounterManager.Event2C.OnCounterUpdated event) {
        if (view != null) {
            view.update();
        }
    }

}

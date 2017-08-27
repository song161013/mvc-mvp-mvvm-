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

package com.shipdream.lib.android.mvc.view.injection.manager;

import com.shipdream.lib.android.mvc.Manager;
import com.shipdream.lib.android.mvc.view.injection.service.StorageService;

import javax.inject.Inject;

public class AccountManager extends Manager<AccountManager.Session> {
    public static class Session {
        private long userId;

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }
    }

    @Inject
    private StorageService storageService;

    public void setUserId(long id) {
        getModel().setUserId(id);
    }

    public long getUserId() {
        return getModel().getUserId();
    }

    public String getContent() {
        return storageService.getContent();
    }

    public void setContent(String content) {
        storageService.setContent(content);
    }

    @Override
    public Class<Session> modelType() {
        return Session.class;
    }
}

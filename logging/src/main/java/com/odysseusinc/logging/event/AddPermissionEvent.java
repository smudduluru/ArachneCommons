/*
 *
 * Copyright 2018 Odysseus Data Services, inc.
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
 *
 * Company: Odysseus Data Services, Inc.
 * Product Owner/Architecture: Gregory Klebanov
 * Authors: Anastasiia Klochkova
 * Created: August 31, 2018
 *
 */

package com.odysseusinc.logging.event;

import com.odysseusinc.logging.LogLevel;

public class AddPermissionEvent extends LoggingEvent {
    private long permissionId;
    private long roleId;

    public AddPermissionEvent(Object source, LogLevel logLevel, long permissionId, long roleId) {
        super(source, logLevel);
        this.permissionId = permissionId;
        this.roleId = roleId;
    }

    public AddPermissionEvent(Object source, long permissionId, long roleId) {
        this(source, LogLevel.INFO, permissionId, roleId);
    }

    public long getPermissionId() {
        return permissionId;
    }

    public long getRoleId() {
        return roleId;
    }
}

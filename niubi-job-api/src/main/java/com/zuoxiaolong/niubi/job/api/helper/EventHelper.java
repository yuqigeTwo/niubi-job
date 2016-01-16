/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zuoxiaolong.niubi.job.api.helper;

import org.apache.curator.framework.recipes.cache.PathChildrenCacheEvent;

/**
 * @author Xiaolong Zuo
 * @since 16/1/13 22:22
 */
public abstract class EventHelper {

    public static boolean isChildAddEvent(PathChildrenCacheEvent event) {
        return event != null && event.getType() == PathChildrenCacheEvent.Type.CHILD_ADDED;
    }

    public static boolean isChildUpdateEvent(PathChildrenCacheEvent event) {
        return event != null && event.getType() == PathChildrenCacheEvent.Type.CHILD_UPDATED;
    }

    public static boolean isChildRemoveEvent(PathChildrenCacheEvent event) {
        return event != null && event.getType() == PathChildrenCacheEvent.Type.CHILD_REMOVED;
    }

    public static boolean isChildModifyEvent(PathChildrenCacheEvent event) {
        return isChildAddEvent(event) || isChildRemoveEvent(event) || isChildUpdateEvent(event);
    }

}

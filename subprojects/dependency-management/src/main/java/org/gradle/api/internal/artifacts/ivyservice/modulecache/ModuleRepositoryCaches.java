/*
 * Copyright 2018 the original author or authors.
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
package org.gradle.api.internal.artifacts.ivyservice.modulecache;

import org.gradle.api.internal.artifacts.ivyservice.modulecache.artifacts.ModuleArtifactCache;
import org.gradle.api.internal.artifacts.ivyservice.modulecache.artifacts.ModuleArtifactsCache;
import org.gradle.api.internal.artifacts.ivyservice.modulecache.dynamicversions.ModuleVersionsCache;
import org.gradle.internal.resource.local.FileAccessTracker;

public class ModuleRepositoryCaches {
    public final ModuleVersionsCache moduleVersionsCache;
    public final ModuleMetadataCache moduleMetadataCache;
    public final ModuleArtifactsCache moduleArtifactsCache;
    public final ModuleArtifactCache moduleArtifactCache;
    public final FileAccessTracker fileAccessTracker;

    public ModuleRepositoryCaches(ModuleVersionsCache moduleVersionsCache, ModuleMetadataCache moduleMetadataCache, ModuleArtifactsCache moduleArtifactsCache, ModuleArtifactCache moduleArtifactCache, FileAccessTracker fileAccessTracker) {
        this.moduleVersionsCache = moduleVersionsCache;
        this.moduleMetadataCache = moduleMetadataCache;
        this.moduleArtifactsCache = moduleArtifactsCache;
        this.moduleArtifactCache = moduleArtifactCache;
        this.fileAccessTracker = fileAccessTracker;
    }
}
